package annalinewyork;

/**
 * Created by c4q-nali on 3/8/15.
 */
import java.util.Scanner;

public class ScoreHT {
    public static void main (String [] args){

        int score;
        String result;

        System.out.println("What is your score?");

        Scanner input = new Scanner (System.in);
        score = input.nextInt();


        if (score == 100)
            result = "Perfect score!";
        else if (score >= 90)
            result = "Great!";
        else if (score >= 75)
            result = "Not bad!";
        else if (score >= 60)
            result = "You passed.";
        else
            result = "You failed. :(";

        System.out.println(result);
    }
}
