import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class forByfor {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileReader = new Scanner(new File("hotelData"));
        PrintStream fileWriter = new PrintStream("hotelData_Organgized.txt");
        //int number_of_gusts;

        for (int n = 1; n <= 9; n++) {
            fileWriter.print("Floor (");
            fileWriter.print(n);
            fileWriter.print("): ");
            for (int i = 0; i < 20; i++) {
                fileWriter.print(fileReader.nextInt() + "   ");
            }
            fileWriter.println();
        }

        fileWriter.close();
        fileReader.close();
    }
}
