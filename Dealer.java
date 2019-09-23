public class Dealer {
    // Deals a hand for the dealer
    static Blackjack c = new Blackjack(false);

    // Static initializer that causes the dealer to draw until it has a total of 16 or more
    public void getDealerCard() {
        while (c.getTotal() <= 16) {
            c.getCard();
        }
    }

    // Getter method for the dealer's total card value
    public int dealerTotal() {
        return c.getTotal();
    }

    // Getter method for the dealer's flipped card
    public String getDealerTopCard() {
        return c.getTopCard(1);
    }
}