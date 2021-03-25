package ramoun.files;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.nio.file.*;

enum OpType {COPY,CUT,DELETE}

/**
 * 
 * a Class for doing the basic system operations like : moving,copying,deleting files
 * 
 * @throws IOException 
 * @throws FileNotFoundException
 * @author R}AM#UN>
 * <br><a href = "https://www.twitter.com/ramoun16" >@ramoun16</a>
 * @version 1.0
 */
public class FileOp {
	
	/**
	 * Does one of the main operations like: moving and deleting files
	 * 
	 * <p><b>script: '1'</b></p>
	 * <pre><p>     only moving/copying file/folder to a new destination</p></pre>
	 * @param source the source file we wanna copy/move
	 * @param target the destination we wanna copy/move the file to
	 * @param op type of the operation :cut or copy
	 * @throws IOException
	 */
	public static void fileControl(File source, File target, OpType op) throws IOException {
		/*
		 * a humble try to clear the code of expected exceptions
		 */
		try {
			//i think the follwing lines of code are self explainatory
			switch (op) {
				case COPY:
						Files.copy(source.toPath(), target.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
						System.out.println("File Copied.");
						break;
			
				case CUT:
						Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
						System.out.println("File Moved.");
						break;
			
				default: 
						System.out.println("ERRor");
						System.out.println("Non Defined Operation.");
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("File Not Found.");
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		} catch (Exception e) {
			System.out.println("###Somthing went Wrong###");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
	}
	
	/**
	 * Deletes a (given) file/folder
	 * 
	 * <p><b>script: '2'</b></p>
	 * <pre><p>     for deleting a given source file/folder</p></pre>
	 * @param source the source file/folder we wanna delete
	 */
	public static void fileControl(File source) {
		try {
			source.delete();
		} catch (Exception e) {
			System.out.println("###Something went Wrong###");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	}
}
