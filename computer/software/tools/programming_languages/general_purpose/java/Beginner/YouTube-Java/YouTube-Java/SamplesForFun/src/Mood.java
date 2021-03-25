import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

enum moods {bien,mauvais}

public class Mood {
	
	public static void main(String[] args) throws IOException ,FileNotFoundException {
		Scanner keys = new Scanner(System.in);
		File path = new File("C:\\users\\ramoun\\desktop\\moods.txt");
		Scanner reader = new Scanner(path);
		FileWriter fw = new FileWriter(path,true);
		PrintWriter pw = new PrintWriter(fw);
		moods ma_mood;
		int n = 0;
		
		//The Ruler
		for (int i = 0; i < 20; i++) {
			pw.print("-+-+");
		}
		pw.println();
		
		
		try {
			System.out.print("Enter <1:bien , 0:mauvais> : ");
			n = keys.nextInt();
		} catch (InputMismatchException im) {
			System.out.println("invalid Input.");
			System.out.println("Please,Enter 1 for bien and 0 for mauvais.");
			System.out.println("App Closed.");
		}
		
		switch (n) {
		case 0:
			ma_mood = moods.mauvais;break;
		case 1:
			ma_mood = moods.bien;break;
		default:
			System.out.println("invalid Input.");
			System.out.println("Please,Enter 1 for bien and 0 for mauvais.");
			System.out.println("App Closed.");
		}
		
		
		pw.close();
		keys.close();
	}

}
