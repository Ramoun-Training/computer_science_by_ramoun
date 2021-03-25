package ramoun.io;

public class Controller {

	public static void main(String[] args) {
		Input in = new Input();
		int x;
		do {
			x = in.inputInt("Enter your age:");
			if (x > 0 && x <= 200) {
				break;
			}
			else {
				System.out.println("please, enter a reasonable age between 1 and 200");
			}
		} while (true);
		System.out.println("your age : " + x);
	}

}
