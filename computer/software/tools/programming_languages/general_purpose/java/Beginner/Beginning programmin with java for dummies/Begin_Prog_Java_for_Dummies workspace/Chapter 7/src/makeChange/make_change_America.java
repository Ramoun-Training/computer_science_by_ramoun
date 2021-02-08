package makeChange;
import java.util.Scanner;
public class make_change_America {

	public static void main(String[] args) {
		Scanner strokes=new Scanner (System.in);
		int cents,dollas,quarters,nickels,dimes,halfs;
		String text;
		int total,left;

		System.out.print("How many cents do you have? ");//prompt
		total=strokes.nextInt();
		text=strokes.nextLine();

		dollas=total/100;
		left=total%100;

		halfs=left/50;
		left=left%50;

		quarters=left/25;
		left=left%25;

		dimes=left/10;
		left=left%10;

		nickels=left/5;
		left=left%5;

		cents=left;

		System.out.println();
		System.out.println("From "+total+text+",You Make:");
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
		System.out.println('.');

		strokes.close();
	}

}
