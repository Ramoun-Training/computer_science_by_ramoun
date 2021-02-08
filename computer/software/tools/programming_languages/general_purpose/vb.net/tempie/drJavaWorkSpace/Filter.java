import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.Desktop;

class Filter {

	static char [] word;
	static int beg, end;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Desktop desk = Desktop.getDesktop();
		File fileOne = new File("C:\\Users\\Ramoun\\Desktop\\1.txt");
		File fileTwo = new File("C:\\Users\\Ramoun\\Desktop\\2.txt");
		Scanner fileReader = new Scanner(fileOne);
		FileWriter fw = new FileWriter(fileTwo);
		PrintWriter pw = new PrintWriter(fw);
		String line;
		while (fileReader.hasNext()) {
			//read the word from file one
			line = fileReader.nextLine();
			word = line.toCharArray();
			//filter the word
			word = filter(word); 
			//store the new filtered word in file two
			pw.println(word);
		}

		out.println("Writing to File " + fileTwo.getName() + " finished sucessfully.");
		out.println(fileTwo.getName() + " 's path: " + fileTwo);
		desk.open(fileTwo);
		out.println("***=FILE OPENED=***");

		//close all resources
		fileReader.close();
		fw.close();
	}

	public static char [] filter(char [] word) {
		if (word.length <= 4 && word.length > 2) {
			word[1] = '*';
			word[2] = '*';
		} else {
			beg = word.length / 2 - 1;
			end = beg + 2;
			for (int i = beg; i <= end; i++) {
				word[i] = '*';
			}
		}

		return word;
	}

}