package GamePackage;

import GamePackage.Card.Card;
import GamePackage.Card.Deck;

import java.util.List;

public class Player {

    private final String name;
    private final Deck deck;

    public Player(String name) {
        this.name = name;
        this.deck = new Deck((List<Card>) Deck.generateCards());
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        System.out.println(message);
    }

    public void sendError(String message) {
        System.err.println(message);
    }

    public Deck getDeck() {
        return deck;
    }
}
