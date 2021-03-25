package ramoun.io;

import java.util.*;

/**
 * The Input class allows the user to input the type of data he wants.
 * It provides adding a prompt. 
 * 
 * @author <em><h2>R}AM#UN></h2>
 * <ul>
 * <li><p><a href = "http://www.facebook.com/Ramoun.X6">{@link @Facebook} </a></li>
 * <li><p><a href = "https://twitter.com/ramoun16">{@link @twitter}</a> </li>
 * </ul>
 * @since jul 1st 2017
 * @version 1.0.1 
 * 
 */
public class Input {
	//declaring a scanner instance as a global variable to carry out all input
	//scans in the whole class.
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * Scans the user integer input from the keyboard (whole number values) of type (byte)
	 * and returns the input value as a an integer of type (byte).
	 * <p>Provides the ability to add a prompt message to help the user.
	 * </br></br>
	 * <pre>       inputByte("Enter your age:");</pre>
	 * </br>
	 * 
	 * @exception InputMismatchExcpetion for non-byte input by the user
	 * @param prompt the prompt to help the user to input data
	 * <p><em>in other words: </em>show a message to the use on the screen</p>
	 * @return the integer input of the user 
	 * 
	 */
	public byte inputByte(String prompt) {
		//flag to help repeating the prompt and input if any exception raised
		boolean flag = false;
		
		//variable to store the user input
		byte ByteInput = 0;
		
		do {
			/*
			 * using a try block to catch any exception raised due to user input
			 */
			try {
				//prmpting the user of what to enter
				System.out.print(prompt);
				
				//using global variable scanner to get input from the user 
				//the input is of type <byte>
				ByteInput = scanner.nextByte();
				
				//turnning of the do...while() loop because the input has no exceptions
				flag = false;
			} catch (InputMismatchException e) {
				//whipping out old input(which caused the exception)
				scanner.nextLine();
				
				//informing the user to input correct acceptable data
				System.out.println("Please,Enter a whole nubmer.");
				
				//turnning on the do...while() loop to ask the user for input again
				flag = true;
			} catch (Exception e) {
				//just incase any other exception interupts the flow of the program
				//telling more info about that exception
				//to help solve it
				System.out.println("ERROR OCCURRED.");
				System.out.println("*Error Info:");
				System.out.println("message: " + e.getMessage());
				System.out.println("info: " + e.toString());
			} 
		} while (flag);
		
		//returning back the user input after making sure that is exception free
		return ByteInput;
	}

	/**
	 * Scans the user integer input from the keyboard (whole number values) of type (short)
	 * and returns the input value as a an integer of type (short).
	 * <p>Provides the ability to add a prompt message to help the user.
	 * </br></br>
	 * <pre>       inputShort("Enter your age:");</pre>
	 * </br>
	 * 
	 * @exception InputMismatchExcpetion for non-short input by the user
	 * @param prompt the prompt to help the user to input data
	 * <p><em>in other words: </em>show a message to the use on the screen</p>
	 * @return the integer input of the user 
	 * 
	 */
	public short inputShort(String prompt) {
		//flag to help repeating the prompt and input if any exception raised
		boolean flag = false;
		
		//variable to store the user input
		short shortInput = 0;
		
		do {
			/*
			 * using a try block to catch any exception raised due to user input
			 */
			try {
				//prmpting the user of what to enter
				System.out.print(prompt);
				
				//using global variable scanner to get input from the user 
				//the input is of type <short>
				shortInput = scanner.nextShort();
				
				//turnning of the do...while() loop because the input has no exceptions
				flag = false;
			} catch (InputMismatchException e) {
				//whipping out old input(which caused the exception)
				scanner.nextLine();
				
				//informing the user to input correct acceptable data
				System.out.println("Please,Enter a whole nubmer.");
				
				//turnning on the do...while() loop to ask the user for input again
				flag = true;
			} catch (Exception e) {
				//just incase any other exception interupts the flow of the program
				//telling more info about that exception
				//to help solve it
				System.out.println("ERROR OCCURRED.");
				System.out.println("*Error Info:");
				System.out.println("message: " + e.getMessage());
				System.out.println("info: " + e.toString());
			} 
		} while (flag);
		
		//returning back the user input after making sure that is exception free
		return shortInput;
	}

