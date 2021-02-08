import java.text.NumberFormat;
import java.util.*;
import tryItOut.ValueGenerator;
import static java.lang.System.out;
/*
 * This app needs to be updated with another better version (bigDecimal)
 * when using a dot class you make changes to the 
 */
class Account {
    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
    double balance;
    String niceBalance;
    String Name;
    int id;
    void addInterest(double rate) {
        out.println("*adding the " + rate + "% rate.");
        balance += balance * rate / 100.0;
        niceBalance = currency.format(balance);
    }
    String getInterest(double rate) {
        double interest;
        interest = balance * (rate / 100.0);
        return currency.format(interest);
    }
    void showData() {
    	niceBalance = currency.format(balance);
        out.println("Name: " + Name);
        out.println("Balance: " + niceBalance);
        out.println("ID: " + id);
    }
}

public class BankAccount {

    public static void main(String[] args) {
        Random generator = new Random();
        Account account1 = new Account();
        double interest;
        String yearlyInterest;

        for (int i = 0; i < 4; i++) {
            ValueGenerator data1 = new ValueGenerator();
            account1.Name = data1.Name;
            account1.balance = data1.balance;
            account1.id = data1.id;
            account1.showData();

            interest = generator.nextInt(5) + 1;
            account1.addInterest(interest);

            out.println("Balance with rate: " + account1.niceBalance);
            yearlyInterest = account1.getInterest(interest);
            out.println("yearly Interest: " + yearlyInterest);
            out.println("-----------------");
        }
    }

}
//Made with ♥ by R}AM#UN>
