package math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prompt {
	
	//creating a global scanner variable
	static Scanner keys = new Scanner(System.in);
	
	static void choose (int choice) {
		//creating new local scanner variable to avoid exceptions in the console
		Scanner keys = new Scanner(System.in);
		
		//declaring 2 variables to hold value throw the program below 
		double a;
		double b;
		
		//the program itself
		try {
			switch (choice) {
				case 1:
					/*
					 case of square root option 
					 */
					
					//prompting for number to get its square root
					System.out.print("Enter The Number: ");
					a = keys.nextDouble();
					
					//computing the square root using the sqrt method and show the result in the console
					System.out.println("The Square Root is : " + MathMethods.sqrt(a));
					break;
				
				case 2:
					/*
					 case of power option
					 */
					
					//getting the base number from the user
					System.out.print("Enter The Base Number: ");
					a = keys.nextDouble();
					
					//getting the power from the user
					System.out.print("Enter The Power: ");
					b = keys.nextDouble();
					
					//computing the power and showing the result to the console
					System.out.println(a + " to the power of " + b + " is : " + MathMethods.pow(a,b));
					break;
					
				case 3:
					/*
					 case of area of rectangle option
					 */
					
					//getting the length of the rectangle
					System.out.print("Enter Length of Rectangle: ");
					a = keys.nextDouble();
					
					//getting the width of the rectangle
					System.out.print("Enter Width of Rectangle: ");
					b = keys.nextDouble();
					
					//computing the rectangle area using the rectArea() method and showing the result to the console
					System.out.println("The Rectangle Area is : " + MathMethods.rectArea(a,b));
					break;
					
				case 4:
					/*
					 case of circumference of rectangle option
					 */
					
					//getting the length of the rectangle
					System.out.print("Enter Length of Rectangle: ");
					a = keys.nextDouble();
					
					//getting the width of the rectangle
					System.out.print("Enter Width of Rectangle: ");
					b = keys.nextDouble();
					
					//computing the circumference of the rectangle using the rectCirc() method and showing the result to the console
					System.out.println("The Circumference of Rectangle is : " + MathMethods.rectCirc(a,b));
					break;
					
				case 5:
					/*
					 case of division option
					 */
					
					//getting the dividend from the user
					System.out.print("Enter The Dividend: ");
					a = keys.nextDouble();
					
					//getting the divisor from the user
					System.out.print("Enter The Divisor: ");
					b = keys.nextDouble();
					
					//computing the division and showing the result to the console
					System.out.println("The division of " + a + "/" + b +" is : " + MathMethods.div(a,b));
					break;
					
				default:
					/*
					 case of not range number chosen by user
					 */
					
					//prompting the user to input in range values
					System.out.println("Enter valid Number of Choice ,Please.");
					
					//showing options for quitting, restarting the app
					exitPrompt();
				}
		} catch (InputMismatchException e) {
			//prompting the user to input meaningful input
			System.out.println("please,Check your Input and Try Again.");
		}
		
		//closing the local scanner
		keys.close();
		
		//showing options for quitting, restarting the app
		exitPrompt();
	}

	static void exitPrompt() {
		//creating a new local scanner variable to avoid exceptions in the compiler
		//these exceptions are raised due to using the global scanner throw the whole program
		Scanner keys = new Scanner(System.in);
		
		//variable to store the user optiong
		int exit = 0;
		
		//prompting the user with the option he has
		System.out.println();
		System.out.println("######Choose One of The following Options######");
		System.out.println("1 : Exit The App.");
		System.out.println("2 : Restart The App.");
		System.out.println("3 : Choose Again.");
		System.out.println("===============================================");
		System.out.print("-=> ");
		
		try {
			//getting the option from the user
			exit = keys.nextInt(3);
			
		} catch (InputMismatchException e) {
			//showing messages to the user to inform him/her of what went wrong
			System.out.println("Invalid Input....");
			System.out.println("Type 1 or 2 or 3 only.");
			
			//recursive call to the method till the program gets useful input from the user
			exitPrompt();
		}
		
		//closing the local scanner
		keys.close();
	}
	
	static void wannaExit (int e) {
		//creating a new local scanner variable in order to avoid exceptions raised by the compiler
		//due to wrong input by the user
		Scanner keys = new Scanner(System.in);
		
		
		switch (e) {
			case 1:
				/*
				 case of exiting the program option
				 */
				
				//exit the program now
				System.exit(0);
				break;
			
			case 2:
				/*
				  case of restarting the program again
				 */
				
				//call for the start() method that holds the main program
				start();
				break;
				
			case 3: 
				/*
				 case of choosing another number again
				 */
				
				try {
					//getting a number again
					System.out.print("Choose a Number: ");
					choose(keys.nextInt());
					
				} catch (InputMismatchException e1) {
					//informing the user of what is wrong with his input
					System.out.println("Enter one of the Numbers Above.");
					
					//shutting down the program
					System.out.println("*Program Shutdwon");
					System.exit(0);
				}
				break;
				
			default:
				//informing the user of the right input he should have entered
				System.out.println("Man Just Enter a number from 1 to 3.");
				System.out.println("Is That hard? ");
				
				//closing the program
				System.out.println("*Program Shutdwon");
				System.exit(0);
		}
		
		//closing the local scanner
		keys.close();
	}
	
	public static void start() {
		//variable to store the number of the option chosen by the user
		int choice = 0;
		
		//flag to indicate input mismatch exception
		boolean flag = false;
		
		
		//Prompting the User to know what to do
		System.out.println("====This is a Mathimatical program====");
		System.out.println("Choose one of the following:");
		System.out.println("\t***(Type the Number of your Choice)***");
		System.out.println("1 : Compute Square Root.");
		System.out.println("2 : Compute Power of a Number.");
		System.out.println("3 : Compute Area of Rectangle.");
		System.out.println("4 : Compute Circumference of Rectangle.");
		System.out.println("5 : Compute the Division of 2 Numbers.");
		System.out.println("------------------------------------------------");
		System.out.print("-=> ");
		
		try {
			//getting the number of option chosen by the user
			choice = keys.nextInt();
			
		} catch (InputMismatchException e) {
			//informing the user of valid data input
			System.out.println("Please,Enter valid Data.");
			System.out.println("Enter one of the Numbers Above.");
			flag = true;
		}
		
		if (flag) {
			/*
			 in case of input mismatch exception 
			 */
			
			//giving the user option the quit, restart the app
			exitPrompt();
		}
		else {
			/*
			 in case valid input
			 */
			
			//passing the chosen number stored in choice variable to choose() method
			choose(choice);
		}
		
	}
	
	
}
