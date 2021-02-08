package change;
import java.util.InputMismatchException;
import java.util.Scanner;
public class What_do_i_have {

	public static void main(String[] args) {
		America();
	}

	public static void America() {
		Scanner strokes=new Scanner(System.in);
		int dimes,nickels,cents,quarters,dollas,halfs;
		int total = 0;
		String text = null;

		System.out.print("What do you have? ");
		try {
			total=strokes.nextInt();
			text=strokes.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Please,Enter valid Data.");
			System.exit(0);
		}
		
		text = text.equalsIgnoreCase("cents")? text : " cents";
		
		dollas=total/100;
		halfs=total/50;
		quarters=total/25;
		dimes=total/10;
		nickels=total/5;
		cents=total;

		System.out.println();
		System.out.println("Form "+total+" "+text+" You have:");
		System.out.println();
		
		System.out.print(dollas);
		System.out.println(" dollas.");
		
		System.out.print(halfs);
		System.out.println(" halfs.");
		
		System.out.print(quarters);
		System.out.println(" quarters.");

		System.out.print(dimes);
		System.out.println(" dimes.");

		System.out.print(nickels);
		System.out.println(" nickels.");

		System.out.print(cents);
		System.out.print(text);
		System.out.println(".");

		strokes.close();
	}

}
