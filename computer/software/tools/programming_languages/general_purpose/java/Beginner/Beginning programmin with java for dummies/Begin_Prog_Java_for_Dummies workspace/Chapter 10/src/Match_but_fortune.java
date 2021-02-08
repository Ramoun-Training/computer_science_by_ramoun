import java.util.Random;
import static java.lang.System.out;

public class Match_but_fortune {

	public static void main(String[] args) {
		Random generator = new Random();
		int hankees,socks;
		
		hankees = generator.nextInt(30) + 1;
		socks = generator.nextInt(30) + 1;
		
		if (hankees > socks) {
			out.println("HANKEES WON!!");
		}
		else if (socks > hankees) {
			out.println("SOCKS WON!!");
		}
		else {
			out.println("IT'S A TIE:");
		}

		out.println("-------------------------------------");
		out.println("SOCKS : "+socks+"	  |   HANKEES : "+hankees);
		out.println("-------------------------------------");
	}

}
