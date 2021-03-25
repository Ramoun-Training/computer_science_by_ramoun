//import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class CardsGame21_Updated {
	/*
	 * needs more fixing
	 */
	public static void main(String[] args) {
		Scanner keystrokes = new Scanner(System.in);
		//Random generator = new Random ();
		int player1 = 0;
		int player2 = 0;
		int total=0;
		
		out.println("Player1    Player2");
		while (total < 21) {
			if (player1 > 20)break;
			if (player2 > 20)break;
			player1 = keystrokes.nextInt();
			player2 = keystrokes.nextInt();
			total = (player1 > player2 ? player1 : player2);
			out.print(player1);
			out.print("		  ");
			out.println(player2);
		}
		
		if (player1 < 21) {
			out.println("Player1 -> You Win :-)");
			out.println("Player2 -> You lose :-)");
		}
		
		if (player2 < 21) {
			out.println("Player1 You Lose :-(");
			out.println("player2 You Win :-)");
		}
		
		keystrokes.close();
	}

}
