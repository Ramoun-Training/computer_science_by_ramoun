/*	
 * DISCLAIMER: Neither the author nor Wiley Publishing,
 * Inc., nor anyone else even remotely connected with the
 * creation of this book, assumes any responsibility
 * for any damage of any kind due to the use of this code,
 * or the use of any work derived from this code,
 * including any work created partially or in full by 
 * the reader.
 *
 * Sign here:_______________________________
 */

import java.io.File;
import java.util.Scanner;

class IHopeYouKnowWhatYoureDoing {

  public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);
    char reply;

    do {

      System.out.print("Reply with Y or N...");
      System.out.print
         ("  Delete the importantData file? ");
      reply = 
         keyboard.findWithinHorizon(".", 0).charAt(0);

    } while (reply != 'Y' && reply != 'N');

    if (reply == 'Y') {
      new File("importantData.txt").delete();
      System.out.println("Deleted!");
    } else {
      System.out.println("No harm in asking!");
    }

    keyboard.close();
  }
}
