package D0906_BasicJava_2Days;

import java.util.Scanner;

public class OddEven {

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static void main(String[] args) {
        System.out.println("Please type a number: ");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (isOdd(number)) {
            System.out.println("That is odd.");
        } else {
            System.out.println("That is even.");
        }

    }

}
