import java.util.Scanner;
import java.io.*;
import static java.lang.System.*;

class Tata {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner scanner = new Scanner(in);
		File notFiltered = new File("C:\\Users\\Ramoun\\Desktop\\1.txt");
		File filtered = new File("C:\\Users\\Ramoun\\Desktop\\2.txt");
		Scanner filteredReader = new Scanner(filtered);
		Scanner notFilteredReader = new Scanner(notFiltered);
		File inputText = null;
		FileWriter fw;
		PrintWriter pw;
		String line;
		String [] filteredCurses = new String[10];
		String [] curses = new String[10];

		for (int i = 0; filteredReader.hasNext(); i++) {
			line = filteredReader.nextLine();
			filteredCurses[i] = line;
		}

		for (int i = 0; notFilteredReader.hasNext(); i++) {
			line = notFilteredReader.nextLine();
			curses[i] = line;
		}

		out.print("Enter File path: ");
		try {
			inputText = new File(scanner.nextLine());
		} catch (Exception e) {
		 	out.println("Something is wrong with the entered path.");
		 	out.println("please, Restart the App and try again.");
		 	out.println("*****************************************");
		 	e.printStackTrace();
		 	System.exit(0);
		}

		fw = new FileWriter(inputText, true);
		pw = new PrintWriter(fw);
		Scanner input = new Scanner(inputText);
		for (int i = 0; input.hasNext(); i++) {
			line = input.nextLine();
			if (line.contains(curses[i])) {
				line = line.replaceAll(curses[i], filteredCurses[i]);
			}
			pw.println();
			pw.println(line);
		}

		for (String i : curses) {
			out.println(i);
		}

		out.println();

		for (String i : filteredCurses) {
			out.println(i);
		}

		fw.close();
		pw.close();
		scanner.close();
		filteredReader.close();
		notFilteredReader.close();
	}
//check nextLine to next
//check curses wihtout new char[]
	/*
	fuck you mother fucker 
you are a motherfucker and shit
i don't give a shit 'bout who ain't fond of me
said lil bitch you can't fuck with me if you wanted to 
you are a motherfucking black nigga and shit
	*/
}
