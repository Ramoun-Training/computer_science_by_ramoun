import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class GeorgeBoolWouldBeProud_v2 {

	public static void main(String[] args) {
		Scanner strokes = new Scanner (in);
		double price = 0.0;
		double age;
		char coupon;

		out.print("How old are you? ");
		age = strokes.nextDouble();
		out.print("Do you have a coupon? ");
		coupon = strokes.findWithinHorizon(".",0).charAt(0);
		
		if (age <= 0 || age > 200) {
			System.out.println("fuck you.");
		}
		else if (age < 12 || age >= 65) {
			price = 5.25;
		}
		if (age >= 12 && age < 65) {
			price = 9.25;
			if (coupon == 'y' || coupon == 'Y') {
				price -= 2.00;
			}
			if (coupon != 'Y' && coupon != 'y' && coupon != 'n' && coupon != 'N') {
				out.println("Really?!");
			}
		}

		out.println("YOU WILL PAY $"+price+",enjoy watching!");

		strokes.close();
	}

}
