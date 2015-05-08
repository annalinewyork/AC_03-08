package annalinewyork;

/**
 * Created by c4q-nali on 3/8/15.
 */
import java.util.Scanner;

public class selfText01 {
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Are you a male or female?");
        String answer = " ";
        answer = input.next();

        if (answer.equals("male")){
            System.out.println("Go to first room.");
        }else if (answer.equals("female")){
            System.out.println("Go to second room.");
        }else
            System.out.println("Please give a correct answer");

    }

}
