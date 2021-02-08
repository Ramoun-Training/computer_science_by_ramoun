import java.util.Scanner;

class CharCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		int i;

		System.out.print("Enter Text: ");
		input = scanner.nextLine();

		System.out.println("The length: " + input.length());
		scanner.close();
	}

}