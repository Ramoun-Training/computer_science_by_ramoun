package Chapter_13;
/*
import java.util.Random;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;
*/ //I don't like abreviations hahah ;-)

public class Crazy8_Simpilfied {

	public static void main(String[] args) throws java.io.FileNotFoundException {
		java.util.Random generator = new java.util.Random();
		java.io.PrintStream DiskWriter = new java.io.PrintStream(new java.io.File("Crazy8_File.txt"));
		int card;
		int Wins = 0 , Loses = 0;
		int total = 0;

		card = generator.nextInt(8) + 1;

		DiskWriter.println("Card		Win/Lose");
		while (total < 21) {
			DiskWriter.print(card);
			DiskWriter.print("   \t\t   ");
			if (card == 8) {
				DiskWriter.println("Win");
				Wins++;
			}
			else {
				DiskWriter.println("Lose");
				Loses++;
			}
			total = total + card;
			card = generator.nextInt(8) + 1;
		}
		DiskWriter.println("------------------------");
		DiskWriter.println("Total Cards pulled: " + total);
		DiskWriter.println("Total Wins: " + Wins);
		DiskWriter.println("Total Loses: " + Loses);
		DiskWriter.println(Wins > Loses ? "Congratulations You Won." : "Sorry,You Lose");

		DiskWriter.close();

		System.out.println("Writing to File 's Completed Successfully.'");
	}

}
