package Arrays;
import java.util.Scanner;
import static java.lang.System.out;
public class leanierSearch {

	public static void main(String[] args) {
		Scanner keystrokes = new Scanner(System.in);
		int wanted;
		int array[] = new int [] {11,2,33,111,5,2,5,3};
		int counter = 0;
		char again;
		
		do {
			counter = 0;
			out.print("Enter the number you are looking for? ");
			wanted = keystrokes.nextInt();
			
			for (int element : array) {
				if (element == wanted) {
					counter++;
				}
			}
			
			if (counter > 0) {
				out.println("Found it. " + counter + (counter > 1?" times":" time")+".");
			}
			else {
				out.println("Sorry,didn't find it.");
			}
			
			out.print("Again? ");
			again = keystrokes.next().charAt(0);
			again = Character.toLowerCase(again);
		} while(again == 'y');
		
		keystrokes.close();
	}
	
	public static void method1() {
		int wanted = 1;
		int array[] = new int [] {11,22,33,111,5,2,5,3};
		int found = 0;
		int notFound = 1;
		int state = notFound;
		for (int element : array) {
			if (element == wanted) {
				state = found;
				break;
			}
			else {
				state = notFound;
			}
		}
		if (state == found) {
			out.println("Found it.");
		}
		else {
			out.println("Sorry,didnt' find it.");
		}
	}
}
//Made with ♥ by R}AM#UN>