import java.util.Scanner;
import java.util.Random;

class AnswerYesOrNo {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    Random myRandom = new Random();
    int randomNumber;

    System.out.print("Type your question, my child:  ");
    keyboard.nextLine();

    randomNumber = myRandom.nextInt(10) + 1;

    if (randomNumber > 5) {
      System.out.println("Yes. Isn't it obvious?");
    } else {
      System.out.println("No, and don't ask again.");
    }

    keyboard.close();
  }
}
