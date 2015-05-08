/**
 * Created by c4q-nali on 3/9/15.
 */
import java.util.Scanner;

public class exitTicket {
    public static void main(String[] args) {

        String answer1 = " ";

        while (!answer1.equalsIgnoreCase("exit") && !answer1.equalsIgnoreCase("quit")) {
            System.out.println("What should I do next?");
            Scanner scanner = new Scanner (System.in);
            answer1 = scanner.nextLine();
        }
        System.out.println("Exit.");
    }
}
/*Write a program that asks the user "What should I do next?",
and exits if the user enters "quit" or "exit." Otherwise, the program keeps asking the same question. *
 */
