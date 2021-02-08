/*
 * This code almost works, but there's one tiny error:
 */
import java.util.Scanner;

class SecondAttempt {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char symbol = ' ';

        while (symbol != '@') {
            System.out.print(symbol);
            symbol = keyboard.findWithinHorizon(".",0)
                                              .charAt(0);
        }

        System.out.println();

        keyboard.close();
    }
}
