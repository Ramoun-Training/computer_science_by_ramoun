import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FindMe {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file_reader = new Scanner(new File("C:\\Users\\Ramoun\\Desktop\\gak.txt"));
		Scanner keys = new Scanner(System.in);
		boolean found_flag= false;
		
		System.out.print("Enter your user name: ");
		String user_input = keys.next();
		
		while (file_reader.hasNext()) {
			String found = file_reader.next();
			if (found.equals(user_input)) {
				found_flag = true;
				break;
			}
			else {
				found_flag = false;
			}
		}
		
		if (found_flag) {
			System.out.println("Signed in Successfully.");
		}
		else {
			System.out.println("User Name is incorrect.");
		}
		
		keys.close();
		file_reader.close();
	}

}
