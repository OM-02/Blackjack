import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Bets {
    // Creates two BigDecimals for keeping track of the initial bet and the possible win payout
    private BigDecimal playerBet, win =  new BigDecimal("1.5");

    // Creates a currency format for USD
    private static NumberFormat usd = NumberFormat.getCurrencyInstance();

    // Constructor for the player's bet
    public Bets() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Make a bet!");
        this.playerBet = keyboard.nextBigDecimal();
        System.out.println("You bet: $" + this.playerBet + "\n");
    }

    // Getter method for the player's initial bet
    public String getBet() {
        return usd.format(this.playerBet);
    }

    // Getter method for the win payout
    public String betWin() {
        return usd.format(this.playerBet.multiply(win));
    }
}