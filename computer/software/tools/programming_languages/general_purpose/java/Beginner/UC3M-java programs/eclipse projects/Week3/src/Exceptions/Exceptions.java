package Exceptions;
import java.math.BigDecimal;
import java.util.*;

public class Exceptions {
	
	public static String div(double a, double b) {
		BigDecimal bigA = new BigDecimal(a);
		BigDecimal bigB = new BigDecimal(b);
		
		try {
			return String.valueOf(bigA.divide(bigB, 2, BigDecimal.ROUND_HALF_DOWN));
		} catch (ArithmeticException e) {
			return "infinity";
		}
	}
	
	public static String input() {
		Scanner inputScanner = new Scanner(System.in);
		double a = 0;
		double b = 0;
		
		try {
			System.out.print("Enter the first number: ");
			a = inputScanner.nextDouble();
			System.out.print("Enter the second nubmer: ");
			b = inputScanner.nextDouble();
		} 
		catch (InputMismatchException ime) {
			System.out.println("please, Enter valid data.");
			System.out.println();
			System.out.println("==========================");
			input();
		}
		catch (Exception e) {
			System.out.println("Something went Wrong.");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		finally {
			inputScanner.close();
		}
		
		return a + "  " + b;
	}
	
	public static void main(String[] args) {
		String nums = input();
		Scanner scanner = new Scanner(nums);
		System.out.println("The answer: " + 
							div(scanner.nextDouble(),scanner.nextDouble()));
		
		scanner.close();
	}

}
