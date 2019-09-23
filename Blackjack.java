import java.util.ArrayList;
import java.util.Collections;

public class Blackjack {
    private ArrayList<String> playerCards = new ArrayList<String>();
    private ArrayList<Integer> playerCardVals = new ArrayList<Integer>();
    private int playerTotal = 0;
    private static int deckLocation = 0;
    private boolean isPlayer;

    public Blackjack(boolean isPlayer) {
        this.isPlayer = isPlayer;
        this.getCard();
        this.getCard();
        if (this.isPlayer) {
            this.getHand();
        }
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
        int rankGet = deck.get(deckLocation).getRank();
        if (rankGet >= 10) {
            this.playerTotal += 10;
            this.playerCardVals.add(10);
        } else if (rankGet == 1) {
            this.playerTotal += 11;
            this.playerCardVals.add(11);
        } else {
            this.playerTotal += rankGet;
            this.playerCardVals.add(rankGet);
        }

        if (this.isPlayer) {
            System.out.println("You were dealt: " + deck.get(deckLocation).cardName());
        }
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