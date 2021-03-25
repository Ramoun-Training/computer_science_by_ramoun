package ramoun.io;

import java.util.*;

public class input {
	
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {
		//key.useLocale(Locale.FRANCE);
		//int x = inputInt("Enter your age:");

	}
	
	public static char inputChar(String prompt) {
		System.out.println(prompt + " ");
		char x = key.findWithinHorizon(".", 0).charAt(0);
		return x;
	}

	public static int inputInt(String prompt) {
		System.out.print(prompt + " ");
		int x = key.nextInt();
		return x;
	}

	public static double inputDouble(String prompt) {
		System.out.print(prompt + " ");
		double x = key.nextDouble();
		return x;
	}

	public static float inputFloat(String prompt) {
		System.out.print(prompt + " ");
		float x = key.nextInt();
		return x;
	}

	public static String inputString(String prompt) {
		System.out.print(prompt + " ");
		String x = key.nextLine();
		return x;
	}

	public static byte inputByte(String prompt) {
		System.out.print(prompt + " ");
		byte x = key.nextByte();
		return x;
	}

	public static short inputShort(String prompt) {
		System.out.print(prompt + " ");
		short x = key.nextShort();
		return x;
	}

	public static boolean inputBoolean(String prompt) {
		System.out.print(prompt + " ");
		boolean x = key.nextBoolean();
		return x;
	}

	public static long inputLong(String prompt) {
		System.out.print(prompt + " ");
		long x = key.nextLong();
		return x;
	}

}
