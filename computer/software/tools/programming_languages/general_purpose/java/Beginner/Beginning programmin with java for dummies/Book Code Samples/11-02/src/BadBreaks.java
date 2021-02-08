/*
 * This isn’t good code. The programmer forgot some
 * of the break statements.
 */
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

class BadBreaks {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Random myRandom = new Random();
        int randomNumber;

        out.print("Type your question, my child:  ");
        keyboard.nextLine();

        randomNumber = myRandom.nextInt(10) + 1;

        switch (randomNumber) {
        case 1:
            out.println("Yes. Isn't it obvious?");

        case 2:
            out.println("No, and don't ask again.");

        case 3:
            out.print("Yessir, yessir!");
            out.println(" Three bags full.");

        case 4:
            out.print("What part of 'no'");
            out.println(" don't you understand?");
            break;

        case 5:
            out.println("No chance, Lance.");

        case 6:
            out.println("Sure, whatever.");

        case 7:
            out.print("Yes, but only if");
            out.println(" you're nice to me.");

        case 8:
            out.println("Yes (as if I care).");

        case 9:
            out.print("No, not until");
            out.println(" Cromwell seizes Dover.");

        case 10:
            out.print("No, not until");
            out.println(" Nell squeezes Rover.");

        default:
            out.print("You think you have");
            out.print(" problems?");
            out.print(" My random number");
            out.println(" generator is broken!");
        }

        out.println("Goodbye");

        keyboard.close();
    }
}
