import java.util.Scanner;
import static java.lang.System.out;

class Scoreboard {

    enum WhoWins {home, visitor, neither}

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int hankees, socks;
        WhoWins who;

        out.print("Hankees and Socks scores?  ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();
        out.println();
        
        if (hankees > socks) {
            who = WhoWins.home;
            out.println("The Hankees win :-)");   
        } else if (socks > hankees) {
            who = WhoWins.visitor;
            out.println("The Socks win :-(");
        } else {
            who = WhoWins.neither;
            out.println("It's a tie :-|");
        }
        
        out.println();
        out.println("Today's game is brought to you by");
        out.println("SnitSoft, the number one software");
        out.println("vendor in the Hankeeville area.");
        out.println("SnitSoft is featured proudly in");
        out.println("Chapter 6. And remember, four out");
        out.println("of five doctors recommend");    
        out.println("SnitSoft to their patients.");
        out.println();

        if (who == WhoWins.home) {
            out.println("We beat 'em good. Didn't we?");
        }

        if (who == WhoWins.visitor) {
            out.println("The umpire made an unfair"); 
            out.println("call.");
        }

        if (who == WhoWins.neither) {
            out.println("The game goes into overtime."); 
        }

        keyboard.close();
    }
}
