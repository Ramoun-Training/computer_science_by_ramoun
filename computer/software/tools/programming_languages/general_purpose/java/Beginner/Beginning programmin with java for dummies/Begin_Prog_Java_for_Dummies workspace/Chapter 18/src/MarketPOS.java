import java.util.Scanner;
import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.Locale;

class purchase {
    static double  price;
    static String  CustomerName;
    static double  tax = 0;
    static double  total;
    static boolean taxable;
    static String  ScreenTotal;
    static String  countery;
}

public class MarketPOS {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.FRANCE);
        NumberFormat  currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        out.print("Customer Name: ");
        purchase.CustomerName = keyboard.nextLine();
        out.print("Price: ");
        purchase.price = keyboard.nextDouble();
        out.print("taxable: ");
        purchase.taxable = keyboard.nextBoolean();

        if (purchase.taxable) {
            purchase.tax = purchase.price * 0.05;
        }

        purchase.total = purchase.price + purchase.tax;
        purchase.ScreenTotal = currency.format(purchase.total);

        out.println("The Total: " + purchase.ScreenTotal);

        keyboard.close();
    }
}
//Made with ♥ by R}AM#UN>