import static java.lang.System.out;
import java.util.Scanner;

public class pointOfSale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantity;
		double price;
		double total;
		
		out.print("Enter the (price - quantity): ");
		price = input.nextDouble();
		quantity = input.nextInt();
		
		total = quantity * price;
		
		out.println("The Total Price is: $"+total);
		
		input.close();
	} 

}
