import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class fromEmail_to_Username {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("e-mail.dat"));
		PrintStream fileWriter = new PrintStream("UserNames.dat");
		PrintStream SymbolChecker = new PrintStream("Ihate_@.txt");

		char current_char;
		String email;
		int i = 0;//counter;

		//just gets the userName only out of your e-mail.
		while (fileReader.hasNext()){
			email = fileReader.nextLine();
			current_char = email.charAt(i);
			while (current_char != '@') {
				fileWriter.print(current_char);
				current_char = email.charAt(++i);
			}
			fileWriter.println();
			i = 0;
		}

		//Gets rid of all '@' characters in your file.
		/*code goes here*/

		System.out.println("printing to file ended successfully.");

		fileWriter.close();
		fileReader.close();
		SymbolChecker.close();
	}

}
