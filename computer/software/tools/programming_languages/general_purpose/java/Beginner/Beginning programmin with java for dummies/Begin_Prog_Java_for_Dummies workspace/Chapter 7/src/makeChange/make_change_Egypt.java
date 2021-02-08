package makeChange;
import java.util.Scanner;

public class make_change_Egypt {
	/*
	 * Remember you can't reverse steps or you'll get bad logic errors
	 */
	public static void main(String[] args) {
			Scanner strokes=new Scanner(System.in);
			int pounds,halfs,quarters,shelens,bareezas,piasters;
			int total,remainder;

			System.out.print("How many piasters have you got? ");
			total=strokes.nextInt();

			pounds=total/100;
			remainder=total%100;

			halfs=remainder/50;
			remainder=remainder%50;

			quarters=remainder/25;
			remainder=remainder%25;

			shelens=remainder/20;
			remainder=remainder%20;

			bareezas=remainder/10;
			remainder=remainder%10;

			piasters=remainder;

			System.out.println("From The "+total+" piaster(s),you get:");
			System.out.print(pounds);
			System.out.println(" pounds.");

			System.out.print(halfs);
			System.out.println(" halfs.");

			System.out.print(quarters);
			System.out.println(" quarters.");

			System.out.print(shelens);
			System.out.println(" shelens.");

			System.out.print(bareezas);
			System.out.println(" bareezas.");

			System.out.println(piasters+" piaster(s)");

			strokes.close();

	}

}
