package Goodies;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

/*
 * here is the problem reading and writing to the same file goes bad....very Bad.
 * 
 * on the other hand we 've learned about equalsIgnoreCase() method.
 * 
 * or for the easy way you can just convert the orginal variable content to smallCase or UpperCase and compare to
 * that.
 */
public class Pro_Username_and_Password {

	public static void main(String[] args) throws IOException {
		Scanner keyStrokes = new Scanner(System.in);
		Scanner fileReader = new Scanner(new File("dataBase.dat"));
		FileWriter fileWriter = new FileWriter("dataBase.dat",true);
		PrintWriter pw = new PrintWriter(fileWriter);
		String username;
		String password;
		String control;
		boolean notValid; 
		
		do {
			out.print("Enter <Login - Register - EXit>: ");
			control = keyStrokes.next();
			notValid = !control.equalsIgnoreCase("login") && 
					   control.equalsIgnoreCase("register") == false && 
					   !control.equalsIgnoreCase("exit");
			out.println();
			if (control.equalsIgnoreCase("exit")) {
				out.println("BYE,SEE YOU LATER!.");
			}
			else if (control.equalsIgnoreCase("login")) {
				out.print("Enter the USER NAME: ");
				username = keyStrokes.next();
				out.print("Enter the PASSWORD: ");
				password = keyStrokes.next();
				if (username.equals(fileReader.next()) && password.equals(fileReader.next()) ) {
					out.println("Login Successfull");
				}
				else {
					out.println("user name or password is not correct.");
				}
			} 
			else if (control.equalsIgnoreCase("register")) {
				out.print("Choose a user name: ");
				username = keyStrokes.next();
				out.print("Choose password: ");
				password = keyStrokes.next();
				pw.println(username);
				pw.println(password);
				out.println("Done :=)");
			}
			
		} while (notValid);
		
		keyStrokes.close();
		fileReader.close();
		pw.close();
	}

}
