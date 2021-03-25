import static java.lang.System.out;
import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		Scanner strokes = new Scanner (System.in);
		byte month;
		boolean isLeap;
		
		out.print("Enter number of month: ");
		month = strokes.nextByte();
		
		switch (month) {
		case 1:
		case 7:
		case 3:
		case 5:
		case 8:
		case 10:
		case 12:out.println("This Month ("+month+") got 31 Days.");
			    break;
		case 4:
		case 6:
		case 9:
		case 11:out.println("This Month ("+month+") got 30 Days.");
				break;
		case 2:	out.print("is it a Leap Year (\"true\" or \"false\")");
				isLeap = strokes.nextBoolean();
				if (isLeap == true) {
					out.println("This month "+month+" has 29 Days.");
				}
				else {
					out.println("This month "+month+" has 28 Days.");
				}
				break;
		default:out.println("YOU ARE STUPID,HAHAHAHHA.");
		}
		
		strokes.close();
	}

}
