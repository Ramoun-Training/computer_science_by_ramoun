import java.util.Scanner;

class ProcessPurchase {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Purchase onePurchase = new Purchase();

        System.out.print("Amount: ");
        onePurchase.amount = keyboard.nextDouble();
        System.out.print("Taxable? (true/false) ");
        onePurchase.taxable = keyboard.nextBoolean();

        if (onePurchase.taxable) {
            onePurchase.total = onePurchase.amount * 1.05;
        } else {
            onePurchase.total = onePurchase.amount;
        }

        System.out.print("Total: ");
        System.out.println(onePurchase.total);

        keyboard.close();
    }
}
