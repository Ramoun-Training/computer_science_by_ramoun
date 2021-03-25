import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

public class AtRoomN {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyStrokes = new Scanner(System.in);
		Scanner fileReader = new Scanner(new File("occupency"));
		int RoomNumber;
		int i;
		int numGuests = 0;

		out.print("What is the Room Number? ");
		RoomNumber = keyStrokes.nextInt();

		fileReader.nextLine();
		for (i = 0; i <= RoomNumber && fileReader.hasNext(); i++) {//whithout that little equel sign causes problems
			fileReader.nextInt();
			numGuests = fileReader.nextInt();
		}

		if (fileReader.hasNext() || RoomNumber < 10){
			out.println("The # of Guests: " + numGuests);
		}

		keyStrokes.close();
		fileReader.close();
	}


}
