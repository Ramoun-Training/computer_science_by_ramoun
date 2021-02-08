import java.util.Scanner;
public class backward_word {

	public static void main(String[] args) {
		Scanner strokes=new Scanner(System.in);
		char c1,c2,c3,c4;

		System.out.println("Enter a four characters word: ");
		c1=strokes.findWithinHorizon(".",0).charAt(0);
		c2=strokes.findWithinHorizon(".",0).charAt(0);
		c3=strokes.findWithinHorizon(".",0).charAt(0);
		c4=strokes.findWithinHorizon(".",0).charAt(0);

		System.out.print(c4);
		System.out.print(c3);
		System.out.print(c2);
		System.out.print(c1);
	
		strokes.close();
	}

}
