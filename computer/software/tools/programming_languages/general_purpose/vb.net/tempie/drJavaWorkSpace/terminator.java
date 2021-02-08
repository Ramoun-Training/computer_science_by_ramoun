import static java.lang.System.*;

/**
 * add the termination condition to the recursive method
 *
 * Do not change the method or class
 * declarations.
 */

class Termination {

	public static void main(String[] args) {
		
	}

	public static int factorial(int number){
		if (number == 1) {
			return 1;
		} else {
			System.out.println("At factorial(" + number + ")");
			return number * factorial(number - 1);//pointer
		}
    }
}