import java.util.InputMismatchException;
import java.util.Scanner;
public class make_Change_float {
	/*
	 * program created by:Ramoun 
	 * Aim:organize change values in U.S
	 * Notes: works best on specific inputs.
	 */
	public static void main(String[] args) {
		Scanner strokes = new Scanner(System.in);
		double quarters , nickels , cents;
		double total = 0 , left;

		System.out.print("How many cents have you got? ");
		try {
			total=strokes.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("please, Enter Valid Data Only.");
			System.exit(0);
		}

		quarters = total / 0.25;
		left = total % 0.25;

		nickels = left / 0.05;
		left %= 0.05;

		cents = left;

		System.out.println();
		System.out.println("From "+total+" cents,you got:");
		System.out.println(quarters+" quarter(s)");
		System.out.println(nickels+" nickel(s)");
		System.out.println(cents+" cent(s)");

		strokes.close();
	}

}
