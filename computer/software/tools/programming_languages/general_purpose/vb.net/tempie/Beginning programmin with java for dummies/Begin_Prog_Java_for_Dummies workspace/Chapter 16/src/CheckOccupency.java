import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import static java.lang.System.out;

public class CheckOccupency {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner diskReader = new Scanner(new File("occupency"));
		PrintStream diskWriter = new PrintStream("motelData.txt");

		diskReader.nextLine();
		diskWriter.println("Room	:	 #ofGuests");
		diskWriter.println("**********************");
		for (int i = 0; i < 10; i++) {//printing to a file
			diskWriter.print(i);
			diskWriter.print("	 	:	 ");
			diskReader.nextInt();
			diskWriter.println(diskReader.nextInt());
		}
		diskReader.close();
		
		
		Scanner diskReader2 = new Scanner(new File("occupency"));
		diskReader2.nextLine();
		out.println("Room	 :	 #ofGuests");
		out.println("**************************");
		for (int i = 0; i < 10; i++) {//printing to the console
			out.print(i);
			out.print("	 :	 ");
			diskReader2.nextInt();
			out.println(diskReader2.nextInt());
		}

		diskReader2.close();
		diskWriter.close();
	}

}
