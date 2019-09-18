import java.util.ArrayList;
import java.util.Collections;

public class Blackjack {
    private ArrayList<String> playerCards = new ArrayList<String>();
    private ArrayList<Integer> playerCardVals = new ArrayList<Integer>();
    private int playerTotal = 0;
    private int deckLocation = 0;

    public Blackjack() {
        this.getCard();
        this.getCard();
        this.getHand();
        this.checkAces();
    }

    // Deck initializer block
    private static ArrayList<Cards> deck = new ArrayList<Cards>();
    static {
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deck.add(new Cards(rank, suit));
            }
        }
        Collections.shuffle(deck);  
    }


    public void getHand() {
        System.out.println("Your hand is now: " + this.playerCards);
    }

    public void getCard() {
        this.playerCards.add(deck.get(deckLocation).cardName());
        if (deck.get(deckLocation).getRank() >= 10) {
            this.playerTotal += 10;
            this.playerCardVals.add(10);
        } else if (deck.get(deckLocation).getRank() == 1) {
            this.playerTotal += 11;
            this.playerCardVals.add(11);
        } else {
            this.playerTotal += deck.get(deckLocation).getRank();
            this.playerCardVals.add(deck.get(deckLocation).getRank());
        }
        System.out.println("You were dealt: " + deck.get(deckLocation).cardName());
        deckLocation++;
    }

    public void checkAces() {
        int i = 0;
        while (playerTotal > 21 && i < playerCardVals.size()) {
            if (playerCardVals.get(i) == 11) {
                this.playerCardVals.set(i, 1);
                this.playerTotal -= 10;
            }
            i++;
        }
    }

    public int getTotal() {
        return this.playerTotal;
    }

    public void stay() {
        System.out.println("Your total was: " + this.playerTotal);
    }

    public int getRandom() {
        return (int) ((Math.random()*14) - 1);
    }
}