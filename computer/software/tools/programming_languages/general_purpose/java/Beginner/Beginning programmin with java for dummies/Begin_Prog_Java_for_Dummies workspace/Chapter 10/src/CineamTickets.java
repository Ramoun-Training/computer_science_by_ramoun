import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

/*
 * very simple basic program
 */
public class CineamTickets {

	public static void main(String[] args) {
		Scanner strokes = new Scanner (in);
		double ticket_price = 0.00;//without initialization you get a problem
		int age;
		
		out.print("Enter your age: ");
		age=strokes.nextInt();
		
		if ( age < 12 || age >= 65 ) {
			ticket_price = 5.25;
		}
		if ( age >= 12 && age < 65) {//or just simply -> else
			ticket_price = 9.25;
		}
		
		out.println("Welcome to our Cinema");
		out.println("---------------------");
		out.println("YOU PAY: $"+ticket_price);
		
		strokes.close();
	}

}
