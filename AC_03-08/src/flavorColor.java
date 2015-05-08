/**
 * Created by c4q-nali on 3/9/15.
 */
import java.util.Scanner;

public class flavorColor {
    public static void main (String [] arges){

        Scanner scanner = new Scanner (System.in);

        System.out.print("flavor? ");
        String flavor = scanner.next();
        System.out.print("color? ");
        String color = scanner.next();

        if (color.equals("yellow") && flavor.equals("sweet"))
            System.out.println("banana");
        else if (color.equals("pink") && flavor.equals("bitter"))
            System.out.println("grapefruit");
        else if (color.equals("yellow") && flavor.equals("sour"))
            System.out.println("lemon");
        else
            System.out.println("I don't know that fruit.");
    }
}
