import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;
public class turningStringToInt {
    public static void main(String[] args) {
        Scanner keystrokes = new Scanner(System.in);
        String input;
        int num;

        try {
			while (true) {
			    out.print("Enter a number <quit: to exit>: ");
			    input = keystrokes.next();
			    if (!input.equalsIgnoreCase("quit")) {
			        num = Integer.parseInt(input);
			        num *= 10;
			        out.println("You entered :" + input);
			        out.println("You get : " + num);
			    }
			    else {
			        out.println("Ok.bye!!");
			        break;
			    }
			}
		} catch (InputMismatchException e) {
			System.out.println("please,Enter quit if you wanna exit.");
			System.out.println("Or enter any number for conversion");
		}

        keystrokes.close();
    }
}
//Made with ♥ by R}AM#UN>