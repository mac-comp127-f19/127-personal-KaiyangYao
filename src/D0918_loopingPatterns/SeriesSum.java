package D0918_loopingPatterns;

/**
 * A program that will sum up the series ½ + ⅓ + ¼ + ⅕ + … + 1/10 and print the total.
 * <p>
 * Re-visited and edited by Adam Yao on 2020.3.18
 */
public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 2; i <= 10; i++) {
            sum += (1.0 / (i));
        }

        System.out.println(sum);
    }
}
