import java.util.*;

public class Blackjack {
    private String[] cards = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private ArrayList<String> playerCards = new ArrayList<String>();
    private ArrayList<Integer> playerCardVals = new ArrayList<Integer>();
    private int playerTotal = 0;

    public Blackjack() {
        this.getCard();
        this.getCard();
        this.getHand();
        this.checkAces();
    }

    public void getHand() {
        System.out.println("Your hand is now: " + playerCards);
    }

    public void getCard() {
        int x = getRandom();
        playerCards.add(cards[x]);
        if (x >= 9) {
            playerTotal += 10;
            playerCardVals.add(10);
        } else if (x == 0) {
            playerTotal += 11;
            playerCardVals.add(11);
        } else {
            playerTotal += x+1;
            playerCardVals.add(x+1);
        }

        System.out.println("You were dealt: " + cards[x]);
    }

    public void checkAces() {
        int i = 0;
        while (playerTotal > 21 && i < playerCardVals.size()) {
            if (playerCardVals.get(i) == 11) {
                playerCardVals.set(i, 1);
                playerTotal -= 10;
            }
            i++;
        }
    }

    public int getTotal() {
        return playerTotal;
    }

    public void stay() {
        System.out.println("Your total was: " + playerTotal);
    }

    public int getRandom() {
        return (int) ((Math.random()*14) - 1);
    }
}