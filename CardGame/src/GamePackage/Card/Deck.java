package GamePackage.Card;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Deck {

    private final List<Card> cardList;
    private final List<Card> discardedCardList;
    private final List<Card> cardOnHandList;

    public Deck(List<Card> cardList) {
        this.cardList = cardList;
        this.discardedCardList = new ArrayList<>();
        this.cardOnHandList = new ArrayList<>();
    }

    public List<Card> getCardOnDeck() {
        return cardList;
    }

    private void drawCard(int times) {
        for(int i = 0; i < times; i++) {
            Card card = getCardOnDeck().get(0);
            cardOnHandList.add(card);
            if(getCardOnDeck().size() >= 1) {
                getCardOnDeck().remove(0);
            }
        }
    }

    private void discardCard(int times) {
        for(int i = 0; i < times; i++) {
            Card card = getCardOnHandList().get(0);
            discardedCardList.add(card);
            if(getCardOnHandList().size() >= 1) {
                getCardOnHandList().remove(0);
            }
        }
    }

    private void retrieveCard(int times) {
        for(int i = 0; i < times; i++) {
            Card card = getDiscardedCardList().get(0);
            cardOnHandList.add(card);
            if(getDiscardedCardList().size() >= 1) {
                getDiscardedCardList().remove(0);
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

    public List<Card> getCardOnHandList() {
        return cardOnHandList;
    }

    public List<Card> getDiscardedCardList() {
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
