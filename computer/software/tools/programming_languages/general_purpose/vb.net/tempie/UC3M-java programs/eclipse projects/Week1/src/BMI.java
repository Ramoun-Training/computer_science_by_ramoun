import static java.lang.System.out;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double height, weight, BMI;
		String category;
		
		out.print("Your Height: ");
		height = keyboard.nextDouble();
		out.print("Your Weight: ");
		weight = keyboard.nextDouble();
		
		BMI = weight / (height * height);
		
		if (BMI < 18.5) {
			category = "underWeight";
		}
		else if (BMI >= 18.5 && BMI < 25) {
			category = "noramlWeight";
		}
		else if (BMI >= 25 && BMI < 30) {
			category = "overWeight";
		}
		else if (BMI >= 30) {
			category = "obese";
		}
		else {
			category = "input data error";
		}
		
		out.println("YOUR BMI: " + BMI + " -> " + category);
		
		keyboard.close();
	}

}
