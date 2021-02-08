import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Score_Basketball_Barry {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (in);
		int hankees = 0, socks=0;
		
		try {
			out.print("Enter The Hankees Score: ");
			hankees = keyboard.nextInt();
			out.print("Enter The Socks Score: ");
			socks = keyboard.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please,enter valid data.");
			System.exit(0);
		}
		
		out.println();
		
		if(hankees>socks) {
			out.print("Hankees Score: ");
			out.println(hankees);
			out.print("Socks Score: ");
			out.println(socks);
		}
		else {
			out.print("Socks Score: ");
			out.println(socks);
			out.print("Hankees Score: ");
			out.println(hankees);
		}
		
		keyboard.close();
	}

}
