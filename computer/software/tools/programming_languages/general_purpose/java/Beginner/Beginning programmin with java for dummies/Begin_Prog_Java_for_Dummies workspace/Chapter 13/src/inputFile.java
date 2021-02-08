import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class inputFile {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner DiskReader = new Scanner(new File("input.txt"));
		PrintStream DiskWriter = new PrintStream(new File("output.txt"));
		double price ;
		double total;
		int quantity;

		price = DiskReader.nextDouble();
		quantity = DiskReader.nextInt();

		total = price * quantity;

		DiskWriter.println("The Total Price is: "+total);
		out.println("File writing Success.");

		DiskReader.close();
		DiskWriter.close();
	}

}
