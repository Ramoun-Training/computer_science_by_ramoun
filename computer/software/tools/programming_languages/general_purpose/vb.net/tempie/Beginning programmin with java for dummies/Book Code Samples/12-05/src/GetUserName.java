/*
 * This code works correctly!
 */
import java.util.Scanner;

class GetUserName {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char symbol;

        symbol = keyboard.findWithinHorizon(".",0)
                                          .charAt(0);

        while (symbol != '@') {
            System.out.print(symbol);
            symbol = keyboard.findWithinHorizon(".",0)
                                              .charAt(0);
        }

        System.out.println();

        keyboard.close();
    }
}
