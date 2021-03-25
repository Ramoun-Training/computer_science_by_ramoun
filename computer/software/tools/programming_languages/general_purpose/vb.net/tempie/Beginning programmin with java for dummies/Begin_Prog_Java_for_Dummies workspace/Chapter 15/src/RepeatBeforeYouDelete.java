/*
 * DISCLAIMER: Neither the author nor Wiley Publishing,
 * Inc., nor anyone else even remotely connected with the
 * creation of this book, assumes any responsibility
 * for any damage of any kind due to the use of this code,
 * or the use of any work derived from this code,
 * including any work created partially or in full by
 * the reader.
 *
 * Sign here:Ramoun
 */
 import static java.lang.System.out;
 import java.util.Scanner;
 import java.io.File;

 class RepeatBeforeYouDelete {
     public static void main(String[] args) {
         Scanner keyStrokes = new Scanner(System.in);
         char ans;
         boolean NotValid;

         do {
             out.println("Reply wiht 'Y' or 'N'.....");
             out.println("Delete the important data file?");
             ans = keyStrokes.next().charAt(0);
             //ans = keyStrokes.findWithinHorizon(".",0).charAt(0);
             NotValid = ans != 'Y' && ans != 'N';
         } while (NotValid);

         if (ans == 'Y') {
             new File("important.txt").delete();
             out.println("File Deleted Successfully.");
         }
         else {
             out.println("Nothing bad to Worry about we didn't delete anything.");
         }

         keyStrokes.close();
     }
 }
