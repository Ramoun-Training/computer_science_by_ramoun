package Oldies_io;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class hankees_vs_socks_v3_reading {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("gameData.dat"));
		String header;
		int hankees,socks;
		
		header = fileReader.nextLine();
		hankees = fileReader.nextInt();
		socks = fileReader.nextInt();
		
		System.out.println("Reading finished successfully!!\n.......");
		System.out.println(header);
		System.out.println(hankees+" 		        "+socks);
		
		System.out.println(socks > hankees?"Yes,the Socks won.!!!":"oh No,the Socks lose.");
		
		fileReader.close();

	}

}
