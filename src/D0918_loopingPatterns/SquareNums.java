package D0918_loopingPatterns;

import java.util.Scanner;

/**
 * a program to repeatedly ask the user for a number, print out the square of the number,
 * and stop if the square of the number is divisible by 4.
 * <p>
 * Re-visited and edited by Adam Yao on 2020.3.18
 */
public class SquareNums {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter a number: ");
            int number = scan.nextInt();
            int square = number * number;

            if (square % 4 == 0) {
                break;
            } else {
                System.out.println(square);
            }
        }
    }
}
