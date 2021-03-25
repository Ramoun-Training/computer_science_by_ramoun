package math;

import java.util.Scanner;

/**
 * class of basic math methods to help in mathematical problems.
 * Methods such: square root, area of rectangle, circumference of rectangle, power, division
 * 
 * @author R}AM#UN>
 * @version 0.1 build 3000 7/16/2017
 * 
 */
public class MathMethods {
	
	//creating a global scanner variable
	static Scanner keys = new Scanner(System.in);
	
	/**
	 * Calculates the square root of a (passed-as-an-argument number) x.
	 * 
	 * @param x number which we need to calculate the square root for.
	 * @return the square root of the passed argument x.
	 */
	public static double sqrt (double x) {
		//getting the square root of variable x and store it in variable root.
		double root = Math.sqrt(x);
		
		//returning the variable root
		return root;
	}
	
	/**
	 * A method that calculates the area of a rectangle
	 * 
	 * @param length The length of the rectangle 
	 * @param width  The width of the rectangle
	 * @return The area of the rectangle
	 */
	public static double rectArea (double length, double width) {
		double area = length * width;
		return area;
	}
	
	/**
	 * A method that calculates the circumference of a rectangle.
	 * 
	 * @param length The length of the rectangle.
	 * @param width The width of the rectangle.
	 * @return The circumference of the rectangle.
	 */
	public static double rectCirc (double length, double width) {
		//computing the circumference of the rectangle and storing the result in variable circ
		double circ = (length + width) * 2;
		return circ;
	}
	
	public static double pow (double a, double b) {
		//copying the value of a (the base) to variable result
		double result = a;
		
		//creating variable peace that gonna store the final result
		double peace = 1;
		
		//computing the peace variable by multiplying the old value of peace by the result (a) variable
		for (int i = 0; i < b; i++) {
			peace = peace * result;
		}
		
		//storing peace value into result variable
		result = peace;
		
		return result;
	}
	
	public static double div (double x, double y) {
		double result;
		result = x / y;
		return result;
	}

	
}
