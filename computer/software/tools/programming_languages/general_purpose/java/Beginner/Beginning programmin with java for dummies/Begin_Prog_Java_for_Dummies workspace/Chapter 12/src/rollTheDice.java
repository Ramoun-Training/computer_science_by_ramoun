import java.util.Random;
import static java.lang.System.out;

class rollTheDice {
    public static void main (String[] args) throws java.lang.Exception
    {
       int die1=0,die2=0;
        Random generator = new Random();
        boolean isNot12=!(die1+die2==12);
        boolean is12=false;
        
        while(isNot12){
            die1=generator.nextInt(6)+1;
            out.print(die1);
            out.print("    ");
            die2=generator.nextInt(6)+1;
            out.println(die2);
            is12=die1+die2==12?true:false;
            isNot12=!(die1+die2==12);
        }
        if(is12){
            out.println("You Won You got 12.");
        }
        else{
            out.println("Sorry,You lose You got "+(die1+die2));
        }
    }
}