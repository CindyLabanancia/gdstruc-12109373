package GamePackage;

import GamePackage.Card.Card;
import GamePackage.Card.Deck;

import java.util.Stack;

public class Player {

    private final String name;
    private final Deck deck;

    public Player(String name) {
        this.name = name;
        Stack<Card> stack = new Stack<>();
        stack.addAll(Deck.generateCards());
        this.deck = new Deck(stack);
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
