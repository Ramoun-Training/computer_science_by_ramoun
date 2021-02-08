import java.util.*;

public class exc {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter your age: ");
		int age = checkValid();
		
		if (age != 0) {
			System.out.println("you are " + age + " years old.");
		}
	}
	
	public static int checkValid() {
		int age;
		try {
			age = scanner.nextInt();
			return age;
		}
		catch(InputMismatchException e) {
			System.out.println("That's not a whole number.");
			scanner.nextLine();
			return 0;
		}
	}

}
