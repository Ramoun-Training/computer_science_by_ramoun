import java.util.Scanner;

class KeepingMoreKidsQuiet {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int gumballs;
        int kids;
        int gumballsPerKid;
      
        System.out.print
            ("How many gumballs? How many kids? ");
         
        gumballs = keyboard.nextInt();      
        kids = keyboard.nextInt();
      
        gumballsPerKid = gumballs / kids;
      
        System.out.print("Each kid gets ");
        System.out.print(gumballsPerKid);
        System.out.println(" gumballs.");

        keyboard.close();
    }
}
