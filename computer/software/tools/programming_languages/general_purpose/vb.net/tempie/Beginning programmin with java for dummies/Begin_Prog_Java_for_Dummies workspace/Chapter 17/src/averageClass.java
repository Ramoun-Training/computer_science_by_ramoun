import java.util.Scanner;
import static java.lang.System.out;

public class averageClass {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Average computer = new Average();
		Average science = new Average();
		Average mathematics = new Average();

		out.print("Enter lab: ");
		computer.lab = keyboard.nextInt();
		out.print("Enter final: ");
		computer.Final = keyboard.nextInt();
		out.print("Enter midterm: ");
		computer.midterm = keyboard.nextInt();
		out.println();

		out.print("Enter lab: ");
		science.lab = keyboard.nextInt();
		out.print("Enter final: ");
		science.Final = keyboard.nextInt();
		out.print("Enter midterm: ");
		science.midterm = keyboard.nextInt();
		out.println();

		out.print("Enter lab: ");
		mathematics.lab = keyboard.nextInt();
		out.print("Enter final: ");
		mathematics.Final = keyboard.nextInt();
		out.print("Enter midterm: ");
		mathematics.midterm = keyboard.nextInt();
		out.println();

		computer.average    = (float) (computer.Final + computer.lab + computer.midterm) / 3;
		mathematics.average = (float) (mathematics.Final + mathematics.lab + mathematics.midterm) / 3;
		science.average     = (float) (science.Final + science.lab+ science.midterm) / 3;

		out.println("computer Average: "    + computer.average);
		out.println("mathematics Average: " + mathematics.average);
		out.println("science Average: "     + science.average);

		keyboard.close();
	}

}
//Made with ♥ by R}AM#UN>
