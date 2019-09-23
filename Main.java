public class Main {
    public static void main(String[] args) {
        System.out.println("---\nWelcome to blackjack! This project\nis a slow and steady work in progress\nthat will hopefully continue to\nimprove over time.\n---");

        Dealer c = new Dealer();
        System.out.println("Dealer's card: " + c.getDealerTopCard() + "\n");

        Player b = new Player();
        int pTotal = b.playerTotal(), dTotal = c.dealerTotal();

        if      (pTotal <= 21 && pTotal > dTotal) System.out.println("Dealer had: " + dTotal + "\nYou win!");
        else if (pTotal <= 21 && dTotal > 21) System.out.println("Dealer had: " + dTotal + "\nYou win!");
        else if (pTotal > 21);
        else if (pTotal <= 21 && pTotal == dTotal) System.out.println("Dealer had: " + dTotal + "\nIt's a draw!");
        else System.out.println("Dealer had: " + dTotal + "\nYou lost!");
    }
}