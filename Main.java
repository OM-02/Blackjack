import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean running = true;
        Blackjack b = new Blackjack();

        // Deck initializer block
        ArrayList<Cards> deck = new ArrayList<Cards>();
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deck.add(new Cards(rank, suit));
                index++;
            }
        }
        Collections.shuffle(deck);

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
            keyboard.close();
        }

    }
}