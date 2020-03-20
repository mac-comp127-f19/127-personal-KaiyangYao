package D0930_diceActivity;

import java.util.Random;

/**
 * A single die that can roll values between 1 and 6.
 * <p>
 * Re-visited and edited by Adam Yao on 2020.3.18
 */
public class Die {
    private static final int DEFAULT_MAX_VALUE = 6;

    private final int maxValue;
    private int value;

    // First Constructor
    public Die() {
        this(DEFAULT_MAX_VALUE);
        value = -1;
    }

    // Second Constructor
    public Die(int maxValue) {
        this.maxValue = maxValue;
    }

    public void roll() {
        Random random = new Random();
        // value = random.nextInt(DEFAULT_MAX_VALUE) + 1;
        value = random.nextInt(maxValue) + 1;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (value == 1) {
            return "one";
        } else if (value == 2) {
            return "two";
        } else if (value == 3) {
            return "three";
        } else if (value == 4) {
            return "four";
        } else if (value == 5) {
            return "five";
        } else if (value == 6) {
            return "six";
        } else {
            return "unknown";
        }
    }
}
