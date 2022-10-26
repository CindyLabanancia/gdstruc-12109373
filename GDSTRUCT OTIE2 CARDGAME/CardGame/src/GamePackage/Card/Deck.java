package GamePackage.Card;

import java.util.Collection;
import java.util.Stack;
import java.util.stream.Collectors;

public class Deck {

    private final Stack<Card> cardList;
    private final Stack<Card> discardedCardList;
    private final Stack<Card> cardOnHandList;

    public Deck(Stack<Card> cardList) {
        this.cardList = cardList;
        this.discardedCardList = new Stack<>();
        this.cardOnHandList = new Stack<>();
    }

    public Stack<Card> getCardOnDeck() {
        return cardList;
    }

    private void drawCard(int times) {
        for(int i = 0; i < times; i++) {
            Card card = getCardOnDeck().peek();
            cardOnHandList.push(card);
            if(getCardOnDeck().size() >= 1) {
                getCardOnDeck().pop();
            }
        }
    }

    private void discardCard(int times) {
        for(int i = 0; i < times; i++) {
            Card card = getCardOnHandList().peek();
            discardedCardList.push(card);
            if(getCardOnHandList().size() >= 1) {
                getCardOnHandList().pop();
            }
        }
    }

    private void retrieveCard(int times) {
        for(int i = 0; i < times; i++) {
            Card card = getDiscardedCardList().get(0);
            cardOnHandList.push(card);
            if(getDiscardedCardList().size() >= 1) {
                getDiscardedCardList().pop();
            }
        }
    }

    public boolean isEmpty() {
        return cardList.isEmpty();
    }

    private boolean canDraw(int number) {
        return cardList.size() >= number;
    }

    private boolean canDiscard(int number) {
        return cardOnHandList.size() >= number;
    }

    private boolean canRetrieve(int number) {
        return discardedCardList.size() >= number;
    }

    public boolean discard(int number) {
        if(!canDiscard(number)) {
            return false;
        }
        discardCard(number);
        return true;
    }
    public boolean draw(int number) {
        if(!canDraw(number)) {
            return false;
        }
        drawCard(number);
        return true;
    }

    public boolean retrieve(int number) {
        if(!canRetrieve(number)) {
            return false;
        }
        retrieveCard(number);
        return true;
    }

    public Stack<Card> getCardOnHandList() {
        return cardOnHandList;
    }

    public Stack<Card> getDiscardedCardList() {
        return discardedCardList;
    }

    public static Collection<Card> generateCards() {
        return Cards.getNames()
                .stream()
                .map(cardName -> {
                    Card card = new Card(cardName);
                    return card;
                }).collect(Collectors.toList());
    }
}
