public class Dealer {
    static Blackjack c = new Blackjack(false);
    static {
        while (c.getTotal() < 16) {
            c.getCard();
        }
    }

    public int dealerTotal() {
        return c.getTotal();
    }

    public String getDealerTopCard() {
        return c.getTopCard(1);
    }
}