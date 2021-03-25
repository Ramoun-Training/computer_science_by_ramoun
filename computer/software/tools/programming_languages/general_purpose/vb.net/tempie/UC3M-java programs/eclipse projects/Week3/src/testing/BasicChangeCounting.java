package testing;

import java.util.Scanner;

public class BasicChangeCounting {

	public static void main(String[] args) {
		//creating a scanner variable
		Scanner scanner = new Scanner(System.in);
		
		//final result -> pounds computed
		double pounds;
		
		//number of piasters
		System.out.println("Enter number of piasters:");
		int piasters = scanner.nextInt();

		//number of quarters
		System.out.println("Enter number of quarters:");
		int quarters = scanner.nextInt();
		
		//number of halfs
		System.out.println("Enter number of halfs:");
		int halfs = scanner.nextInt();
		
		//closing the scanner
		scanner.close();
		
		//using delimiter
		//scanner.useDelimiter("//.");
		
		piasters = piasters + quarters * 25 + halfs * 50;
		pounds = piasters / 100;
		
		//showing the result in the console
		System.out.println("===================================");
		System.out.println("Total piasters: " + piasters + " Piasters.");
		System.out.println("-> You have " + (int)pounds + " Pounds and " + piasters % 100 + " Piasters <-");
		
	}

}
