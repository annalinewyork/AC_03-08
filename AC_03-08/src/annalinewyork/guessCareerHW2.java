package annalinewyork;

/**
 * Created by c4q-nali on 3/9/15.
 */
import java.util.Scanner;

public class guessCareerHW2 {
    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Do your carry a sword?");
        String response = scanner.next();
        boolean sward =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        System.out.println("Do you have a helmet?" );
        response = scanner.next();
        boolean helmet =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        System.out.println("Do you have a shovel?");
        response = scanner.next();
        boolean shovel =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        String result = " ";
        if (sward && helmet && ! shovel)
            result = "samurai";
        else if (sward && ! helmet && ! shovel)
            result = "ninja";
        else if (!sward && helmet && shovel)
            result = "construction worker";
        else if (!sward && !helmet && shovel)
            result = "gardener";
        else if (!sward && helmet && !shovel)
            result = "astronaut";
        else if (!sward && !helmet && !shovel)
                    result ="coder";

        System.out.println("You're a " + result);
    }
}
/*/sword?	helmet?	shovel?	profession
y	y	n	samurai
y	n	n	ninja
n	y	y	construction worker
        n	n	y	gardener
        n	y	n	astronaut
        n	n	n	coder
        */