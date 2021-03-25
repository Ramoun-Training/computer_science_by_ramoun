import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class GeorgeBoole_WouldBeProud {

	public static void main(String[] args) {
		//declaration part
		Scanner strokes = new Scanner (in);
		double price = 9.25;
		int age;
		char answer;
		boolean YouAreKid,YouAreSenior,YouHaveCoupon,YouHaveNoCoupon;

		//input part
		out.print("Enter your age? ");
		age = strokes.nextInt();
		out.print("Do You Have a Coupon? ");
		answer = strokes.next().charAt(0);//could use the findWithinHorizon() method;

		//Assignment Statements
		YouAreKid = age < 12;
		YouAreSenior = age >= 65;
		YouHaveCoupon = answer == 'y' || answer == 'Y';
		YouHaveNoCoupon = answer == 'n' || answer == 'N';

		//Process part
		/*
		if (!YouAreKid && !YouAreSenior) {
			price = 9.25;
		}*/

		if (YouAreKid || YouAreSenior) {
			price =5.25;
		}
		if (YouHaveCoupon && !(YouAreKid || YouAreSenior)) {
			price -= 2.00;
		}
		if (!YouHaveNoCoupon  && !YouHaveCoupon) {
			out.println("Really?!");
		}

		//output part
		out.println("You Pay $"+price+",enjoy the show.");

		//close the Scanner
		strokes.close();
	}

}
