package test_files;
import java.util.Scanner;
import static java.lang.System.out;

public class test_withinHorizom {

	public static void main(String[] args) {
		Scanner keyStrokes = new Scanner(System.in);
		
		out.print("Enter the new thing in your life: ");
		char text = keyStrokes.findWithinHorizon(".",0).charAt(0);
		//String rest = keyStrokes.nextLine();
		
		out.println("You entered multiple characters but here is the first one: "+text);
		String rest = keyStrokes.nextLine();
		out.println("And here is the rest: "+rest);
		
		keyStrokes.close();
	}

}
