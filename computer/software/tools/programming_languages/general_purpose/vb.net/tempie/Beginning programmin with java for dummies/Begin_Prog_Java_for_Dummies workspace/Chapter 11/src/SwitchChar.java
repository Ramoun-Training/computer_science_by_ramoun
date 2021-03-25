import static java.lang.System.out;
import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) {
		Scanner strokes = new Scanner (System.in);
		char c ; int contra = 97;
		
		out.print("Enter the things: ");
		c = strokes.findWithinHorizon(".", 0).charAt(0);
		
		switch (contra) {
		case 'a' : out.println("ook first letter is:"+c);break;
		default : out.println("don't do this again.");
		}
		strokes.close();
	}

}
