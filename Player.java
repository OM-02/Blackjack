import java.util.Scanner;

public class Player {
    static boolean running = true;
    static Blackjack b = new Blackjack(true);

    static {
        if (b.getTotal() == 21) {
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

    public int playerTotal() {
        return b.getTotal();
    }
}