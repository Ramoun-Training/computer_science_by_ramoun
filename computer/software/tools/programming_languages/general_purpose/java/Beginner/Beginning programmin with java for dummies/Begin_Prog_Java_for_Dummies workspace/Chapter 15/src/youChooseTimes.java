import java.util.Scanner;

class youChooseTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , i = -1;

        do {
            n = input.nextInt();
            i++;
        } while (i < n);

        input.close();
    }
}
