package testing;

import java.util.*;

import math.MathMethods;

public class ScannerTest {

	static Scanner keys = new Scanner(System.in);
	
	public static void pain(String[] args) {
		String g = null;
		
		try {
			System.out.println("Enter a number:");
			int y = keys.nextInt();//getting integer input.
		} catch (InputMismatchException e) {
			System.out.println("oh no it is not working");
			again();
		}
		keys.close();
	}
	
	public static void again() {
		System.out.println("Try again: ");
		try {
			int x = keys.nextInt();//trying to get the number again.
		} catch (InputMismatchException e) {
			System.out.println("Enter shit");
		}
	}
	
		
	
	public static void m1() {
		Scanner keys = new Scanner(System.in);
		int y = keys.nextInt();
		
		System.out.println(y);
		
		keys.close();
	}
	
	public static void m2() {
		int x = 0;
		try {
			x = keys.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("never mind ");
		}
	
		
		System.out.print(x+ " ");
		
		m1();
		
		keys.close();
	}
	
	public static void m3() {
		keys.nextInt();
		keys.nextInt();
	}

	public static void main(String[] args) {
		System.out.println("\u8363");
	}
}
