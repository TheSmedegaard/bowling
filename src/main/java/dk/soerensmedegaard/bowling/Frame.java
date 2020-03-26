package dk.soerensmedegaard.bowling;

/**
 *
 * @author Søren Smedegaard
 */
public class Frame {
    private final int roll1;
    private final int roll2;
    private final int sum;

    public Frame(int roll1, int roll2) {
        this.roll1 = roll1;
        this.roll2 = roll2;
        this.sum = roll1 + roll2;
    }

    public int getRoll1() {
        return roll1;
    }

    public int getRoll2() {
        return roll2;
    }

    public int getSum() {
        return sum;
    }
}
