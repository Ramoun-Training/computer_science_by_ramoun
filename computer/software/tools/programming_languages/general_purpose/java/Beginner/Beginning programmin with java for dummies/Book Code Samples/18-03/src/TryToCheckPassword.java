/*
 * This code does not work:
 */
import java.util.Scanner;
import static java.lang.System.out;

class TryToCheckPassword {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String password = "swordfish";
        String userInput;

        out.print("What's the password? ");
        userInput = keyboard.next();

        if (password == userInput) {
            out.println("You're okay!");
        } else {
            out.println("You're a menace.");
        }

        keyboard.close();
    }
}
