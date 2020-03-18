package D0918_loopingPatterns;

import java.util.Scanner;

/**
 * Ask the user what size pyramid they would like you to draw. Then using a combination of loops, draw the pyramid.
 * <p>
 * Re-visited and edited by Adam Yao on 2020.3.18
 */
public class DrawPyramid {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter the size of the pyramid: ");
            int size = scan.nextInt();

            int numPerRow = 1;
            for (int i = 1; i <= size; i++) {
                for (int space = i; space < size; space++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < numPerRow; j++) {
                    System.out.print("* ");
                }
                numPerRow += 2;
                System.out.println("");
            }
        }
    }
}
