import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class Mortgage {

    public static void main(String args[]) throws IOException {

        BufferedReader keyboard =
            new BufferedReader(new InputStreamReader(System.in));
        double principal, rate, ratePercent;
        int years, n;
        final int paymentsPerYear = 12;
        double effectiveAnnualRate;
        double payment;
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.print("How much are you borrowing?            ");
        principal = Double.parseDouble(keyboard.readLine().trim());
        System.out.print("What's the interest rate?              ");
        ratePercent = Double.parseDouble(keyboard.readLine().trim());
        rate = ratePercent / 100.00;
        System.out.print("How many years are you taking to pay?  ");
        years = Integer.parseInt(keyboard.readLine().trim());
        System.out.println("------------------------------");

        n = paymentsPerYear * years;
        effectiveAnnualRate = rate / paymentsPerYear;
        payment =
            principal
                * (effectiveAnnualRate
                    / (1 - Math.pow(1 + effectiveAnnualRate, -n)));
        System.out.print("Your monthly payment is                ");
        System.out.println(currency.format(payment));
        System.out.println();
    }
}
