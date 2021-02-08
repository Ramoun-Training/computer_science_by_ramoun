package Drawing;
import java.util.Scanner;
import static java.lang.System.out;
public class XmaxTree {

	public static void main(String[] args) {
		Scanner keystrokes = new Scanner(System.in);
		int size;
		String peak = "*";
		String space = "";
		
		out.print("Enter the size: ");
		size = keystrokes.nextInt();
		
		for (int i = 0; i <= size; i++) {
			space = space + " ";
		}
		out.println(space + "*");
		for (int i = 0; i < size; i++) {
			space = space.substring(0,size - i);
			out.println(space + (peak+= "#*"));
		}
		
		keystrokes.close();
	}

}
//Made with ♥ by R}AM#UN>