import java.util.Scanner;
import static java.lang.System.out;

public class FoodRecipeit {

	public static void main(String[] args) {
		Scanner keystrokes = new Scanner(System.in);
		double overAll;
		int quantity;
		double piece;

		out.print("Enter The overall Price: ");
		overAll = keystrokes.nextDouble();
		out.print("Enter the Quantity you Need: ");
		quantity = keystrokes.nextInt();

		piece = overAll / quantity;

		out.println("Every piece worth: "+piece+" EGP.");

		keystrokes.close();
	}

}
