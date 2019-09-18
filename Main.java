import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean running = true;
        Blackjack b = new Blackjack();
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
        keyboard.close();
    }
}