import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String txt = keys.nextLine();
		char c = keys.findWithinHorizon(".", 0).charAt(0);
		
		System.out.println(txt);
		System.out.println(c);
		
		keys.close();
	}

}
