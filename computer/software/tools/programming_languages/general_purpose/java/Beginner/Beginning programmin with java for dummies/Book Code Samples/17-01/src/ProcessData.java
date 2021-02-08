import java.util.Scanner;

class ProcessData {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double amount;
        boolean taxable;
        double total;

        System.out.print("Amount: ");
        amount = keyboard.nextDouble();
        System.out.print("Taxable? (true/false) ");
        taxable = keyboard.nextBoolean();

        if (taxable) {
           total = amount * 1.05;
        } else {
            total = amount;
        }

        System.out.print("Total: ");
        System.out.println(total);

        keyboard.close();
    }
}
