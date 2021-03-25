import java.util.*;
import static java.lang.System.*;
/**
 * there is another copy of this class with the name me.java
 */
class Controller {


	public static void main(String[] args) {

	}
	
	
	public static String randomCapitalization() {
		Scanner scanner = new Scanner(System.in);
		Random gen = new Random();
		int random;
		
		System.out.print("Enter your statement: ");
		String input = scanner.nextLine();
		char [] c_arr = input.toCharArray();
		
		
		for (int i = 0; i < c_arr.length; i++) {
			random = gen.nextInt(c_arr.length);
			
			
			if (Character.isUpperCase(c_arr[random])) {
				/*the toLowerCase() method returns a copy of the letter passed to it in lower case
				that is why i needed to replace the old character in the same place by using the 
				assignment statement.*/
				c_arr[random] = Character.toLowerCase(c_arr[random]);
			}
			else {
				c_arr[random] = Character.toUpperCase(c_arr[random]);
			}
		}
		
		System.out.println(c_arr);
		
		scanner.close();

		return String.valueOf(c_arr);
	}


	public static String randomCapitalization(String input) {
		Random gen = new Random();
		int random;
		
		char [] c_arr = input.toCharArray();
		
		
		for (int i = 0; i < c_arr.length; i++) {
			random = gen.nextInt(c_arr.length);
			
			
			if (Character.isUpperCase(c_arr[random])) {
				/*the toLowerCase() method returns a copy of the letter passed to it in lower case
				that is why i needed to replace the old character in the same place by using the 
				assignment statement.*/
				c_arr[random] = Character.toLowerCase(c_arr[random]);
			}
			else {
				c_arr[random] = Character.toUpperCase(c_arr[random]);
			}
		}
		
		System.out.println(c_arr);

		return String.valueOf(c_arr);
	}
	
	public static String daffyDuck() {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.print("Enter a statement that contains 's' letter: ");
		input = scanner.nextLine();
		
		if (input.contains("s") || input.contains("S")) {
			input = input.replaceAll("s", "th");
			input = input.replaceAll("S", "TH");
		}
		
				
		System.out.println(input);
		
		scanner.close();

		return input;
	}


	public static String daffyDuck(String input) {
		
		if (input.contains("s") || input.contains("S")) {
			input = input.replaceAll("s", "th");
			input = input.replaceAll("S", "TH");
		}
		
				
		System.out.println(input);

		return input;
	}

	public static void divide() {
		Scanner scanner = new Scanner(System.in);
		//defining the 2 numbers and a variable sum to hold them sum
		int x = 0,y = 0,sum;
		boolean ifFlag = true;
		boolean whileFlag = false;
		
		do {
			scanner = new Scanner(System.in);
			try {
				System.out.println("Enter first number: ");
				x = scanner.nextInt();
				System.out.println("Enter second number:");
				y = scanner.nextInt();
				ifFlag = true;
			} catch (InputMismatchException e) {
				System.out.println("you have an input mismatch exception.");
				ifFlag = false;
				whileFlag = true;
			}
			if (ifFlag) {
				try {
					sum = x / y;
					System.out.println(sum);
					whileFlag = false;
				} catch (ArithmeticException e) {
					System.out.println("you have an arithmetic exception.");
					whileFlag = true;
				}
			} 
		} while (whileFlag);
		
		scanner.close();
	}

	public static String vowls() {
		Scanner scanner = new Scanner(in);
		String input;

		out.print("Enter a statement that contains vowls: ");
		input = scanner.nextLine();

		/*
			it is possible to write all the replaceAll() method lines w/out an if statement
			becaue replaceAll() method returns a copy of modified text if letter exist
			and does nothing to the text (input) if letter doesn't exist.
		*/
		if (input.contains("a") || input.contains("A")) {
			input = input.replaceAll("a", "");
			input = input.replaceAll("A", "");
		}

		if (input.contains("e") || input.contains("E")) {
			input = input.replaceAll("e", "");
			input = input.replaceAll("E", "");
		}

		if (input.contains("o") || input.contains("O")) {
			input = input.replaceAll("o","");
			input = input.replaceAll("O", "");
		}

		if (input.contains("i") || input.contains("I")) {
			input = input.replaceAll("i", "");
			input = input.replaceAll("I", "");
		}

		if (input.contains("u") || input.contains("U")) {
			input = input.replaceAll("u", "");
			input = input.replaceAll("U", "");
		}

		out.println(input);

		scanner.close();

		return input;
	}

	public static String vowls(String input) {
		/*
			it is possible to write all the replaceAll() method lines w/out an if statement
			becaue replaceAll() method returns a copy of modified text if letter exist
			and does nothing to the text (input) if letter doesn't exist.
		*/
		if (input.contains("a") || input.contains("A")) {
			input = input.replaceAll("a", "");
			input = input.replaceAll("A", "");
		}

		if (input.contains("e") || input.contains("E")) {
			input = input.replaceAll("e", "");
			input = input.replaceAll("E", "");
		}

		if (input.contains("o") || input.contains("O")) {
			input = input.replaceAll("o","");
			input = input.replaceAll("O", "");
		}

		if (input.contains("i") || input.contains("I")) {
			input = input.replaceAll("i", "");
			input = input.replaceAll("I", "");
		}

		if (input.contains("u") || input.contains("U")) {
			input = input.replaceAll("u", "");
			input = input.replaceAll("U", "");
		}

		out.println(input);

		return input;
	}
}
