package Goodies;
import static java.lang.System.out;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class lineCounter {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner lienScanner = new Scanner(new File("lines.txt"));
		Scanner charScanner = new Scanner(new File("lines.txt"));
		Scanner wordScanner = new Scanner(new File("lines.txt"));
		int numWords = 0,
			numLines = 0,
			numChar = 0;

		while (charScanner.hasNext()) {
			charScanner.findWithinHorizon(".",0).charAt(0);
			numChar++;
		}
		while (lienScanner.hasNextLine()) {//goal can be achieved using hasNext() method w/ same results
			lienScanner.nextLine();
			numLines++;
		}
		while (wordScanner.hasNext()) {
			wordScanner.next();
			numWords++;
		}
		out.println("# of characters: " + numChar);
		out.println("# of Words: " + numWords);
		out.println("# of lines: " + numLines);

		charScanner.close();
		wordScanner.close();
		lienScanner.close();
	}

}
