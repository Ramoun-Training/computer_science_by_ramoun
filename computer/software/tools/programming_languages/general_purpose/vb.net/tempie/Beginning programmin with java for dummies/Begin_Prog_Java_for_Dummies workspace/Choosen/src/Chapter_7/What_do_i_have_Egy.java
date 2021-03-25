package Chapter_7;
import java.util.InputMismatchException;
import java.util.Scanner;
public class What_do_i_have_Egy {
	/*
	 * This program Created By : R}AM#UN> 
	 * The program tells you what do you have in piasters,shelegs,....
	 */
	public static void main(String[] args) {
		Egypte();
	}
	
	public static void Egypte(){
		Scanner keyboard=new Scanner (System.in);
		int pounds,piasters,shelen,bareeza,quarters,halfs;
		int total = 0;
		String text = null;

		System.out.print("What do you have in piasters? ");
		try {
			total=keyboard.nextInt();
			text=keyboard.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Enter valid Data.");
			System.exit(0);
		}

		bareeza=total/10;
		shelen=total/20;
		quarters=total/25;
		halfs=(int) (total/50.00);
		pounds=total/100;
		piasters=total;

		System.out.println();
		System.out.println("FROM " + total + " " + (text.equalsIgnoreCase("piasters")? text : " piasters") + ",YOU HAVE:");
		System.out.print(bareeza);
		System.out.println(" bareezas.");

		System.out.print(shelen);
		System.out.println(" shelens.");

		System.out.print(quarters);
		System.out.println(" quarters.");

		System.out.print(halfs);
		System.out.println(" halfs.");

		System.out.print(pounds);
		System.out.println(" pounds.");

		System.out.print(piasters);
		System.out.print(text.equalsIgnoreCase("piasters")? text : " piasters");
		System.out.println(".");

		keyboard.close();
	}
}


