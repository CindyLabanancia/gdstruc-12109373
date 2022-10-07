package GamePackage;

import Util.*;

public class Game {

    private final Player player;
    private final SystemInput systemInput;

    public Game(Player player) {
        this.player = player;
        this.systemInput = new SystemInput();
    }

    public void start() {
        player.sendMessage("[Card Game]");
        player.sendMessage("Game has started!");
        player.sendMessage(" Welcome to the card game: " + player.getName());
        while(true) {
            player.sendMessage("######################");
            player.sendMessage("                  ");
            player.sendMessage("# Pick a card by typing /draw <number>");
            player.sendMessage("# Discard a card by typing /discard <number>");
            player.sendMessage("# Get cards from discarded pile /retrieve <number>");
            player.sendMessage("                  ");
            player.sendMessage("######################");
            player.sendMessage(" Please type your command! ");
            systemInput.readCommand();

            if(systemInput.lastCommandUnknown()) {
                player.sendMessage("Unknown command");
                continue;
            }

            if(systemInput.getLastCommand().equals("draw")) {
                if(!Util.isInt(systemInput.getArgument(0))) {
                    player.sendMessage("The argument must be a number!");
                    continue;
                }
                int toDraw = Util.convertToInt(systemInput.getArgument(0));
                if(toDraw > 5 || toDraw < 1) {
                    player.sendMessage("[ERROR] Please input only numbers from 1 - 5");
                    continue;
                }
                if(player.getDeck().draw(toDraw)) {
                    player.sendMessage("You drawn " + toDraw + " cards!");
                    showInformation();
                } else {
                    player.sendMessage("Your deck is lower than what you are trying to draw!");
                    showInformation();
                }
                continue;
            }

            if(systemInput.getLastCommand().equals("discard")) {
                if(!Util.isInt(systemInput.getArgument(0))) {
                    player.sendMessage("The argument must be a number!");
                    continue;
                }
                int toDiscard = Util.convertToInt(systemInput.getArgument(0));
                if(player.getDeck().discard(toDiscard)) {
                    player.sendMessage("You discarded " + toDiscard + " cards!");
                    showInformation();
                } else {
                    player.sendMessage("Your hand is lower than what you are trying to discard!");
                    showInformation();
                }
                if(player.getDeck().getCardOnHandList().isEmpty()) {
                    showLastInformation();
                    break;
                }
                continue;
            }

            if(systemInput.getLastCommand().equals("retrieve")) {
                if (!Util.isInt(systemInput.getArgument(0))) {
                    player.sendMessage("The argument must be a number!");
                    continue;
                }
                int toRetrieve = Util.convertToInt(systemInput.getArgument(0));
                if (player.getDeck().retrieve(toRetrieve)) {
                    player.sendMessage("You retrieved " + toRetrieve + " cards!");
                    showInformation();
                } else {
                    player.sendMessage("Discarded pile is lower than what you are trying to retrieve!");
                    showInformation();
                }
            }
        }
    }


    private void showInformation() {
        player.sendMessage(" ");
        player.sendMessage("######################");
        player.sendMessage(" ");
        player.sendMessage("Your Hand:");
        player.getDeck().getCardOnHandList()
                .forEach(c -> {
                    player.sendMessage(" - " + c.getName());
                });
        player.sendMessage(" ");

        player.sendMessage("######################");
        player.sendMessage(" ");
        player.sendMessage("Number of cards on deck: " + player.getDeck().getCardOnDeck().size());
        player.sendMessage("Number of cards on discarded pile: " + player.getDeck().getDiscardedCardList().size());
        player.sendMessage(" ");
        player.sendMessage("######################");
        player.sendMessage(" ");
    }

    private void showLastInformation() {
        player.sendMessage(" ");
        player.sendMessage("######################");
        player.sendMessage(" ");
        player.sendMessage("Your Hand is empty");
        player.getDeck().getCardOnHandList()
                .forEach(c -> {
                    player.sendMessage(" - " + c.getName());
                });
        player.sendMessage(" ");

        player.sendMessage("######################");
        player.sendMessage(" ");
        player.sendMessage("Game has ended!");
        player.sendMessage("Thank you for playing the Game " + player.getName());
        player.sendMessage(" ");
        player.sendMessage("######################");
        player.sendMessage(" ");
    }
}
