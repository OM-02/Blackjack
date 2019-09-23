public class Main {
    public static void main(String[] args) {
        // User welcome message
        System.out.println("---\nWelcome to blackjack! This project\nis a slow and steady work in progress\nthat will hopefully continue to\nimprove over time.\n---");

        // Creates a dealer objects and ouputs the second card picked up by the dealer
        Dealer c = new Dealer();
        System.out.println("Dealer's card: " + c.getDealerTopCard() + "\n");

        // Creates a player object
        Player b = new Player();

        // Deals the dealer's cards after the player's cards have been dealt
        c.getDealerCard();

        // Integers for player and dealer card total values, simplifies win checking
        int pTotal = b.playerTotal(), dTotal = c.dealerTotal();

        // Checks for who won the deal
        if      (pTotal <= 21 && pTotal > dTotal)  System.out.println("Dealer had: " + dTotal + "\nYou win!");
        else if (pTotal <= 21 && dTotal > 21)      System.out.println("Dealer had: " + dTotal + "\nYou win!");
        else if (pTotal > 21);
        else if (pTotal <= 21 && pTotal == dTotal) System.out.println("Dealer had: " + dTotal + "\nIt's a draw!");
        else System.out.println("Dealer had: " + dTotal + "\nYou lost!");
    }
}