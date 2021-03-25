import static java.lang.System.out;
import java.util.Scanner;

public class ChessBoard {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int size;
		
		out.print("Enter the size: ");
		size = keyboard.nextInt();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i % 2 == 0  &&  j % 2 == 0) {
					out.print("1");
				}
				else if ((i + 1) % 2 == 0  &&  (j + 1) % 2 == 0) {
					out.print("1");
				}
				else {
					out.print("0");
				}
				/*
				 * if (i +j) % 2 == 0 --->
				 * else print(0);
				 */
			}
			out.println();
		}
		
		keyboard.close();
	}

}
