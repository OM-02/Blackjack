public class Cards {
    // Values for a card object's rank and suit
    private int rank, suit;

    // Constructor that gives a card a rank and a suit
    public Cards(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Final arrays that hold all the ranks and suits that a card can be
    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static final String[] SUITS = {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};

    // Generates a name for the card object
    public String cardName() {
        return RANKS[this.rank] + "-" + SUITS[this.suit];
    }

    // Getter method for a card object's rank
    public int getRank() {
        return this.rank;
    }
}