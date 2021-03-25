/**
 * A Hand object has 5 fingers that can be changed, one bi muscle, 
 * one tri muscle and one wrest muscle.
 * 
 * @author <a href = "https://facebook.com/Ramoun.X6"> R}AM#UN> </a>
 * @version 1.0
 * @since 7/17/2017
 */

public class Hand {
	public int fingers = 5;
	public static final int BI = 1;
	public static final int TRI = 1;
	public static final int WREST = 1;
	public static boolean open;
	
	/**
	 * turns open vairable to true
	 * 
	 * @return The open variable in true form.
	 */
	public boolean open() {
		return open = true;
	}
	
	/**
	 * turns open variable to false
	 * 
	 * @return The open variable in false form.
	 */
	public boolean close() {
		return open = false;
	}
	
	/**
	 * checks which hand has more fingers.
	 * 
	 * @param h1 The first hand passed to the method.
	 * @param h2 The Second hand passed to the method.
	 * @return The bigger in number of fingers hand.
	 */
	public static Hand bigger(Hand h1, Hand h2) {
		if (h1.fingers > h2.fingers) {
			return h1;
		}
		else {
			return h2;
		}
	}
	
	/**
	 * constructs fingers of the hand
	 * @param fingers number of fingers needed in the constructed hand
	 */
	public Hand(int fingers) {
		this.fingers = fingers;
		/*
		 * if this program was more advanced i would add more instructions
		 * to construct a hand internelly in code and graphically.
		 */
	}

}
