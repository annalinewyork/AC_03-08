/**
 * Created by c4q-nali on 3/8/15.
 */
import java.util.Scanner;
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
