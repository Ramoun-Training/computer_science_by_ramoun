package havaing_fun;
import static java.lang.System.out;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner keyStrokes = new Scanner(System.in);
		int n1 = 0,
			n2 = 0,
			result = 0;
		boolean flag = true;
		char op;

		while (flag) {
			out.print("Enter Arithmatic Expression: ");
			n1 = keyStrokes.nextInt();
			op = keyStrokes.next().charAt(0);
			n2 = keyStrokes.nextInt();

			switch (op) {
				case '+' : result = n1 + n2;
					  break;
				case '-' : result = n1 - n2;
					  break;
				case '*' : result = n1 * n2;
					  break;
				case '/' : result = n1 / n2;
				      break;
				case 'Q' : out.println("BYE!! :-)");
					  flag = false;
					  break;
				default : out.println("Enter a valid Expression.");
						  flag = false;
			}
			out.println(flag? "The Result: "+result : "");
		}

		keyStrokes.close();
	}
	
	public static void TEST (String args[]) {
		Scanner s = new Scanner(System.in);
		s.nextInt();
		s.next().charAt(0);
		s.nextInt();
		
		s.close();
	}

}
