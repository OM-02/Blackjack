import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean running = true;
        Blackjack b = new Blackjack();

        while (running) {
            Scanner keyboard = new Scanner(System.in);
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

    }
}