package Oldies_io;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class RepeatAfterMe_io {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard_reader = new Scanner(System.in);
		Scanner Disk_reader = new Scanner(new File("Repeat.dat"));
		String input;
		int i = 0;
		
		while (i < 30) {
			input = Disk_reader.nextLine();
			System.out.println(input);
			i++;
		}

		keyboard_reader.close();
		Disk_reader.close();
	}

}
