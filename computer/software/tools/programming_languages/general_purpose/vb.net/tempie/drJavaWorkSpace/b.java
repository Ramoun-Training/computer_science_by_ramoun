    import javax.swing.*;
    import static java.lang.System.*;
    import java.text.DecimalFormat;
    class b {
      public static void main(String[]args) {
       // out.println(fact(5));
      }

      public static int [] range(int number) {
        int arr[] = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = i;
        }

        return arr;
      }

      public static void factorial(int n) {
          int fact = 1;

          //factoial
          for (int i : range(n)) {
              fact = fact * (i + 1);
          }

          //printing elements
          for (int i : range(n)) {
              System.out.println("I: " + i);
          }

          //factorial
          out.println("Factorial: " + fact);
      }
      
      
      public int fact(int n) {
        int result;
        if (n == 1) 
          return 1;
      else 
          result = fact(n-1) * n;

      return result;
    }

    public void print(String prompt){
        out.println(prompt);
    }

    public void print(int prompt){
        out.println(prompt);
    }

    public void print(double prompt){
        out.println(prompt);
    }

    public void print(boolean prompt){
        out.println(prompt);
    }

    public void print(long prompt){
        out.println(prompt);
    }

    public static void t(int n) {
        if (n == 0) {
            return ;
        } else {
            System.out.println(n / 10);
            t(n - 1);
        }
    }

    //integer division
    public static int intDivision(int dividend, int divisor) {
        int temp;
        if (dividend >= divisor) {
            temp = dividend - divisor;
            return 1 + intDivision(temp, divisor); //the 1 is for counting purpose only
        } else {
            return 0;
        }
    }

    public static void parting1(double number) {
        int intPart = (int) Math.floor(number);
        double floatingPart = number - intPart;
        out.println("The integer part: " + intPart);
        out.println("The floating part: " + floatingPart);
    }

    public static void parting2(double number) {
        String str = ".";
        double floatingPart = number % 1;
        int l = String.valueOf(number).length() - String.valueOf(Math.floor(number)).length() + 1;
        for (int i = 0; i < l; i++) {
            str = str + "#";
        }
        DecimalFormat df = new DecimalFormat(str);
        int intPart = (int) (number - floatingPart);
        out.println("The Integer part: " + intPart);
        out.println("The floating part: " + df.format(floatingPart));
    }

    public static void testing(int n) {
         
        out.println(n);
    }

    /*
     * Returns an array with the quotient and remainder of the
     * integer division
     *
     * @param dividend a positive int
     * @param divisor a positive int
     */
    static int[] division(int dividend, int divisor){

        int result[] = {0, dividend};
        int temp = dividend - divisor;
    
        if ( dividend < divisor ){
            return result;
        }else{
            result = division(temp, divisor);
            result[0] = result[0] + 1;
            return result;
        }
    
    }

    public static void fain(String[] args){
        int result[]=division(13,3);
        System.out.println("Quotient: "+ result[0]
               + " Remainder: "+ result[1]);
    }

    static int [] result = {0, 0};
    static boolean flag = true;
    public static int [] div(int dividend, int divisor) {
        if (flag) {
            result[0] = 0;
            result[1] = 1;
            flag = false;
        }
        int temp = dividend - divisor;
        if (dividend >= divisor) {
            result[0] = result[0] + 1;
            return div(temp, divisor);
        } else {
            result[1] = dividend;
            flag = true;
            return result;
        }
    }

    public static int [] div2(int dividend, int divisor) {
        int [] result = {0, 0};
        if (dividend >= divisor) {
            int temp = dividend - divisor;
            result = div2(temp, divisor);
            result[0] = result[0] + 1;
            return result;
        } else {
            result[1] = dividend;
            return result;
        }
    }
}