import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class ListOneUsername {

   public static void main(String args[]) 
                        throws FileNotFoundException {

      Scanner diskScanner = 
         new Scanner(new File("email.txt"));
      PrintStream diskWriter = 
         new PrintStream("usernames.txt"); 
      char symbol;

      symbol = 
         diskScanner.findWithinHorizon(".",0).charAt(0);

      while (symbol != '@') {
         diskWriter.print(symbol);
         symbol = 
           diskScanner.findWithinHorizon(".",0).charAt(0);
      }

      diskWriter.println();

      diskScanner.close();
      diskWriter.close();
   }
}
