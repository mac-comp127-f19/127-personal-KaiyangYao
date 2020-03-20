package D1002_inkblotDrawing;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int currentValue;
    private int min;
    private int max;

    /**
     * Creates a new random walk starting with some initial value.
     * Adjust this constructor to take an initial value for the walk.
     */
    public RandomWalk(int initialValue, int min, int max) {
        rng = new Random();
        currentValue = initialValue;
        this.min = min;
        this.max = max;
    }

    /**
     * @return the current value for the random walk.
     */
    public int getValue() {
        return currentValue;
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     *
     * @return Updated value.
     */
    public int advanceValue() {
        if(rng.nextBoolean()) {
            if (currentValue + 1 > max) {
                currentValue /= 2;
            } else {
                currentValue += 1;
            }
            return getValue();
        } else {
            if (currentValue - 1 < min) {
                currentValue *= (currentValue + 1);
            } else {
                currentValue -= 1;
            }
            return getValue();
        }
    }
}

