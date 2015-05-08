package annalinewyork;

/**
 * Created by c4q-nali on 3/8/15.
 */
import java.util.Scanner;

public class happyFaceHT {
    public static void main (String [] args) {

        String mood1, mood2,answer;
        mood1 = ":)";
        mood2 = ":(";

        System.out.println("How do you feel?");

        Scanner input = new Scanner(System.in);
        answer = input.next();

        if (answer.equals(mood1))
            System.out.println("Today you're happy.");
        else if (answer.equals(mood2))
            System.out.println("Today you're sad.");
    }
}
