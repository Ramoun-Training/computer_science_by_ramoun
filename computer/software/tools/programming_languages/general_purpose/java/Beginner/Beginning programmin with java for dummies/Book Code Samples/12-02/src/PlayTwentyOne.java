import java.util.Random;

class PlayTwentyOne {

    public static void main(String args[]) {
        Random myRandom = new Random();
        int card, total = 0;

        System.out.println("Card    Total");

        while (total < 21) {
            card = myRandom.nextInt(10) + 1;
            total += card;

            System.out.print(card);
            System.out.print("       ");
            System.out.println(total);
        }

        if (total == 21) {
            System.out.println("You win :-)");
        } else {
            System.out.println("You lose :-(");
        }
    }
}
