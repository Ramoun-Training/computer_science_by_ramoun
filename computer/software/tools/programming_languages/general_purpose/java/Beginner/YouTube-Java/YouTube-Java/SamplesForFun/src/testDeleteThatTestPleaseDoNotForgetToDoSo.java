import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class testDeleteThatTestPleaseDoNotForgetToDoSo {

	static Random gen = new Random();

	public static void main(String[] args) {
		//I know that thing about compiler optimization.
		//in the following code str1 and str2 are pointers to same "111" 
		//thus they have the same address
		Scanner keys = new Scanner(System.in);
		String x = "yes";
		String y = keys.next();
		if(x == y )System.out.println("this will never work.");
		
		Integer left = 5;
		Integer right = keys.nextInt();
		if (left == right) System.out.println("yahoooooooooooooo");
		

	}	
	
	
	public static String StringGen() {
		int n = gen.nextInt(100);
		char[] c = new char[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = (char) (gen.nextInt(26) + 97);
		}
		return String.valueOf(c);
	}
	
	
	public static void print() throws FileNotFoundException, IOException{
		File file = new File("C:\\Users\\Ramoun\\Desktop\\text&ints.type");
		Scanner keys = new Scanner(System.in);
		Scanner file_scan = new Scanner(file);
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw);

		int ans;

		for (int i = 0; i < 20; i++) {
			try {
				System.out.print("Enter <0:integerValues  or  1:StringValues> : ");
				ans = keys.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println();
				System.out.println("Please,Enter One of the Following Integer Values Only:");
				System.out.println("0 : for Randomly Generated Integer Values.");
				System.out.println("1 : for Randomly Generated String Values.");
				break;
			}
			switch (ans) {
			case 0:
				pw.println(gen.nextInt());break;
			case 1:
				pw.println(StringGen());break;
			default:
				System.out.println("please, Enter 0 or 1 only.");
			}
		}
		file_scan.close();
		pw.close();
		keys.close();
	}
}
