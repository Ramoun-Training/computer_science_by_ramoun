import java.util.*;
import static java.lang.System.*;

class Recursion {

    public static void main(String[] args) {

    }
    
    public static void before(int n) {
      if (n > 0) {
         out.println(n);
         before(n - 1);
         out.println(n);
      }
    }

     public static long power(long x, long y) {
          if (y == 0) {
             return 1;
          }
          else {
             return x * power(x, y - 1);
          }
    }

    public static long powFast(long x, long y) {
        try {
            int result = 1;
            for (long i = 0; i < y; i++) {
                result *= x;
            }
            return result;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

    public static void infinite() {
        try {
            infinite();
        } catch (StackOverflowError sofe) {
            out.println("you've entered an infiniete Recursion.");
        }//not working do not know why
    }
}
