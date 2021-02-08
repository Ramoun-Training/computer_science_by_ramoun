package Chapter_10;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;

public class Enumerating {
	enum WhoWins {visitor,home,neither};
	public static void main(String[] args) {
		 Scanner strokes = new Scanner (System.in);
		 WhoWins winner;
		 int PSG = 0, FCB = 0;
		 
		 out.print("Enter the Final Score (PSG/FCB): ");
		 try {
			PSG = strokes.nextInt();
			FCB = strokes.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please,Enter valid data.");
			System.exit(0);
		}
		 
		 out.println();
		 if (PSG > FCB) {
			 winner = WhoWins.home;
			 out.println("The PSG Team Wins :=)");
		 }
		 else if (FCB > PSG) {
			 winner = WhoWins.visitor;
			 out.println("The FCB Team Wins :=(");
		 }
		 else {
			 winner = WhoWins.neither;
			 out.println("The Result is a Tie.");
		 }
		 
		 out.println();
		 out.println("====================");
		 out.println("Today's game is brought to you by:Apple Software Company.");
		 out.println();
		 
		 if (winner == WhoWins.home) {
			 out.println("ViVre LA France!!.");
		 }
		 else if (winner == WhoWins.visitor) {
			 out.println("We are Comming Back to Take the Cup.");
		 }
		 else {
			 out.println("The Game Goes into Overtime.");
		 }
		 
		 strokes.close();
	}

}
