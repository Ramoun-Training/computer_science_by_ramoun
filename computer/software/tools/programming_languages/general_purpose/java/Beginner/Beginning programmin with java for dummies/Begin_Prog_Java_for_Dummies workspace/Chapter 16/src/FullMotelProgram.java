import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import static java.lang.System.out;

public class FullMotelProgram {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keystrokes = new Scanner(System.in);
		PrintStream fileWriter = new PrintStream(new File("occupency"));
		out.print("How many rooms in your motel? ");
		int NofRooms = keystrokes.nextInt();
		int rooms[] = new int[NofRooms];
		int RoomNum, NofGustes;
		char again;

		do {
			out.print("What is the room number? ");
			RoomNum = keystrokes.nextInt();
			out.print("How many gustes? ");
			NofGustes = keystrokes.nextInt();
			rooms[RoomNum] = NofGustes;
			out.print("Fill another Rooms? ");
			again = keystrokes.next().charAt(0);
		} while (Character.toUpperCase(again) == 'Y');

		fileWriter.println("Room\tGuests");
		out.println("Room\tGuests");
		for (int i = 0; i < rooms.length/*NofRooms*/; i++) {
			fileWriter.println(i + "   \t" + rooms[i]);
			out.println(i + "   \t" + rooms[i]);
		}

		fileWriter.close();
		keystrokes.close();
	}

}
//Made with ♥ by R}AM#UN>
