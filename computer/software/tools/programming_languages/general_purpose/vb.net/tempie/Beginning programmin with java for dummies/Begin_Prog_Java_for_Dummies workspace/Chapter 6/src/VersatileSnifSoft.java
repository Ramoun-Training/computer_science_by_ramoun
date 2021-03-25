import java.util.InputMismatchException;
import java.util.Scanner;
public class VersatileSnifSoft {
/*
	strokes is a scanner variable that scans words from your keyboard.
*/

	public static void main(String[] args) {
		 Scanner strokes = new Scanner(System.in);//declaration
		 double amount = 0 , 
		        cd = 25.00 ,//declaration with initialization
		        total;//declaration

		 System.out.print("What is the price of a cd-rom? ");//prompt

		try {
			amount=strokes.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Enter valid Data Only. ");
			System.out.println("Valid data: ex:. 3.6 , 5.0 ,6 ...etc");
			System.exit(0);
		}
		 total = amount + cd;

		 System.out.print("We Will Bill you $");
		 System.out.print(total);
		 System.out.print(" to your credit card.");

		 strokes.close();
	}

}
