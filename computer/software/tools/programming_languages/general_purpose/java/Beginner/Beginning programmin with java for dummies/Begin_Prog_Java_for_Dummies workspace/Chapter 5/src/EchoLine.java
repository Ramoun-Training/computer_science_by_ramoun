//import java.util.Scanner;
public class EchoLine {
	public static void main(String args[]) {

		java.util.Scanner keyboard=
					new java.util.Scanner (System.in);
		String text=
					keyboard.next();
		System.out.println(text=="");
		keyboard.close();
	}
}
