package Chapter_10;

import java.util.*;//Scanner class
import java.text.NumberFormat;//NumberFormat class
import static java.lang.System.*;//out and in classes

class CinemaTicket {
	
	public static void main(String[] args) {
		
		Scanner keys;
		try {
			keys = new Scanner(in);
			out.print("Enter you age: ");
			int age = keys.nextInt();

			NumberFormat currency = NumberFormat.getCurrencyInstance();

			double price = 0;

			boolean kids = age < 12 && age > 0;
			boolean seniors = age >= 65 && age <= 200;
			boolean regular = age >= 12 && age < 65;

			if (regular) {
				price = 9.25;
				
				out.print("Do you have a Coupon? (y or n): ");
				char coupon = keys.findWithinHorizon(".",0).charAt(0);

				if (Character.toUpperCase(coupon) == 'Y') {
					price -= 2;
				}
			}
			else if (kids || seniors) {
				price = 5.25;
			}
			else {
				out.printf("please,enter valid values for age : 0 < age < 200\n");
				System.exit(0);//so that the program doesn't continue to check the next if statement
			}

			out.printf("welcome sir, you pay: %s\n",currency.format(price));
			
			keys.close();
			
		} catch (InputMismatchException e) {
			System.out.println("Please,Enter valid data.");
			out.printf("please,enter valid values for age : 0 < age < 200\n");
			out.println("Enter y for yes and n for no in the coupon question.");
			System.exit(0);
		}
		
	}
}
