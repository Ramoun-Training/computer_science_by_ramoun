import static java.lang.System.out;

class AuntEdnaDoesItAgain {

    public static void main(String args[]) {
        int count;

        for (count = 0; count < 10; count++) {
            out.print("I've chewed ");
            out.print(count);
            out.println(" time(s).");
        }

        out.print(count);
        out.println(" times! Hooray!");
        out.println("I can swallow!");
    }
}
