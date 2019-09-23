import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean running = true;
        Blackjack b = new Blackjack(true);
        int a = b.getTotal();
        if (a == 21) {
            System.out.println("Blackjack!");
            running = false;
        }
        Scanner keyboard = new Scanner(System.in);

        while (running) {
            System.out.println("Hit or stay?");
            String choice = keyboard.nextLine();

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
        Computer c = new Computer();

        if (b.getTotal() <= 21 && b.getTotal() >= c.computerTotal()) {
            System.out.println("Dealer had: " + c.computerTotal());
            System.out.println("You win!");
        } else if (b.getTotal() <= 21 && c.computerTotal() > 21) {
            System.out.println("Dealer had: " + c.computerTotal());
            System.out.println("You win!");
        } else if (b.getTotal() > 21) {

        } else {
            System.out.println("Sorry, you lost!");
        }

        keyboard.close();
    }
}