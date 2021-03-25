import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

class DisplayHotelData {

   public static void main(String args[]) 
      throws FileNotFoundException {

      Scanner diskScanner = 
          new Scanner(new File("hotelData"));

      for (int floor = 1; floor <= 9; floor++) {
         out.print("Floor ");
         out.print(floor);
         out.print(":  ");

         for (int roomNum = 1; roomNum <= 20; roomNum++) {
            out.print(diskScanner.nextInt());
            out.print(' ');
         }

         out.println();
      }

      diskScanner.close();
   }
}
