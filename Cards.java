public class Cards {
    private int rank;
    private int suit;

    public Cards(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static final String[] SUITS = {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};

    public String cardName() {
        return RANKS[this.rank] + "-" + SUITS[this.suit];
    }

    public int getRank() {
        return this.rank;
    }
}