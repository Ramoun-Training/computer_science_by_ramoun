import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * WARNNING:
 * WATCH OUT THIS PROGRAM DAMAGES NON .TXT FILES SO BE CAREFULL
 */
public class Foldering {

	static File desktop = new File("C:\\Users\\Ramoun\\Desktop\\dddd");
		
	
	public static void main(String[] args) throws IOException {
	
	}
	
	public static void foldering(String folderName, String extension) throws IOException {
		/*
		 * Alternative steps for moving a file:
		 * 
		 * 1.create a new file in the destination directory
		 * 2.read from the old file
		 * 3.write that content to the new File
		 * 4.delete the old file
		 */
		
		//creating the new directory to hold the files 
		File Folder = new File("C:\\Users\\Ramoun\\Desktop\\" + folderName);
		if (!Folder.exists()) {
			System.out.println(Folder.mkdirs());
		} else {
			System.out.println("The Folder Already exists.");
			System.exit(0);
		}
		
		//the main program "what to do after creating the new folder"
		for (int i = 0; i < desktop.listFiles().length; i++) {
			if (desktop.listFiles()[i].getName().endsWith(extension)) {
				//create a new file with the same name in the destination directory
				File newPath = new File(Folder.getAbsolutePath() + "\\" + desktop.listFiles()[i].getName());
				newPath.createNewFile();
				
				//declaring a scanner to read from the old file
				// + a writer to write to the "new Copy" file
				// + a line variable to hold lines copied of old files
				Scanner scanner = new Scanner(desktop.listFiles()[i]);
				FileWriter fw = new FileWriter(newPath);
				PrintWriter pw = new PrintWriter(fw);
				String line;
				//desktop.listFiles()[i].renameTo(newPath);

				while (scanner.hasNext()) {
					//read line by line of the old file
					line = scanner.nextLine();
					//write to the new file (line by line too)
					pw.println(line);
				}
				//showing the new paths of the moved files in the console
				System.out.println(newPath);
				
				scanner.close();
				pw.close();
				
				//deleting the old file
				desktop.listFiles()[i].delete();
			}
		}
	}
	
	
}
