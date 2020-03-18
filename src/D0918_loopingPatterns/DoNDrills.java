package D0918_loopingPatterns;

/**
 * Looping activities.
 * <p>
 * Re-visited and edited by Adam Yao on 2020.3.18
 */
public class DoNDrills {
    public static void main(String[] args) {

        // Print the numbers 0...9
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");


        // Print the numbers 10...0
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");


        // Print the numbers 1,2,4,8,16,32,64,128,256 (as integers; don’t use Math.pow())
        for (int i = 1; i <= 256; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println("");


        // Print the numbers 0,1,3,7,15,31,63,127,255
        for (int i = 1; i <= 256; i *= 2) {
            System.out.print(i - 1 + " ");
        }
        System.out.println("");


        // Print the square roots of the first 25 odd positive integers.
        for (int i = 1; i <= 50; i += 2) {
            System.out.print(Math.sqrt(i) + " ");
        }
        System.out.println("");
    }
}
