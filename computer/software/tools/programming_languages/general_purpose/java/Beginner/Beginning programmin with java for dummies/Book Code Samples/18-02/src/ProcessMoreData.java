import java.util.Scanner;
import static java.lang.System.out;

class ProcessMoreData {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String fullName;
        double amount;
        boolean taxable;
        double total;

        out.print("Customer's full name: ");
        fullName = keyboard.nextLine();
        out.print("Amount: ");
        amount = keyboard.nextDouble();
        out.print("Taxable? (true/false) ");
        taxable = keyboard.nextBoolean();

        if (taxable) {
            total = amount * 1.05;
        } else {
            total = amount;
        }

        out.println();
        out.print("The total for ");
        out.print(fullName);
        out.print(" is ");
        out.print(total);
        out.println(".");

        keyboard.close();
    }
}
