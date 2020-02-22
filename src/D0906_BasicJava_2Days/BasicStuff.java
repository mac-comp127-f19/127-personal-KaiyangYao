package D0906_BasicJava_2Days;

/**
 * Comp127 first activity ever, created by Adam Yao on 2019.9.6
 * <p>
 * Re-visited and edited by Adam on 2020.2.22
 */
public class BasicStuff {
    public static void main(String[] args) {
        int age0;
        double age1;
        age0 = 18;  // my age
        age1 = 17;  // my partner's age

        double sumOfAges = age0 + age1;

        System.out.println("We are " + age0 + " and " + age1 + " years old!");
        System.out.println("The sum of our ages is " + sumOfAges + "!");
        System.out.println("The sum of our ages is " + (age0 + age1) + "!");
        // to prevent the mistake, there should be a pair of parentheses outside the sum of age0 and age1.


        System.out.println(6/3);
        System.out.println(6/4);
        System.out.println(6/4.0);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);

        int hours = 1600;
        double days = 1600 / 24;
        double weeks = days / 7;
        System.out.println("There are " + weeks + " weeks, " + days + " days, or " + hours + " hours in 1600 hours.");

        double h, r, V, A;
        h = 5;
        r = 2;
        V = (1/3.0) * Math.PI * r * r * h;
        A = Math.PI * r * r + Math.PI * r * Math.sqrt(r*r + h*h);
        System.out.println("The volume is " + V + ", and the surface area is " + A);

    }
}
