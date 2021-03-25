package Chaper_8;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CelisuisToFahrenheit {

	public static void main(String[] args) {
		Scanner stroke=new Scanner(System.in);
		double c = 0, f;

		System.out.print("Enter Celisuis Tempreture: ");
		try {
			c=stroke.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input,please.");
			System.exit(0);
		}

		f=9.0/5*c+32;//don't forget that division happens first (numbers should be floats)

		System.out.print("Room Tempreture: ");
		System.out.println(f + " f");//fix this line of code

		stroke.close();
	}

}
