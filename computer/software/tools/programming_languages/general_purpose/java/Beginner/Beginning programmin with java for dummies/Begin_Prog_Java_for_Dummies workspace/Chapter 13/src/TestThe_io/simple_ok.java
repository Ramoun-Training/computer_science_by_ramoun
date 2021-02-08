package TestThe_io;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class simple_ok {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner("Oh then this how scanner class works");
		PrintStream writer = new PrintStream("okok.txt");
		String text,read;
		
		read = reader.nextLine();
		text = "what about the \t elephants";
		
		writer.println(read);
		writer.println(text);
		
		writer.close();
		reader.close();
	}

}
