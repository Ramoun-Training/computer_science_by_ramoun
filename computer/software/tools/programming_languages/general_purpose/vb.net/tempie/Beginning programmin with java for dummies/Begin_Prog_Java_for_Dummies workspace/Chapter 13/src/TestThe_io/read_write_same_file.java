package TestThe_io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class read_write_same_file {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream writer = new PrintStream("sameFile.txt");
		
		writer.println("Here is a new line and i like it.");
		
		writer.close();
	}

}
