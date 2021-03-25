import static java.lang.System.out;

class ListCombinations { 

    enum Symbol {
        cherry, lemon, kumquat, rutabaga
    }

    public static void main(String args[]) {
        
        for (Symbol leftReel : Symbol.values()) {
            for (Symbol middleReel : Symbol.values()) {
                for (Symbol rightReel : Symbol.values()) {
                    out.print(leftReel);
                    out.print(" ");
                    out.print(middleReel);
                    out.print(" ");
                    out.println(rightReel);
                }
            }
        }
    }
}
