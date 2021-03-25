package org.man;

import java.math.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.text.NumberFormat;

public class ArrayLists {
	public static void main(String s []) {
		
		String os = System.getProperty("os.name");
		if (os.startsWith("Windows") || os.contains("Windows")) {
			System.out.println("Welcome windows Users.");
			System.out.println(os);
		}
		
	}
	
	
	
	
	public static void stringTokenizer() {
		Scanner keys = new Scanner(System.in);
		System.out.print("Enter your triple name: ");
		String y = keys.nextLine();
		StringTokenizer x = new StringTokenizer(y);
		

		System.out.println("First Name: " + x.nextToken());
		System.out.println("Middle Name: " + x.nextToken());
		System.out.println("Last Name: " + x.nextToken());
	
		keys.close();
	}

	
	
	public static void mathy() {
		int nf = NumberFormat.FRACTION_FIELD;
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter The values of The Factors <integer values only.>");
		System.out.print("A: ");
		int a = keys.nextInt();
		System.out.print("B: ");
		int b = keys.nextInt();
		System.out.print("C: ");
		int c = keys.nextInt();
		
		double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

		System.out.println("X1: " + Math.round(x1));
		System.out.println("x2: " + Math.round(x2));
		
		keys.close();
	}
}
