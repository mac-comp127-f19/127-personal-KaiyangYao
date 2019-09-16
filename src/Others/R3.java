package Others;

import java.util.Random;
import java.util.Scanner;

public class R3 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int number = scan.nextInt();
        Random generator = new Random();
        int result = generator.nextInt(number+1);

        System.out.println("The random number is " + result);
    }


}
