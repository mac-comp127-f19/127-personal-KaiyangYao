package D0918_loopingPatterns;

/**
 * Print out the multiplication tables for the numbers 1-9 using nested loops.
 * <p>
 * Re-visited and edited by Adam Yao on 2020.3.18
 */
public class MultTables {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(" ");
        }
    }
}
