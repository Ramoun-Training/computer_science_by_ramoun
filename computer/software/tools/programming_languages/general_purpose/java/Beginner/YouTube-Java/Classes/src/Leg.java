/**
 * A leg object has toes, one calf and can walk and stop.
 * 
 * @author R}AM#UN>
 * @version 1.0 
 * @since 7/17/2017
 *
 */
public class Leg {
	public int toes = 5;
	public static boolean calf = true;
	public boolean walk;
	
	/**
	 * a method that turns walk variable to true
	 * 
	 * @return walk variable in the true form
	 */
	public boolean walk() {
		return walk = true;
	}
	
	/**
	 * turns the walk variable to false
	 * 
	 * @return false
	 */
	public boolean stop() {
		return walk = false;
	}
	
	/**
	 * compares between 2 passed-as-arguments legs in number of toes.
	 * 
	 * @param l1 The first leg we want to compare
	 * @param l2 The second leg we want to compare
	 * @return The leg that has more toes.
	 */
	public static Leg bigger(Leg l1, Leg l2) {
		if (l1.toes > l2.toes) {
			return l1;
		}
		else {
			return l2;
		}
	}
	
	/**
	 * constructs a leg with specified number of toes.
	 * 
	 * @param toes Number of toes in the leg constructed
	 */
	public Leg(int toes) {
		this.toes = toes;
		/*
		 * if this program was more advanced i would more info 
		 * about constructing the leg visually and internally with
		 * code.
		 */
	}
	
}
