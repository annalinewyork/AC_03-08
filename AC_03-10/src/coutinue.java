/**
 * Created by c4q-nali on 3/10/15.
 */
public class coutinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("This is an even number" + i);
                continue;
            }
            System.out.println(i);
        }
    }
}

      /*  int i = 5;
        System.out.println(i % 2);
    }

}
// % is the left number / right number, the left part.
// 5/2 = 2 remain 1 !!!!!
*/

//break is go the down, and continue is go back to very beginning.