	/**
	 * Scans the user integer input from the keyboard (whole number values) of type (int)
	 * and returns the input value as a an integer of type (int).
	 * <p>Provides the ability to add a prompt message to help the user.
	 * </br></br>
	 * <pre>       inputInt("Enter your age:");</pre>
	 * </br>
	 * 
	 * @exception InputMismatchExcpetion for non-byte input by the user
	 * @param prompt the prompt to help the user to input data
	 * <p><em>in other words: </em>show a message to the use on the screen</p>
	 * @return the integer input of the user 
	 * 
	 */
	public int inputInt(String prompt) {
		//flag to help repeating the prompt and input if any exception raised
		boolean flag = false;
		
		//variable to store the user input
		int intInput = 0;
		
		do {
			/*
			 * using a try block to catch any exception raised due to user input
			 */
			try {
				//prmpting the user of what to enter
				System.out.print(prompt);
				
				//using global variable scanner to get input from the user 
				//the input is of type <int>
				intInput = scanner.nextInt();
				
				//turnning of the do...while() loop because the input has no exceptions
				flag = false;
			} catch (InputMismatchException e) {
				//whipping out old input(which caused the exception)
				scanner.nextLine();
				
				//informing the user to input correct acceptable data
				System.out.println("Please,Enter a whole nubmer.");
				
				//turnning on the do...while() loop to ask the user for input again
				flag = true;
			} catch (Exception e) {
				//just incase any other exception interupts the flow of the program
				//telling more info about that exception
				//to help solve it
				System.out.println("ERROR OCCURRED.");
				System.out.println("*Error Info:");
				System.out.println("message: " + e.getMessage());
				System.out.println("info: " + e.toString());
			} 
		} while (flag);
		
		//returning back the user input after making sure that is exception free
		return intInput;
	}

	/**
	 * Scans the user integer input from the keyboard (whole number values) of type (long)
	 * and returns the input value as a an integer of type (long).
	 * <p>Provides the ability to add a prompt message to help the user.
	 * </br></br>
	 * <pre>       inputByte("Enter your age:");</pre>
	 * </br>
	 * 
	 * @exception InputMismatchExcpetion for non-byte input by the user
	 * @param prompt the prompt to help the user to input data
	 * <p><em>in other words: </em>show a message to the use on the screen</p>
	 * @return the integer input of the user 
	 * 
	 */
	public long inputLong(String prompt) {
		//flag to help repeating the prompt and input if any exception raised
		boolean flag = false;
		
		//variable to store the user input
		long longInput = 0;
		
		do {
			/*
			 * using a try block to catch any exception raised due to user input
			 */
			try {
				//prmpting the user of what to enter
				System.out.print(prompt);
				
				//using global variable scanner to get input from the user 
				//the input is of type <long>
				longInput = scanner.nextLong();
				
				//turnning of the do...while() loop because the input has no exceptions
				flag = false;
			} catch (InputMismatchException e) {
				//whipping out old input(which caused the exception)
				scanner.nextLine();
				
				//informing the user to input correct acceptable data
				System.out.println("Please,Enter a whole nubmer.");
				
				//turnning on the do...while() loop to ask the user for input again
				flag = true;
			} catch (Exception e) {
				//just incase any other exception interupts the flow of the program
				//telling more info about that exception
				//to help solve it
				System.out.println("ERROR OCCURRED.");
				System.out.println("*Error Info:");
				System.out.println("message: " + e.getMessage());
				System.out.println("info: " + e.toString());
			} 
		} while (flag);
		
		//returning back the user input after making sure that is exception free
		return longInput;
	}

	/**
	 * Scans the user floating point input from the keyboard (floating point values) of type (float)
	 * and returns the input value as a an integer of type (float).
	 * <p>Provides the ability to add a prompt message to help the user.
	 * </br></br>
	 * <pre>       inputFloat("Enter your age:");</pre>
	 * </br>
	 * 
	 * @exception InputMismatchExcpetion for non-byte input by the user
	 * @param prompt the prompt to help the user to input data
	 * <p><em>in other words: </em>show a message to the use on the screen</p>
	 * @return the integer input of the user 
	 * 
	 */
	public float inputFloat(String prompt) {
		//flag to help repeating the prompt and input if any exception raised
		boolean flag = false;
		
		//variable to store the user input
		float floatInput = 0;
		
		do {
			/*
			 * using a try block to catch any exception raised due to user input
			 */
			try {
				//prmpting the user of what to enter
				System.out.print(prompt);
				
				//using global variable scanner to get input from the user 
				//the input is of type <byte>
				floatInput = scanner.nextFloat();
				
				//turnning of the do...while() loop because the input has no exceptions
				flag = false;
			} catch (InputMismatchException e) {
				//whipping out old input(which caused the exception)
				scanner.nextLine();
				
				//informing the user to input correct acceptable data
				System.out.println("Please,Enter a whole nubmer.");
				
				//turnning on the do...while() loop to ask the user for input again
				flag = true;
			} catch (Exception e) {
				//just incase any other exception interupts the flow of the program
				//telling more info about that exception
				//to help solve it
				System.out.println("ERROR OCCURRED.");
				System.out.println("*Error Info:");
				System.out.println("message: " + e.getMessage());
				System.out.println("info: " + e.toString());
			} 
		} while (flag);
		
		//returning back the user input after making sure that is exception free
		return floatInput;
	}

