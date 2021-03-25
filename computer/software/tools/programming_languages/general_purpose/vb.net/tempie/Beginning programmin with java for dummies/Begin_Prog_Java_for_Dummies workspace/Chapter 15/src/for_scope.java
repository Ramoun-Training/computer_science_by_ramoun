import static java.lang.System.out;

class for_scope {
    public static void main(String[] args) {
        int count;
        for (count = 0; count < 10; count = 10) {
            out.println("These are number of counts: " + count);
        }//the loop executes only once.
        out.println();
        out.println(count);
    }
}
