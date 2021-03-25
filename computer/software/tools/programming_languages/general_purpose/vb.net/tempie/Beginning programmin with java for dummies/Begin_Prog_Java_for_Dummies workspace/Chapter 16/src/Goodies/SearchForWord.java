package Goodies;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import static java.lang.System.out;
import java.awt.Desktop;

/**
 * The point of this class is to find if a certain word exists in a specific
 * (given) text file or not.
 * <p>And inCase it is found then how many times?.
 * @author Ramoun
 *
 */
public class SearchForWord {

	public static void main(String[] args) throws IOException {
		
		Desktop desk = Desktop.getDesktop();
		Scanner keyStrokes = new Scanner(System.in);
		out.print("Please give me the path to your file: ");
		String path = keyStrokes.nextLine();
		File file = new File(path);
		Scanner fileReader = new Scanner(file);
		PrintStream fileWriter = new PrintStream("C:\\Users\\Ramoun\\Desktop\\finder.txt");
		int counter = 0;
		String word = "";
		out.print("what is the word you are searching for? ");
		String search = keyStrokes.next();

		while (fileReader.hasNext()) {
			
			word = fileReader.next();
			if (word.equals(search) || 
				word.equals(search + "." )|| 
				word.equals(search + "," )||
				word.equals(search + ";" ) ) {
				
					counter++;
			}

		}

		fileWriter.println("The word " + word + " was found : " + counter + " times.");
		out.println("Done!");
		
		desk.open(new File("C:\\Users\\Ramoun\\Desktop\\finder.txt"));
		keyStrokes.close();
		fileReader.close();
		fileWriter.close();
		
	}

}
