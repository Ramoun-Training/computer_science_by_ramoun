import static java.lang.System.out;

class welcomeFor {
    public static void main(String[] args) {
        int n = 1;
        String var = "welcome to java n(" + n + ").";
        for (; n <= 10; n++) {
            out.println(var);
        }
    }
}
