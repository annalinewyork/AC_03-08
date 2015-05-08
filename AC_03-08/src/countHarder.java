/**
 * Created by c4q-nali on 3/10/15.
 */
import java.util.Scanner;

public class countHarder {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int count = 100;
        while (count >= 10 ) {
            System.out.println(count);
            count = count - 5;
        }

        int count2 = 10;
        while (count2 >=1){
            System.out.println(count2);
            count2 = count2 -1;
        }

    }
}


/*Exercise: Change this to count down from 100 to 10 by 5,
 and then from 9 to 1. The numbers it prints should be 100, 95, 90, ..., 20, 15, 10, 9, 8, ..., 2,
 1. At the end, print "blastoff".

 public class countDown {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count = count - 1;
        }
    }
}
  */