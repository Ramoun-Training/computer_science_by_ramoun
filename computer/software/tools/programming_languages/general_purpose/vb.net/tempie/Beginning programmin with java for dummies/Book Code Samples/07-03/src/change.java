import ramoun.io.*;
public class change {

	public static void main(String[] args) {
		int cents,nickles,quarters,dimes;
		int whats_left;
		
		cents = input.inputInt("How many cents have you got?");
		
		quarters = cents / 25;
		whats_left = cents % 25;
		
		dimes = whats_left / 10;
		whats_left = whats_left % 10;
		
		nickles = whats_left / 5;
		whats_left = whats_left % 5;
		
		
		System.out.printf("you have %d cents ,that can be divided into: ->\n",cents);
		System.out.println();
		System.out.printf("%d Quarter(s)\n",quarters);
		System.out.printf("%d dime(s)\n",dimes);
		System.out.printf("%d nickel(s)\n",nickles);
		System.out.printf("%d cent(s)\n",whats_left);
	}

}
