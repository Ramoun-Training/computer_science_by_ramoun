//import java.util.Random;//another idea.
import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;
public class TenLonary {

	public static void main(String[] args) throws FileNotFoundException { 
		Scanner fileReader = new Scanner(new File("occupency"));
		PrintStream fileWriter = new PrintStream("freeRooms.txt");
		int [] gustes = new int [10];
		int element;
		
		for (int i = 0; i < 10; i++) {
			gustes[i] = fileReader.nextInt();
		}
		for (int j = 9; j >= 0; j--) {
			element = gustes[j];
			if (element == 0) {
				fileWriter.println("Room number: " + j + " is empty.");
			}
		}
		System.out.println();
		System.out.println("Finished successfully."); 
		fileWriter.close();
		fileReader.close();
	}

}
