import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		Desktop desk = Desktop.getDesktop();
		Scanner keys = new Scanner(System.in);
		int n;
		
		
		System.out.print("gimme the directory you want to search in: ");
		String dir = keys.nextLine();
		File directory = new File(dir);
		System.out.println("What is the name of the file you want to search for: ");
		String wanted_file = keys.nextLine();
		System.out.println("File\t\tDirectory");
		search(directory, wanted_file);
		System.out.println();
		System.out.print("Enter the serial number of the file/folder you  want to open: ");
		n = keys.nextInt();
		
		if (arr[n + 1] != null) {
			desk.open(arr[n + 1]);
		} else {
			System.out.println("Please,Enter Valid Number.");
		}
		
		System.out.println();
			
		keys.close();
	}
	
	public static int i = 1;
	public static File arr [] = new File [2000000];
	
	public static void search(File dir,String wanted) throws IOException, FileNotFoundException {
		
		if (dir != null) {
			for (File file : dir.listFiles()) {
				if (file.getName().startsWith(wanted)) {
					System.out.println(i + ") " +file.getName() + " :\n\t\t" + file);
					i++;
					arr [i] = file;
				}
				if (file.isDirectory() && !file.isHidden() && dir != null) {
					search(file,wanted);
				}
			}
		}
		else {
			System.out.println("File Not Found.");
		}
		
	}

}
