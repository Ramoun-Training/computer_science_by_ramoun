import static java.lang.System.out;
import java.util.Scanner;
public class Zmaze {

	public static void main(String[] args) {
		Scanner keystrokes = new Scanner(System.in);
		int size;
		char again;
		
		do {
			out.print("Enter size: ");
			size = keystrokes.nextInt();
			for (int i = 0; i < size; i++){
				for (int j = 0; j <size; j++) {
					if (i == 0 || i == size-1) {
						out.print("1");
					}
					else if (i + j == size-1) {
						out.print("1");
					}
					else {
						out.print(" ");
					}
				}
				out.println();
			}
			out.println("Again? ");
			again = keystrokes.findWithinHorizon(".",0).charAt(0);//if i am sure that the user is going to enter only one character 
			again = Character.toLowerCase(again);
		}while (again == 'y');
		keystrokes.close();
	}

}
