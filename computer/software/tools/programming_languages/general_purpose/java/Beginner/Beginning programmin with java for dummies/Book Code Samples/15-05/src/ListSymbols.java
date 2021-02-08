import static java.lang.System.out;

class ListSymbols {
  
  enum Symbol {
    cherry, lemon, kumquat, rutabaga
  }

  public static void main(String args[]) {
    for (Symbol leftReel : Symbol.values()) {
      out.println(leftReel);
    }
  }
}
