package D0906_BasicJava_2Days;

import java.util.Scanner;

/**
 * Comp127 second activity, created by Adam Yao on 2019.9.9
 * <p>
 * Re-visited and edited by Adam Yao on 2020.2.22
 */
public class Hypotenuse {
    public static double calculateHypotenuse(double length1, double length2){
        return Math.sqrt(Math.pow(length1,2) + Math.pow(length2,2));
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the first side: ");
        double read1 = scan.nextDouble();
        System.out.println("Please enter the length of the second side: ");
        double read2 = scan.nextDouble();
        System.out.println("The hypotenuse is " + calculateHypotenuse(read1,read2));
    }
}

