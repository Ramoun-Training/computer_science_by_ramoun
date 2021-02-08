import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DeletO {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keys = new Scanner(System.in);
		System.out.print("Enter the Directory: ");
		String Dir = keys.nextLine();
		File Directory = new File(Dir);
		char ans;
		
		for (File file : Directory.listFiles()) {
			//if (file.getName().endsWith(".txt")) {
				System.out.println(file.getName());
			//}
		}
		System.out.println();
		
		System.out.print("Enter Which file/folder do you want to delete?(don't forget to add the extension -> if file): ");
		String which_file = keys.nextLine();
		Directory = new File(Dir + "\\" + which_file);
		
		System.out.println("The file/folder you want to delete is in the following directory: ");
		System.out.println(Directory);
		System.out.println();
		
		do {
			System.out.print("Are you sure you want to delete it <Y:yes  N:no> : ");
			ans = keys.next().charAt(0);
			System.out.println();
		} while (ans != 'Y' && ans != 'N');
		
		if (ans == 'Y') {
			Directory.delete();
			System.out.println("The File/folder was Deleted Successfully.");
		}
		else {
			System.out.println("The File/folder Was Not Deleted.");
		}
		
		keys.close();
	}

}
