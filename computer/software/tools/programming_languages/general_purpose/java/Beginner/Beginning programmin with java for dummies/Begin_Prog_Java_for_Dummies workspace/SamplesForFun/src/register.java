import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class register {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner keys = new Scanner(System.in);
		//System.out.print("Enter YOUR E-Mail: ");
		String e_mail; //= randomEmails();keys.next();
		File file = new File("C:\\Users\\Ramoun\\Desktop\\this.txt");
		FileWriter fw = new FileWriter(file,true);
		PrintWriter output = new PrintWriter(fw);
		int how_many = 40;
		
		for (int i = 0; i < how_many; i++) {
			e_mail = randomEmails();
			output.println(e_mail);
			System.out.println("Print Done Seccessfully" + " (" + i + ").");
		}
		fw.close();
		keys.close();
	}
	
	public static String randomEmails() {
		Random gen = new Random();
		char [] c = new char [gen.nextInt(13) + 10];
		String [] s = {"gmail.com","yahoo.com","hotmail.com","facebook.com"};
		String domain = s [gen.nextInt(4)];
		
		for (int i = 0; i < c.length; i++) {
			c [i] = (char) (gen.nextInt(26) + 97) ;
		}
		return (String.valueOf(c) + "@" +domain);
	}

}
