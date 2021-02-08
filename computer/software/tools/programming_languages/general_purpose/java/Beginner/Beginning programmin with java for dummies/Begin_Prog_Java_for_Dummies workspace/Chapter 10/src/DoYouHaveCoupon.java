import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
/*
 * basic simple program
 */
public class DoYouHaveCoupon {

	public static void main(String[] args) {
			Scanner strokes = new Scanner(in);
			int age;
			double price = 0.0;
			char copoun;
			
			out.print("Enter your age: ");
			age = strokes.nextInt();
			out.print("Do You have a Copoun: ");
			copoun = strokes.findWithinHorizon(".",0).charAt(0);
			
			if (age <= 0 || age >= 200){
				System.out.println("ا2tla3 bara ya 2bn el medi2a.");
			}
			else if ( age > 12 && age <= 65) {
				price = 9.25;
			}
			else if ( age <= 12 || age > 65) {
				price = 5.25;
			}
			
			
			if ( copoun == 'y' || copoun == 'Y' ) {
				price = price - 2.00;
			}
			else if ( copoun == 'n' || copoun == 'N' );
			else {
				System.out.println("Please,Enter (y:yes) or (n:no) only.");
			}
			
			/* Another way of doing the last if (beginner complicated way)
			 * 	if ( copoun == 'y' || copoun == 'Y' ){
			 * 			price -= 2.00;
			 * 	}
			 * 	if ( copoun != 'y' && copoun != 'n' && copoun != 'Y' && copoun != 'N' ){
			 * 			out.println("huh");
			 * 	}
			 */
				
			out.println("YOU PAY $"+price+",Enjoy the show.");
			
			strokes.close();
	}

}
