import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class ReadAndWrite {
    
    public static void main(String args[]) 
                         throws FileNotFoundException {

        Scanner diskScanner = 
            new Scanner(new File("rawData.txt"));
        PrintStream diskWriter = 
            new PrintStream("cookedData.txt"); 
        double unitPrice, quantity, total;

        unitPrice = diskScanner.nextDouble();
        quantity = diskScanner.nextInt();

        total = unitPrice * quantity;

        diskWriter.println(total);

        diskScanner.close();
        diskWriter.close();
    }
}
