import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ihate_at {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("e-mail.dat"));
		PrintStream fileWriter = new PrintStream("No_@_here.txt");
		String text;
		char symbol;
		int i = 0;

		while (fileReader.hasNext()) {
			text = fileReader.nextLine();
			//symbol = text.charAt(i);//NOT NEEDED ANYMORE
			while (i < text.length()) {
				symbol = text.charAt(i++);//update + priming
				if (symbol == '@') {
					fileWriter.print(" -> ");
				}
				else {
					fileWriter.print(symbol);
				}
			}
			fileWriter.println();
			i = 0;
		}

		System.out.println("printing to file ended successfully.");

		fileReader.close();
		fileWriter.close();
	}

}
