import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class CardsGame21 {
	
	public static void main(String[] args) {
		Random generator = new Random ();
		Scanner keys = new Scanner(System.in);
		String var;
		int cards;
		int total = 0;
		
		out.println("CARDS     TOTAL");
		while (total < 21) {
			cards = generator.nextInt(10) + 1;
			total = total + cards;
			out.print(cards);
			out.print("         ");
			out.println(total);
			var = keys.next();
			if (var.equals("")) continue;
			else continue;
		}
		
		if (total == 21) {
			out.println("You Win :-)");
		}
		else {
			out.println("You Lose :-(");
		}
		
		keys.close();
	}

}
