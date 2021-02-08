package ramoun.files;
import java.util.*;
import java.io.*;

public class txtCleaner {
	public static void main(String[] args) throws IOException {
		File parentPath = new File("C:\\Users\\Ramoun\\desktop");
		File sourceFile = new File(parentPath.getPath() + "\\" + "n.txt");
		File holderFolder = new File(parentPath.getPath() + "\\" + "holder");
		
		if (!holderFolder.exists()) {
			holderFolder.mkdir();
		}
		
		File newFile = new File (holderFolder.getAbsolutePath() + "\\" + sourceFile.getName());
		FileWriter fw = new FileWriter(newFile);
		PrintWriter pw = new PrintWriter(fw);		
		Scanner scanner = new Scanner(sourceFile);		
		
		while (scanner.hasNext()) {
			//read
			char c = scanner.findWithinHorizon(".", 0).charAt(0);
			
			//check
			while (c != '-') {
				//write
				pw.print(c);
				
				//read
				c = scanner.findWithinHorizon(".", 0).charAt(0);
			}
			pw.println();
			scanner.nextLine();
		}
		
		if (sourceFile.exists()) {
			//deleting the source file we've copied from.
			sourceFile.delete();
		}
		scanner.close();
		pw.close();
	}
}
