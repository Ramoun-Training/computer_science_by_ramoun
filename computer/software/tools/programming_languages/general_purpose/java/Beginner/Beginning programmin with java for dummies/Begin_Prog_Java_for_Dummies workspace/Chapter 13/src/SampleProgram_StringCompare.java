import static java.lang.System.out;
import java.util.Scanner;

/*
 * contains alot of shitty bugs
 */
public class SampleProgram_StringCompare {
	
	public static String register(String user,String pass) {
		String cat = user + "@" + pass+"#";
		return cat;
	}
	
	public static boolean checkUser(String username,String DBuser) {
		byte i = 0;
		byte j = 0;
		char c = DBuser.charAt(i);
		boolean flag = true;
		String enteredUser = "";//extracted text out of concatenated db.
		
		//check the length first
				if (enteredUser.length() != username.length()) {
					return false;
				}
				
		while (c != '@') {
			enteredUser = enteredUser + c;
			i++;
			c = DBuser.charAt(i);
		}
		
		while (enteredUser.length() > j && flag == true) {
			if (DBuser.charAt(j) == username.charAt(j)) {
				flag = true;
			}
			else {
				flag = false;
			}
			j++;
		}
		
		return flag?true:false;
	}

	public static boolean checkPass(String password,String DBpass) {
		byte i = 0;
		byte j = 0;
		char c = DBpass.charAt(i);
		boolean flag = true;
		String enteredPass = "";
		
		//check the length first
		if (enteredPass.length() != password.length()) {
			return false;
		}
		
		while (c != '@') {
			c = DBpass.charAt(i);
			i++;
		}
		c = DBpass.charAt(i);
		while (c != '#') {
			enteredPass = enteredPass + c;
			i++;
			c = DBpass.charAt(i);
			
		}
		
		while (enteredPass.length() > j  &&  flag == true && enteredPass.length() == password.length()) {
			if (enteredPass.charAt(j) == password.charAt(j)) {
				flag = true;
			}
			else {
				flag = false;
			}
			j++;
		}
		
		if (enteredPass.length() == password.length()) {
			flag = false;
		}
		
		return flag;
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String userName;
		String password;
		String cat;
		boolean UserFlag;
		boolean PassFlag;
		
		out.println("Registeration:");
		out.println("--------------");
		out.print("User Name: ");
		userName = reader.next();
		out.print("Password: ");
		password = reader.next();
		
		cat = register(userName,password);
		out.print("\n");
	
		
		out.println("Login Info:");
		out.println("^^^^^^^^^^^");
		out.print("Enter Your User Name: ");
		userName = reader.next();
		out.print("Enter Your Password: ");
		password = reader.next();
		
		UserFlag = checkUser(userName,cat);
		PassFlag = checkPass(password,cat);
		
		
		if (UserFlag && PassFlag) {
			out.println("Login Success.");
		}
		else {
			out.println("Login Failure,inCorrect User name or Password.");
		}
		reader.close();
	}

}
