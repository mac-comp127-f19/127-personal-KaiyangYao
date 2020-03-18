package D0918_loopingPatterns;

import java.util.Scanner;

/**
 * Looping activities.
 * <p>
 * Re-visited and edited by Adam Yao on 2020.3.18
 */
public class SentinelDrills {

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("Please type a number, or 'stop': ");

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            int number = Integer.parseInt(input);
            if (isOdd(number)) {
                System.out.println("That is odd.");
            } else {
                System.out.println("That is even.");
            }
        }

        while (true) {
            System.out.println("Please enter a number, or 'stop': ");

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            int number = Integer.parseInt(input);

            int count = 0;
            while (number / 2 >= 1) {
                number /= 2;
                count++;
            }

            System.out.println("This number can be repeatedly divided by 2 for " + count + " times to get down to 1");
        }

    }
}
