import java.util.Scanner;
import static java.lang.System.out;
public class BadPasswordCheckerProgram {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String password = "ramoun2016";
		String userInput;

		out.print("Enter password: ");
		userInput = keyboard.next();

		out.println();
		if (userInput.equalsIgnoreCase(password)) {//userInput == "ramoun2016" //BAD
			out.println("access guranteed.");
		}
		else {
			out.println("access denied!!!!!");
		}
		out.println("The password : ramoun2016");
		out.println("You entered  : " + userInput);

		keyboard.close();
	}

}
//Made with ♥ by R}AM#UN>
