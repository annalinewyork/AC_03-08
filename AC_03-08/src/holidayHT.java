/**
 * Created by c4q-nali on 3/9/15.
 */
import java.util.Scanner;

public class holidayHT {
    public static void main (String [] args){
        String month;
        int day;

        System.out.println("Please choose a month");
        Scanner input = new Scanner (System.in);
        month = input.next();

        System.out.println("Please choose a day ");
        Scanner scanner = new Scanner (System.in);
        day = scanner.nextInt();

        if (month.equals("December")) {
            day = 1;
            System.out.println("Today is Christmas!");
        }
        else if (month.equals("January")){
            day = 1;
            System.out.println("Today is New Year's day!");
        }
        else if (month.equals("May")){
            day = 5;
            System.out.println("Today is Cinco de Mayo!");
        }
        else if (month.equals("July")){
            day = 4;
            System.out.println("Today is Fourth of July!" );
        }
        else
            System.out.println("Today is a normal day!");
        //else if (month.equals("December")){
          //   day > 1 ;
            // day < 31;
            //System.out.println("This is a holiday season!");
    }

}

//

//Write code that asks for the month and day of the month
// and reports if the day is New Years Day (January 1), Cinco de Mayo (May 5),
// the Fourth of July (July 4), or Christmas (December 25).


//if (age > 12 && age < 20)
//System.out.println("you are a teenager");