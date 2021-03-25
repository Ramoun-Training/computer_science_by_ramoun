import java.util.Scanner;
import static java.lang.System.out;

class AddGuests {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);        
        int whichRoom, numGuests;
        int guestsIn[];
        guestsIn = new int[10];

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guestsIn[roomNum] = 0;
        }

        do {
            out.print("Room number: ");
            whichRoom = keyboard.nextInt();
            out.print("How many guests? ");
            numGuests = keyboard.nextInt();
            guestsIn[whichRoom] = numGuests;

            out.println();
            out.print("Do another? ");
        } while (keyboard.
              findWithinHorizon(".",0).charAt(0) == 'Y');

        out.println();
        out.println("Room\tGuests");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            out.print(roomNum);
            out.print("\t");
            out.println(guestsIn[roomNum]);
        }

        keyboard.close();
    }
}
