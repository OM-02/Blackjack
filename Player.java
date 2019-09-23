import java.util.Scanner;

public class Player {
    // Boolean for the run state of whether the player is taking more hits or staying
    static boolean running = true;

    // Deals the player a hand
    static Blackjack b = new Blackjack(true);

    // Static initializer block that handles all things related to the player's hand
    static {
        // Checks for an instant win with ace and face or 10 card
        if (b.getTotal() == 21) {
            System.out.println("Blackjack!");
            running = false;
        }

        // Scanner for user input
        Scanner keyboard = new Scanner(System.in);

        // While loop that runs until the player busts or stays
        while (running) {
            System.out.println("Hit or stay?");
            String choice = keyboard.nextLine();

            // Switch statement that checks for hit or stay
            switch (choice.toLowerCase()) {
                case "hit":
                b.getCard();
                b.getHand();
                b.checkAces();
                int x = b.getTotal();
                if (x > 21) {
                    System.out.println("Bust!");
                    running = false;
                } else if (x == 21) {
                    System.out.println("Blackjack!");
                    running = false;
                }
                break;

                case "stay":
                b.stay();
                running = false;
                break;
            }
        }
        // Closes the scanner so that there isn't a resource leak
        keyboard.close();
    }

    // Getter method for the player's total card value
    public int playerTotal() {
        return b.getTotal();
    }
}