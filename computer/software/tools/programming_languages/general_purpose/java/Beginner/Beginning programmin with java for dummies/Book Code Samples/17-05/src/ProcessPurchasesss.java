import java.util.Scanner;

class ProcessPurchasesss {
    
   public static void main(String args[]) {
      Scanner keyboard = new Scanner(System.in);
      Purchase aPurchase;

      for (int count = 0; count < 3; count++) {
         aPurchase = new Purchase();

         System.out.print("Amount: ");
         aPurchase.amount = keyboard.nextDouble();
         System.out.print("Taxable? (true/false) ");
         aPurchase.taxable = keyboard.nextBoolean();

         if (aPurchase.taxable) {
            aPurchase.total = aPurchase.amount * 1.05;
         } else {
            aPurchase.total = aPurchase.amount;
         }

         System.out.print("Total: ");
         System.out.println(aPurchase.total);
         System.out.println();
      }

        keyboard.close();
   }
}
