import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class HotelDataManaged {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keys = new Scanner(new File("C:\\Users\\Ramoun\\Desktop\\hotelData"));
		PrintStream file_writer = new PrintStream("C:\\Users\\Ramoun\\Desktop\\hotelDataManaged.txt");
		String floors[] = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth",
						   "tenth","eleventh","twelvth","thirteenth","fourteenth","fifteenth","sixteenth",
						   "seventeenth","eighteenth","ninteenth","twentyth"};
		int room_number;
		
		for (int i = 0; i < 30; i++) {
			file_writer.print("_");
		}
		file_writer.println();
		for (int i = 1; i <= 10; i++) {
			file_writer.print(i + "  ");
		}
		file_writer.println();
		for (int i = 1; i <= 30; i++) {
			file_writer.print("-");
		}
		file_writer.println();
		file_writer.println();
		
		for (int j = 0; keys.hasNext(); j++) {//the j counter doesn't affect the condition
			file_writer.println(floors[j] + " floor: ");
			for (int i = 0; i < 10; i++) {
				room_number = keys.nextInt();
				file_writer.print(room_number + "  ");
			}
			file_writer.println();
		}
		
		keys.close();
		file_writer.close();
	}

}
