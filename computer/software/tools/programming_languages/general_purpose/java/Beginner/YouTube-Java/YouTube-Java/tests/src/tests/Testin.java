package tests;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Testin {

	static String operand = "";
	static String length;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the length: ");
		length = reader.nextLine();
		System.out.println();
		
		if (length.isEmpty()) {
			length = "5";
		} else if (length.equals("q") || length.equals("exit")) {
			System.exit(0);
		} else if (length.contains("*")) {
			length = operand('*');
		} else if (length.contains("+")) {
			length = operand('+');
		}
		
		for (int counter = 1; counter <= Integer.parseInt(length); counter++) {
			System.out.println("^");
			for (int j = 0; j < counter; j++) {
				System.out.print(" ");
			}
		}
		
		reader.close();
	}
	
	public static String[] fill() {
		Scanner scanner = new Scanner(System.in);
		int numberOfKids;
		int i = 0;
		String name;
		String [] nameOfKids = null;
		
		try {
			System.out.print("Enter the number of kids:");
			numberOfKids = scanner.nextInt();
			nameOfKids = new String[numberOfKids];
			while ( i < numberOfKids) {
				scanner = new Scanner(System.in);
				System.out.print("Enter kid #" + (i+1) +" Name:");
				name = scanner.nextLine();
				nameOfKids[i] = name;
				i++;
			}
		} catch (InputMismatchException ime) {
			System.out.println("Please, Enter a whole number.");
		} catch (Exception e) {
			System.out.println("An Error of type \"" + e.getClass() +"\" happened;");
			System.out.println("it throws the following message:");
			System.out.println(e.getMessage());
		}
		
		scanner.close();
		
		return nameOfKids;
	}

	public static void show(String [] names) {
		System.out.println("{");
		for (String name : names) {
			System.out.print(name);
			if (!(name.equals(names[(names.length - 1)]))) {
				System.out.println(", ");
			} else {
				System.out.println();
			}
		}
		System.out.println("}");
	}

	public static boolean search(String [] names, String wanted) {
		boolean found = false;
		for (int i = 0; i < names.length; i++) {
			if (wanted.equals(names[i])) {
				found = true;
				break;
			} else {
				found = false;
			}
		}
		
		return found;
	}

	public static String operand(char operator) {
		int i = 0;
		
		while (length.charAt(i) != operator) {
			i++;
		}
		
		for (i++; i < length.length(); i++) {
			operand += String.valueOf(length.charAt(i));
		}
		
		switch (operator) {
			case '*' :
				length = String.valueOf(5 * Integer.parseInt(operand));
				break;
			
			case '+' :
				length = String.valueOf(5 + Integer.parseInt(operand));
				break;
				
			default : 
				length = "5";
		}
		
		return length;
	}
}
