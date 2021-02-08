import java.util.Scanner;

class JazzyEchoLine {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String lineIn;

        lineIn = keyboard.nextLine();
        System.out.println(lineIn);

        keyboard.close();
    }
}
