/**
 * Created by c4q-nali on 3/9/15.
 */
import java.util.Scanner;

public class weekdayHW {
    public static void main (String [] args){

        System.out.println("What day is today?");
        Scanner scanner = new Scanner (System.in);
        String day = scanner.next();

        if (day.equalsIgnoreCase("monday")
                || day.equalsIgnoreCase("tuesday")
                || day.equalsIgnoreCase("wednesday")
                || day.equalsIgnoreCase("thursday")
                || day.equalsIgnoreCase("friday"))
            System.out.println("Today is a weekday!");

        else if (day.equalsIgnoreCase("saturday")
                || day.equalsIgnoreCase("sunday"))
                System.out.println("Today is a weekend day!");

        else
            System.out.println("I don't know what you're saying.");
    }

}
//Write code that takes the day of the week and figures out if it is a weekday or weekend.