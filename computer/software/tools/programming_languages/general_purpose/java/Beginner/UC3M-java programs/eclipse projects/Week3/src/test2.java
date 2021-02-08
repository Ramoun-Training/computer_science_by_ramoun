import java.util.Iterator;
import java.util.Scanner;
import java.util.InputMismatchException;

public class test2 {

	static int x = 5;
	static void m() {
		for (int i = 0; i < 10; i++) {
			int x = 4;//variables created within loops disappear after the loop finishes
		}
		System.out.println(x);
	}

	
	public static void Main(String[] args) throws Exception {
		m();

		for (int i = 0; i < 5; i++) {
			int y = 44;
		}
		int y = 7;		
		System.out.println(y);
		
		System.out.println(Math.sqrt(-4));
		go();
	}
	int y = 444;
	
	public static void go() throws Exception {
		boolean b = true;
		if (b = true) {
			throw new Exception();
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("Enter your age:");
			Scanner keys = new Scanner(System.in);
			int age = keys.nextInt();
			System.out.println("you are " + age);
		} catch (InputMismatchException e) {
			System.out.println("please,Enter valid data.");
		}
		
		
	}

}
