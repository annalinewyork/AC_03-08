/**
 * Created by c4q-nali on 3/9/15.
 */
import java.util.Scanner;

public class guessCareerHW {
    public static void main (String [] args){

        String hassword,hashelmet,hasshovel;

        System.out.println("Do you carry a sword? Please say \"y\" or \"n\"");
        Scanner scanner = new Scanner (System.in);
        hassword = scanner.next();

        System.out.println("Do you wear a helmet? Please say \"y\" or \"n\"");
        Scanner input = new Scanner (System.in);
        hashelmet = input.next();

        System.out.println("Do you have a shovel? Please say \"y\" or \"n\"");
        Scanner write = new Scanner (System.in);
        hasshovel = write.next();

        if (hassword.equalsIgnoreCase("y")
                && hashelmet.equalsIgnoreCase("y")
                && hasshovel.equalsIgnoreCase("n"))
            System.out.println("You're a samurai");

        else if (hassword.equalsIgnoreCase("y")
                && hashelmet.equalsIgnoreCase("n")
                && hasshovel.equals("n"))
                System.out.println("You're a ninja");

        else if (hassword.equalsIgnoreCase("n")
                && hashelmet.equalsIgnoreCase("y")
                && hasshovel.equalsIgnoreCase("y"))
                System.out.println("You're a construction worker");

        else if (hassword.equalsIgnoreCase("n")
                && hashelmet.equalsIgnoreCase("n")
                && hasshovel.equalsIgnoreCase("y"))
            System.out.println("You're a gardener");

        else if (hassword.equalsIgnoreCase("n")
                && hashelmet.equalsIgnoreCase("y")
                && hasshovel.equalsIgnoreCase("n"))
                System.out.println("You're a astronaut");

        else if (hassword.equalsIgnoreCase("n")
                && hassword.equalsIgnoreCase("n")
                && hasshovel.equalsIgnoreCase("n"))
            System.out.println("You're a coder");

    }
}

/*/Let's guess my profession. Ask three questions: whether I carry a sword,
// whether I wear a helmet, and whether I use a shovel. Based on that, guess my profession.

        sword?	helmet?	shovel?	profession
        y	y	n	samurai
        y	n	n	ninja
        n	y	y	construction worker
        n	n	y	gardener
        n	y	n	astronaut
        n	n	n	coder
*/