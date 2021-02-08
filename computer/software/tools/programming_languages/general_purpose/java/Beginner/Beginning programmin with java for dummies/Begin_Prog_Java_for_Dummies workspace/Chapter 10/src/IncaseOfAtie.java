import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class IncaseOfAtie {

	public static void main(String[] args) {
		Scanner strokes = new Scanner (in);
		int hankees = 0,socks = 0;

		out.print("Enter The Result (hankees/socks): ");
		try {
			hankees = strokes.nextInt();
			socks = strokes.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter valid data,please.");
			System.exit(0);
		}

		if (hankees > socks) {
			out.println("HANKEES WON!!");
			out.println("Hankees -> "+hankees);
			out.println("Socks -> "+socks);
		}
		else if (socks > hankees) {
			out.println("SOCKS WON!!");
			out.println("Socks -> "+socks);
			out.println("Hankees -> "+hankees);
		}
		else {
			out.println("#########################################");
			out.println("IT'S A TIE:");
			out.println("______________________________________________");
			out.println("Socks -> "+socks+"	  |   Hankees -> "+hankees);
			out.println("----------------------------------------------");
		}

		strokes.close();
	}

}
