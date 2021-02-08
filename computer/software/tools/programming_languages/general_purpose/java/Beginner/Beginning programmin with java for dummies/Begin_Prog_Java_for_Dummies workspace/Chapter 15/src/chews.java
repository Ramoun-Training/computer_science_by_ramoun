import static java.lang.System.out;
class chews {
    public static void main(String[] args) {
        for (int chew = 1; chew <= 10; chew++) {
            out.print("I've chewed ");
            out.print(chew);
            out.println(chew == 0 || chew == 1?" time.":" times.");
        }
        out.println("we finished this now and for ever you can restart again if you want.");
    }
}
