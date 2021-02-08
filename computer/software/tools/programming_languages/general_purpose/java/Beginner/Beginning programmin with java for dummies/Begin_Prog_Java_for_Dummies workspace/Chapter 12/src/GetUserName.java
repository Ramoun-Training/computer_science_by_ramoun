import static java.lang.System.out;
import java.util.Scanner;

public class GetUserName {

	public static void main(String[] args) {
		Scanner keyStrokes = new Scanner(System.in);
		int i = 0;
		String input;
		char character;
		
		out.print("Enter Your E-mail: ");
		input = keyStrokes.nextLine();
		character = input.charAt(i);//priming the loop.
		
		out.print("User Name: ");
		while (character != '@') {
			out.print(character);
			i++;
			character = input.charAt(i);
		}
		
		keyStrokes.close();
	}

}
