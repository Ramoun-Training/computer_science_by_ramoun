import java.util.Scanner;
public class single_char_test {

	public static void main(String[] args) {
		Scanner strokes=new Scanner (System.in);
		System.out.print("Enter a bunch of characters: ");
		char c1=strokes.next().charAt(0);
		char c2=strokes.next().charAt(0);
		char c3=strokes.next().charAt(0);
		char c4=strokes.next().charAt(0);
		System.out.print(c4);
		System.out.print(c3);
		System.out.print(c2);
		System.out.print(c1);
		strokes.close();
	}

}
