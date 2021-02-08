import ramoun.io.*;
public class egp_change {

	public static void main(String[] args) {
		int piasters,bareeza,sheling,quarters;
		int whats_left;
		
		piasters = input.inputInt("How many piasters have you got?");
		
		quarters = piasters / 25;
		whats_left = piasters % 25;
		
		sheling = whats_left / 10;
		whats_left = whats_left % 10;
		
		bareeza = whats_left / 5;
		whats_left = whats_left % 5;
		
		System.out.printf("your %d piasters are divided into :",piasters);
		System.out.println();
		System.out.printf("%d quarter(s)\n",quarters);
		System.out.printf("%d sheling(s)\n",sheling);
		System.out.printf("%d bareeza(s)\n",bareeza);
		System.out.printf("%d piaster(s)\n",whats_left);
	}

}
