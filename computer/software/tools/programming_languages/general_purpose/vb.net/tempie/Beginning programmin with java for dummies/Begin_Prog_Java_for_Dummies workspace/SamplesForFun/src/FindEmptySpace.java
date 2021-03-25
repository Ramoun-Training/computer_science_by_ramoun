import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindEmptySpace {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter The Directory: ");
		String dir = keys.nextLine();
		File Directory = new File(dir);
		long val = Directory.getFreeSpace();
		System.out.println("in Bits:  " + val);
		System.out.printf("in Bytes: %.1f\n" , val/1024.0);
		System.out.printf("in Megas: %.3f\n" , val/(1024*1024.0));
		System.out.printf("in Gigas: %.3f\n" , val/(1024.0*1024*1024.0));
		
		keys.close();
		
	}

}
