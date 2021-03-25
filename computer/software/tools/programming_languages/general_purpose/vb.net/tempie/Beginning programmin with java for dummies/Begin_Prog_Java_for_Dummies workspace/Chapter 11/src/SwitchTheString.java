import static java.lang.System.out;
public class SwitchTheString {

	public static void main(String[] args) {
		String x ;
		java.util.Scanner strokes ;
		strokes = new java.util.Scanner (System.in);
		
		System.out.print("Enter your grade: ");
		x = strokes.next();
		
		switch (x) {
		case "Excellent":
							out.println("A");break;
		case "Good":
							out.println("B");break;
		case "Average":
							out.println("C");break;
		default:
							out.println("failed");
		}
		
		
		if (x.equals("Excellent")) {
			out.println("A");
		}
		else if (x.equals("Good")) {
			out.println('B');
		}
		else if (x.equals("Average")) {
			out.println("C");
		}
		else {
			out.println("Faild");
		}
		
		strokes.close();
	}

}
