import java.util.Scanner;//defined in the java api as a class
import java.util.Random;//defined in the java api as a class

public class ComputerKnowsItAll {
	/*
	 * this is an unusual program so we did some unusual code.
	 */
	public static void main(String[] args) {
		Scanner strokes = new Scanner(System.in);
		Random randomGenerator = new Random();
		// int random;

		System.out.print("Enter \"Yes or No Question\"? ");
		strokes.nextLine();

		// random=randomGenerator.nextInt(6)+1;//variables works as snapshots.

		if (randomGenerator.nextInt(6) + 1 > 4) {
			System.out.println("Yes,silly.");
		} else {
			System.out.println("No,and don't ask again.");
		}

		strokes.close();

	}

}
