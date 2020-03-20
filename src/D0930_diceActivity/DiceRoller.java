package D0930_diceActivity;

/**
 * Main driver program for dice example.
 * <p>
 * Re-visited and edited by Adam Yao on 2020.3.18
 */
public class DiceRoller {
    public static void main(String[] args) {

        Die die1 = new Die();
        for (int i = 0; i < 10; i++) {
            die1.roll();
            System.out.println("Roll " + (i + 1) + " generated a " + die1); // No need to call toString() here!!
        }

        Die die2 = new Die();

        int matches = 0;
        for (int i = 0; i < 1000000; i++) {
            die1.roll();
            die2.roll();
            if (die1.getValue() == die2.getValue()) {
                matches++;
            }
        }
        System.out.println("In 1,000,000 rolls, two dice agreed " + matches + " times"
                + " which is " + (double) matches / 1000000 + " %");
        System.out.println("Statistically speaking, the percentage should be 6 / (6 * 6) = " + (double) 6 / (6 * 6)
                + " which is 6 chances that two dies have the same value divided by the total 36 different chances.");
    }
}
