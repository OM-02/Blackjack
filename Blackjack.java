import java.util.ArrayList;
import java.util.Collections;

public class Blackjack {

    // ArrayLists for keeping track of the player's hand and hand value
    private ArrayList<String> playerCards = new ArrayList<String>();
    private ArrayList<Integer> playerCardVals = new ArrayList<Integer>();

    // Initializes the player's total hand value
    private int playerTotal = 0;

    // Static integer for keeping track of which card in the deck is next to be dealt
    private static int deckLocation = 0;

    // Boolean for whether it is a player or the dealer being referred to
    private boolean isPlayer;

    // Constructor method that deals two cards, as well as outputs the player's hand if the player is not the dealer
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

    // Getter method for the cards in the player's hand
    public void getHand() {
        System.out.println("Your hand is now: " + this.playerCards + "\n---");
    }

    // Method for dealing a card
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

    // Method that deals with whether the aces need to be a 1 or an 11
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

    // Returns the player's total card values
    public int getTotal() {
        return this.playerTotal;
    }

    // Outputs the player's total hand value when the player stays
    public void stay() {
        System.out.println("Your total was: " + this.playerTotal);
    }

    // Method for generating a random number
    public int getRandom() {
        return (int) ((Math.random()*14) - 1);
    }

    // Method for getting a card at position i in a player's hand
    public String getTopCard(int i) {
        return this.playerCards.get(i);
    }
}