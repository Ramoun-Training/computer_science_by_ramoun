import java.text.NumberFormat;
import static java.lang.System.out;

class GoodAccount {
    String lastName;
    int id;
    double balance;

    double getInterest(double rate) {
        double interest;
        
        out.print("Adding ");  
        out.print(rate);
        out.println(" percent...");
        
        interest = balance * (rate / 100.0);
        return interest;
    }


    void display() {
        NumberFormat currency = 
            NumberFormat.getCurrencyInstance();
            
        out.print("The account with last name ");
        out.print(lastName);
        out.print(" and ID number ");
        out.print(id);
        out.print(" has balance ");
        out.println(currency.format(balance));
    }
}
