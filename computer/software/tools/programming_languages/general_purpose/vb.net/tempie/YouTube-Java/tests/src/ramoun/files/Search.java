package ramoun.files;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * a Class for Searching for specific files or folders in a given directory 
 * 
 * <b><u><p>* This is an updated version of the original Class </b></u></p>
 * @throws IOException 
 * @throws FileNotFoundException
 * @author R}AM#UN>
 * <br><a href = "https://www.twitter.com/ramoun16" >@ramoun16</a>
 * @version 1.1
 */
public class Search {
	
	public static enum SearchType {ABSOLUTE,GENERAL}
	public static enum OpenOp {OPEN,PATH_COPY}
	
	//index counter for the array (it starts with one)
	public static int i = 1;
	//the array that is going to hold the "searched-for files" and their directories.
	public static File arr [] = new File [2000000];
	
	public static String dir = null;
	public static String wanted = null;
	public static SearchType searchType = SearchType.GENERAL;
	public static File desiredPath;
	
	/**
	 * prompts the user for the direcotry (scope) and the name of the file he wants to search for.
	 * @return 
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void prompt(OpenOp openUp) throws IOException, FileNotFoundException{
		Desktop desk = Desktop.getDesktop();
		Scanner keys = new Scanner(System.in);
		int n;
		String input;
		boolean cont = false;
		boolean firstTimeFlag = true;

		//checking the "dir" and "wanted" variables to see if they were already filled or not
		if (dir == null && wanted == null) {
			//Asking for the directory (scope) to search into
			System.out.print("gimme the directory you want to search in: ");
			dir = keys.nextLine();
			
			//Asking for the name of the file/folder we are searching for
			System.out.println("What is the name of the file/folder you want to search for: ");
			wanted = keys.nextLine();
		}
		
		//checking if the user want a specific option or not
		if (wanted.equalsIgnoreCase("!")) {
			wanted = "";
		} else if (wanted.startsWith("\"") && wanted.endsWith("\"")) {
			searchType = SearchType.ABSOLUTE;
		}
		
		//printing out columns headers.
		System.out.println("File\t\tDirectory");
		
		//passing the directory and name of the file/folder we are searching for to the search method
		search(dir, wanted);
		
		/*
		 * promting the user to enter the number (index) of the file from the given list to open it
		 */
		do {
			System.out.println();
			//checking if it is the first prompt for the user to enter the index of the file/folder or not
			if (firstTimeFlag) {
				System.out.print(
						"Enter the serial number -(index)- of the file/folder you  want to open <q :- quit>: ");
				firstTimeFlag = false;
			} else {
				System.out.print(
						"Enter another serial number -(index)- of the file/folder you  want to open <q :- quit>: ");
			}
			
			input = keys.next();
			
			try {
				n = Integer.parseInt(input);
				if (arr[n + 1] != null) {
					if (openUp == OpenOp.OPEN) {
						desk.open(arr[n + 1]);
					} else {
						desiredPath = arr[n + 1];
					}
					cont = true;
				} else {
					System.out.println("Please,Enter Valid serial nubmer -<index>- of the wanted file/folder.");
					cont = true;
				}
			} catch (NumberFormatException e) {
				//System.out.println("please,Enter A valid number according to the index of the files listed above.");
				if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit")) {
					System.out.println("******************");
					System.out.println("***App Shutdown***");
					System.out.println("******************");
					cont = false;
				} else {
					System.out.println("Please, Enter a valid serial number or 'q' to quit out of the program.");
					cont = true;
				}
			} 
		} while (cont);
		System.out.println();
		
		//closing the keys scanner
		keys.close();
		
	}
	
	/**
	 * searches for a (given) file/folder in a (given) specific directory and shows results on the screen 
	 * 
	 * <p><b><u>How it is said:</u></b></p>
	 * <pre><i><blockquote>"search (inside) dir (for) wanted"</blockquote></i></pre>
	 * @param dir the directory (scope) that we are going to search into. 
	 * @param wanted the name of the file/folder we are searching for
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void search(String dir,String wanted) throws IOException, FileNotFoundException {
		//converting the (String) dir into a directory of type (File) 
		File directory = new File(dir);
		try {
			//checking if the directory given if it exists or not
			if (dir != null) {
				//going throw all the files/folders in the directory
				for (File file : directory.listFiles()) {
					//checking if the file contains in its name the wanted sequence of characters
					if (searchType == SearchType.GENERAL) {
						if (file.getName().toLowerCase().contains(wanted.toLowerCase())) {
							System.out.println(i + ") " +file.getName() + " :\n\t\t" + file);
							i++;
							arr [i] = file;
						}
					} else if (searchType == SearchType.ABSOLUTE) {
						wanted = wanted.replaceAll("\"", "");
						if (file.getName().equals(wanted)) {
							System.out.println(i + ") " +file.getName() + " :\n\t\t" + file);
							i++;
							arr [i] = file;
						}
					}
					if (file.isDirectory() && !file.isHidden() && directory != null) {
						search(file.getCanonicalPath(),wanted);
					}
				}
			}
			else {
				System.out.println("File Not Found.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is Not Found in that directory.");
		} catch (NullPointerException npe) {
			System.out.println("-------------------------------");
			System.out.println("please, Enter valid Data");
			System.out.println(dir + " is not a valid directory");
			System.out.println("-------------------------------");
			System.out.println();
			System.out.println("******************");
			System.out.println("***App Shutdown***");
			System.out.println("******************");
		}
		
	}
	
	/**
	 * constructs a method call to the prompt() method
	 * <p><b>script: '1'</b></p>
	 * <pre><p>     shows prompt on the console for the user to fill in data.</p></pre> 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public Search(OpenOp openUp) throws FileNotFoundException, IOException {
		prompt(openUp);
	}
	
	/**
	 * Sets the global variables "dir" and "watned" to the passed parameters' values. 
	 * <p>constructs a method call to the prompt() method</p>
	 * <p><b>script: '2'</b></p>
	 * <pre><p>     the programmer himself fills the data</p></pre>
	 * @param dir directory to search inside
	 * @param wanted the file we are looking for inside the (dir) directory 
	 * @category SETTER
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public Search(String dir, String wanted, OpenOp openUp) throws FileNotFoundException, IOException{
		//this.dir = dir;
		//this.wanted = wanted;
		prompt(openUp);
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		prompt(OpenOp.OPEN);
	}
}

