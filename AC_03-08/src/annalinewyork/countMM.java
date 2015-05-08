package annalinewyork;

/**
 * Created by c4q-nali on 3/9/15.
 */
import java.util.Scanner;

public class countMM {
    public static void main (String [] args) {

        int count = 100;
        int eaten;

        System.out.println("100 M&M left");

        while (count > 0 ) {
            System.out.println("eat how many?");
            Scanner input = new Scanner (System.in);
            eaten = input.nextInt();
            count = count - eaten;
        }
        System.out.println("You have nothing left.");
    }
}

//Exercise: Write a program that tracks how many M&Ms you have left, as you eat them. It should look like this:

/*100 M&Ms left
eat how many? 20
80 M&Ms left
eat how many? 60
20 M&Ms left
eat how many? 18
2 M&Ms left
eat how many? 2
you ate all the M&Ms
*/