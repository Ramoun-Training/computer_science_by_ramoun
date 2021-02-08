package RecursiveMethods;

public class Power {

	public static void main(String[] args) {
		
	}
	
	/**
	 * a method that returns the base to the power 
	 * @param base is the base number
	 * @param power is the power that the base is raised to
	 * @return the base raised to the power 
	 */
	public static double power(double base, double power) {
		//the value returned depends on the power
		if (power == 0) {
			return 1;
		}
		else if (power > 0) {
			return base * power(base,power - 1);
		}
		else {
			return 0;
		}
	}
	
	public static void getInput() {
		
	}
}
