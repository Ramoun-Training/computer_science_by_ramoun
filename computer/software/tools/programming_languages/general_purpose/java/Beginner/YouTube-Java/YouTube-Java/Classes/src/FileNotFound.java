import java.io.*;

public class FileNotFound {

	public static void main(String[] args) {
		String fileName = "textFile.txt";
		File path = new File("C:\\users\\Ramoun\\Desktop");
		openFile(fileName, path);
	}
	
	public static void openFile(String name, File path) {
		String fullPath = path.getPath() + "\\" + name;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(fullPath);
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, Dude can't find the file.");
		} catch (IOException io) {
			System.out.println("something wrong with io.");
		} catch (Exception e) {
			System.out.println("there is an error somewhere");
			System.out.print("Here is some info: ");
			System.out.println(e.getMessage());
		} finally {
			System.out.println();
			System.out.println("I don't know if your file is opened or not");
			System.out.println("because,i am a finally block.");
		}
		
	}

}
