package Goodies;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

/*
 *
    == checks to see if the actual object references are the same.
    equals(...) checks if the two Strings hold the same string (ie the same characters in the same order)

 */
public class userName {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("users.txt"));
		Scanner keyStrokes = new Scanner(System.in);

		out.print("Enter your userName: ");
		String user = keyStrokes.next();
		out.print("Enter you password: ");
		String pass = keyStrokes.next();

		if (user.equals(fileReader.next()) && pass.equals(fileReader.next())) {
			out.print("access guranteed");
		}
		else {
			out.print("access denied");
		}

		keyStrokes.close();
		fileReader.close();

	}

}
