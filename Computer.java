public class Computer {
    static Blackjack c = new Blackjack(false);
    static {
        while (c.getTotal() < 16) {
            c.getCard();
        }
        System.out.println("Computer had: " + c.getTotal());
    }

    public int computerTotal() {
        return c.getTotal();
    }
}