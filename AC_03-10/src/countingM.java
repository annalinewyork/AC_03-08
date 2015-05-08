/**
 * Created by c4q-nali on 3/10/15.
 */
import java.util.Scanner;

public class countingM {
    public static void main (String [] args){

        System.out.println("pick a number");

        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();

        for (int i=0; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
//Write a program that gets an
// integer from the user. Count from 0 to that number. Use a for loop to do it.

//println will makes with a line(enter), print will make it like a row.