	/**
	 * Scans the user floating point input from the keyboard (floating point number values) of type (double)
	 * and returns the input value as a an integer of type (double).
	 * <p>Provides the ability to add a prompt message to help the user.
	 * </br></br>
	 * <pre>       inputByte("Enter your age:");</pre>
	 * </br>
	 * 
	 * @exception InputMismatchExcpetion for non-byte input by the user
	 * @param prompt the prompt to help the user to input data
	 * <p><em>in other words: </em>show a message to the use on the screen</p>
	 * @return the integer input of the user 
	 * 
	 */
	public double inputDouble(String prompt) {
		//flag to help repeating the prompt and input if any exception raised
		boolean flag = false;
		
		//variable to store the user input
		double doubleInput = 0;
		
		do {
			/*
			 * using a try block to catch any exception raised due to user input
			 */
			try {
				//prmpting the user of what to enter
				System.out.print(prompt);
				
				//using global variable scanner to get input from the user 
				//the input is of type <double>
				doubleInput = scanner.nextDouble();
				
				//turnning of the do...while() loop because the input has no exceptions
				flag = false;
			} catch (InputMismatchException e) {
				//whipping out old input(which caused the exception)
				scanner.nextLine();
				
				//informing the user to input correct acceptable data
				System.out.println("Please,Enter a whole nubmer.");
				
				//turnning on the do...while() loop to ask the user for input again
				flag = true;
			} catch (Exception e) {
				//just incase any other exception interupts the flow of the program
				//telling more info about that exception
				//to help solve it
				System.out.println("ERROR OCCURRED.");
				System.out.println("*Error Info:");
				System.out.println("message: " + e.getMessage());
				System.out.println("info: " + e.toString());
			} 
		} while (flag);
		
		//returning back the user input after making sure that is exception free
		return doubleInput;
	}

	/**
	 * Scans the user character input from the keyboard (one character value) of type (char)
	 * and returns the input value as a a character of type (char).
	 * <p>Provides the ability to add a prompt message to help the user.
	 * </br></br>
	 * <pre>       inputChar("Enter your age:");</pre>
	 * </br>
	 * 
	 * @exception InputMismatchExcpetion for non-byte input by the user
	 * @param prompt the prompt to help the user to input data
	 * <p><em>in other words: </em>show a message to the use on the screen</p>
	 * @return the character input of the user 
	 * 
	 */
	public char inputChar(String prompt) {
		//flag to help repeating the prompt and input if any exception raised
		boolean flag = false;
		
		//variable to store the user input
		char charInput = 0;
		
		do {
			/*
			 * using a try block to catch any exception raised due to user input
			 */
			try {
				//prmpting the user of what to enter
				System.out.print(prompt);
				
				//using global variable scanner to get input from the user 
				//the input is of type <char>
				charInput = scanner.findWithinHorizon(".", 0).charAt(0);
				
				//turnning of the do...while() loop because the input has no exceptions
				flag = false;
			} catch (InputMismatchException e) {
				//whipping out old input(which caused the exception)
				scanner.nextLine();
				
				//informing the user to input correct acceptable data
				System.out.println("Please,Enter a whole nubmer.");
				
				//turnning on the do...while() loop to ask the user for input again
				flag = true;
			} catch (Exception e) {
				//just incase any other exception interupts the flow of the program
				//telling more info about that exception
				//to help solve it
				System.out.println("ERROR OCCURRED.");
				System.out.println("*Error Info:");
				System.out.println("message: " + e.getMessage());
				System.out.println("info: " + e.toString());
			} 
		} while (flag);
		
		//returning back the user input after making sure that is exception free
		return charInput;
	}

