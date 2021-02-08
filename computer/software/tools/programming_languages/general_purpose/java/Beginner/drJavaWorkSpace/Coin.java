import java.util.Random;


public class Coin {

	public enum Face {HEADS, TAILS}
	
	public static Face toss () {
		Random gen = new Random();
		int n = gen.nextInt(2);

		if (n == 1) {
			return Face.HEADS;
		} else {
			return Face.TAILS;
		}
	}

}