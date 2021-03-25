import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class MieuxTraiterLesDonnees {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.FRANCE);

        double amount;
        boolean taxable;
        double total;
        NumberFormat currency = NumberFormat.
            getCurrencyInstance(Locale.FRANCE);
        String niceTotal;

        System.out.print("Amount: ");
        amount = keyboard.nextDouble();
        System.out.print("Taxable? (true/false) ");
        taxable = keyboard.nextBoolean();

        if (taxable) {
            total = amount * 1.05;
        } else {
            total = amount;
        }

        niceTotal = currency.format(total);
        System.out.print("Total: ");
        System.out.println(niceTotal);

        keyboard.close();
    }
}
