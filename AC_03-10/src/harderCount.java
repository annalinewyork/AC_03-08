/**
 * Created by c4q-nali on 3/10/15.
 */

import java.util.Scanner;

public class harderCount {
    public static void main (String [] args) {

        System.out.println("Please input three number: your initial number, which number you \n" +
                "wanna count to, and count by what number?");

        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int max = scanner.nextInt();
        int count = scanner.nextInt();

        for (int i = first; i <= count; i = i + max) {
            System.out.println(i);
        }
    }
}
