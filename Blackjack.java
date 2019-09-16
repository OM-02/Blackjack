import java.util.*;

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
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deck.add(new Cards(rank, suit));
                index++;
            }
        }
        Collections.shuffle(deck);  
    }


    public void getHand() {
        System.out.println("Your hand is now: " + playerCards);
    }

    public void getCard() {
        playerCards.add(deck.get(deckLocation).cardName());
        if (deck.get(deckLocation).getRank() >= 10) {
            playerTotal += 10;
            playerCardVals.add(10);
        } else if (deck.get(deckLocation).getRank() == 1) {
            playerTotal += 11;
            playerCardVals.add(11);
        } else {
            playerTotal += deck.get(deckLocation).getRank();
            playerCardVals.add(deck.get(deckLocation).getRank());
        }
        deckLocation++;
        System.out.println("You were dealt: " + deck.get(deckLocation).cardName());
    }

    public void checkAces() {
        int i = 0;
        while (playerTotal > 21 && i < playerCardVals.size()) {
            if (playerCardVals.get(i) == 11) {
                playerCardVals.set(i, 1);
                playerTotal -= 10;
            }
            i++;
        }
    }

    public int getTotal() {
        return playerTotal;
    }

    public void stay() {
        System.out.println("Your total was: " + playerTotal);
    }

    public int getRandom() {
        return (int) ((Math.random()*14) - 1);
    }
}