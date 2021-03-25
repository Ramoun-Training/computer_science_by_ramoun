import static java.lang.System.out;
import java.util.Scanner;
public class ZigZagMaze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		
		out.print("Enter the size of the maze: ");
		size = input.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i % 2 == 0) {
					out.print("1");
				}
				else if (j == size - 1  &&  (i - 1) % 4 == 0) {
					out.print("1");
				}
				else if (j == 0  &&  /*(i + 1) % 4 == 0*/(i - 1) % 4 == 2) {
					out.print("1");
				}
				else {
					out.print(" ");
				}
			}
			out.println();
		}
		
		input.close();
	}

}
