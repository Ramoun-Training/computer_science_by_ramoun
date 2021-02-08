import static java.lang.System.out;
public class ToBreakOrNotToBreak {

	public static void main(String[] args) {
		char x ;
		java.util.Scanner strokes ;
		strokes = new java.util.Scanner (System.in);
		
		System.out.print("Enter your grade: ");
		x = strokes.next().charAt(0);//findWithinHorizon(".",0);
		
		switch (x) {
		case 'A' : 
		case 'a' : out.println("Excellent.");break;
		case 'B' : 
		case 'b' : out.println("Good.");break;
		case 'C' : 
		case 'c' : out.println("Average.");break;
		default  : out.println("Please,Enter one of the following:");
				   out.println("'A' or 'a' : Excellent.");
				   out.println("'B' or 'b' : Good.");
				   out.println("'C' or 'c' : Average.");
		}
		
/* conversion between switch statement and if statement */
//		if (x == 'A' || x == 'a') {
//			System.out.println("Excellent.");
//		}
//		else if (x == 'b' || x == 'B' ) {
//			System.out.println("Good.");
//		}
//		else {
//			System.out.println("Faild.");
//		}
		
		strokes.close();
	}

}
