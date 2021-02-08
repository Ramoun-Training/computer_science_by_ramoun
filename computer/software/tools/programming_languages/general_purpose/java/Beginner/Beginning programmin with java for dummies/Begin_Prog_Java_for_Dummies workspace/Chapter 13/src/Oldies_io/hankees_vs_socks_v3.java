package Oldies_io;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class hankees_vs_socks_v3 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream fileWriter = new PrintStream("gameData.dat");
		Random generator = new Random();
		int hankees,socks;
		
		hankees = generator.nextInt(5) + 1;
		socks = generator.nextInt(5) + 1;
		
		fileWriter.println("Hankees 		Socks");
		fileWriter.println(hankees+" 		        "+socks);
		System.out.println("Writing to file ended succesfully.");
		
		fileWriter.close();
	}

}
