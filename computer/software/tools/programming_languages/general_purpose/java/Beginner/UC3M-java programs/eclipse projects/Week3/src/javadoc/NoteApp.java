package javadoc;

import java.util.Scanner;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class NoteApp {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException {
		String file_name = "NoteApp";// first name of the file
		String path = new String("C:\\Users\\Ramoun\\Desktop\\");// where will the file be saved
		String holder;// variable that gonna hold the text and until it is saved to a file.
		int i = 0;//counter that will be added at the end of the file name.
		
		Desktop desk = Desktop.getDesktop();
		Scanner keys = new Scanner(System.in);
		FileWriter file_writer;
		PrintWriter print_writer;
		
		File dir;// full directory
		

		// creating the file path that we are gonna save too.
		dir = new File(path + file_name + i + ".txt");
		while (dir.exists()) {
			i++;
			dir = new File(path + file_name + i + ".txt");
		}
		
		//creating a print writer to write to the file.
		file_writer = new FileWriter(dir);
		print_writer = new PrintWriter(file_writer);

		// the program runs forever until you type exit in a single line.
		do {
			holder = keys.nextLine();
			if (!holder.equals("exit")) {
				print_writer.println(holder);
			}

		} while (!holder.equals("exit"));
		
		desk.open(dir);//open the file for the user to check what he have written.
		
		print_writer.close();
		keys.close();
	}
}
