/**
 * Created by c4q-nali on 3/9/15.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class spaceB {
    public static void main (String [] args){

        int earthWeight;
        String plantNum = " ";

        System.out.println("Please enter your current earth weight.");

        Scanner input = new Scanner (System.in);
        earthWeight = input.nextInt();

        System.out.println("I have information for the following planets:");
        System.out.println("1.Venus"+"  "+"2.Mars"+"  "+"3.Jupiter");
        System.out.println("4.Saturn"+"  "+"Uranus"+"  "+"Neptune");
        System.out.println("Which planet are you visiting?");

        Scanner scanner = new Scanner (System.in);
        plantNum = scanner.next();

        boolean isVars = plantNum.equals("1");
        if (isVars) {
            plantNum = "1";
            // the DecimalFormat feature
            double y = earthWeight * .33;
            String x = "##.##"; //the format with the variable x
            DecimalFormat earth = new DecimalFormat(x); //Declaring DecimalFormat with the variable earth. In the (x)
            //is the variable from above.
            String convert = earth.format(y); //convert is a variable to capture = earth which format (y = 1.23) variable
            //Use the variable Convert (above)  to display the value.

            System.out.println("Your weight would be " + convert + " pounds on that planet."); //Output
        }
        boolean isMars = plantNum.equals("2");
        if (isMars) {
            plantNum = "2";
            System.out.println("Your weight would be" + earthWeight * 0.39 + "pounds on that planet.")
            ;        }
        boolean isJupiter = plantNum.equals("3");
        if (isJupiter) {
            plantNum = "3";
            System.out.println("Your weight would be" + earthWeight * 2.65 + "pounds on that planet.");
        }
        boolean isSaturn = plantNum.equals("4");
        if (isSaturn) {
            plantNum = "4";
            System.out.println("Your weight would be" + earthWeight * 1.17 + "pounds on that planet.");
        }
        boolean isUranus = plantNum.equals("5");
        if (isUranus) {
            plantNum = "5";

            System.out.println("Your weight would be" + earthWeight * 1.05 + "pounds on that planet.");
        }
        boolean isNeptune = plantNum.equals("6");
        if (isNeptune) {
            plantNum = "6";

            // the DecimalFormat feature
            double y = earthWeight * 1.23;
            String x = "##.#"; //the format with the variable x
            DecimalFormat earth = new DecimalFormat(x); //Declaring DecimalFormat with the variable earth. In the (x)
                                                        //is the variable from above.
            String convert = earth.format(y); //convert is a variable to capture = earth which format (y = 1.23) variable
            //Use the variable Convert (above)  to display the value.

            System.out.println("Your weight would be " + convert + " pounds on that planet."); //Output
        }
    }
}