	/**
	 * Scans the user String input from the keyboard (one word only) of type (String)
	 * and returns the input value as a word of type (String).
	 * <p>Provides the ability to add a prompt message to help the user.
	 * </br></br>
	 * <pre>       inputWord("Enter one word only:");</pre>
	 * </br>
	 * 
	 * @exception InputMismatchExcpetion for non-byte input by the user
	 * @param prompt the prompt to help the user to input data
	 * <p><em>in other words: </em>show a message to the use on the screen</p>
	 * @return the integer input of the user 
	 * 
	 */
	public String inputWord(String prompt) {
		//flag to help repeating the prompt and input if any exception raised
		boolean flag = false;
		
		//variable to store the user input
		String wordInput = null;
		
		do {
			/*
			 * using a try block to catch any exception raised due to user input
			 */
			try {
				//prmpting the user of what to enter
				System.out.print(prompt);
				
				//using global variable scanner to get input from the user 
				//the input is of type <String>
				wordInput = scanner.next();
				
				//turnning of the do...while() loop because the input has no exceptions
				flag = false;
			} catch (InputMismatchException e) {
				//whipping out old input(which caused the exception)
				scanner.nextLine();
				
				//informing the user to input correct acceptable data
				System.out.println("Please,Enter a whole nubmer.");
				
				//turnning on the do...while() loop to ask the user for input again
				flag = true;
			} catch (Exception e) {
				//just incase any other exception interupts the flow of the program
				//telling more info about that exception
				//to help solve it
				System.out.println("ERROR OCCURRED.");
				System.out.println("*Error Info:");
				System.out.println("message: " + e.getMessage());
				System.out.println("info: " + e.toString());
			} 
		} while (flag);
		
		//returning back the user input after making sure that is exception free
		return wordInput;
	}

	/**
	 * Scans the user String input from the keyboard (till the end of the line)
	 * and returns the input value as a String.
	 * <p>Provides the ability to add a prompt message to help the user.
	 * </br></br>
	 * <pre>       inputLine("Enter a whole line:");</pre>
	 * </br>
	 * 
	 * @exception InputMismatchExcpetion for non-byte input by the user
	 * @param prompt the prompt to help the user to input data
	 * <p><em>in other words: </em>show a message to the use on the screen</p>
	 * @return the integer input of the user 
	 * 
	 */
	public String inputLine(String prompt) {
		//flag to help repeating the prompt and input if any exception raised
		boolean flag = false;
		
		//variable to store the user input
		String lineInput = null;
		
		do {
			/*
			 * using a try block to catch any exception raised due to user input
			 */
			try {
				//prmpting the user of what to enter
				System.out.print(prompt);
				
				//using global variable scanner to get input from the user 
				//the input is of type <String>
				lineInput = scanner.nextLine();
				
				//turnning of the do...while() loop because the input has no exceptions
				flag = false;
			} catch (InputMismatchException e) {
				//whipping out old input(which caused the exception)
				scanner.nextLine();
				
				//informing the user to input correct acceptable data
				System.out.println("Please,Enter a whole nubmer.");
				
				//turnning on the do...while() loop to ask the user for input again
				flag = true;
			} catch (Exception e) {
				//just incase any other exception interupts the flow of the program
				//telling more info about that exception
				//to help solve it
				System.out.println("ERROR OCCURRED.");
				System.out.println("*Error Info:");
				System.out.println("message: " + e.getMessage());
				System.out.println("info: " + e.toString());
			} 
		} while (flag);
		
		//returning back the user input after making sure that is exception free
		return lineInput;
	}

	/**
	 * Scans the user boolean input from the keyboard (boolean values only) of type (boolean)
	 * and returns the input value as a boolean value (true or false).
	 * <p>Provides the ability to add a prompt message to help the user.
	 * </br></br>
	 * <pre>       inputBoolean("Are you single?");</pre>
	 * </br>
	 * 
	 * @exception InputMismatchExcpetion for non-byte input by the user
	 * @param prompt the prompt to help the user to input data
	 * <p><em>in other words: </em>show a message to the use on the screen</p>
	 * @return the integer input of the user 
	 * 
	 */
	public boolean inputBoolean(String prompt) {
		//flag to help repeating the prompt and input if any exception raised
		boolean flag = false;
		
		//variable to store the user input
		boolean booleanInput = true;
		
		do {
			/*
			 * using a try block to catch any exception raised due to user input
			 */
			try {
				//prmpting the user of what to enter
				System.out.print(prompt);
				
				//using global variable scanner to get input from the user 
				//the input is of type <boolean>
				booleanInput = scanner.nextBoolean();
				
				//turnning of the do...while() loop because the input has no exceptions
				flag = false;
			} catch (InputMismatchException e) {
				//whipping out old input(which caused the exception)
				scanner.nextLine();
				
				//informing the user to input correct acceptable data
				System.out.println("Please,Enter a whole nubmer.");
				
				//turnning on the do...while() loop to ask the user for input again
				flag = true;
			} catch (Exception e) {
				//just incase any other exception interupts the flow of the program
				//telling more info about that exception
				//to help solve it
				System.out.println("ERROR OCCURRED.");
				System.out.println("*Error Info:");
				System.out.println("message: " + e.getMessage());
				System.out.println("info: " + e.toString());
			} 
		} while (flag);
		
		//returning back the user input after making sure that is exception free
		return booleanInput;
	}

	public static void main(String[] args) {
		
	}
}
