package Oldies_io;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
 * when you read and write to same file you get an error message line not founds
 */

public class toUpperCase_io {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "uppercase.txt";
		Scanner fileread = new Scanner(new File(path));
		PrintStream fileWrite = new PrintStream("uppercaseout.txt");
		String text;
		
		text = fileread.nextLine();
		
		fileWrite.print(text.toUpperCase());
		System.out.println("writing to uppercaseout.txt file done Successfully.");
		System.out.println("In the following path: "+path);
		
		fileread.close();
		fileWrite.close();
	}

}
