import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class ICanAnswerAnyQuestion {

	public static void main(String[] args) {
		Scanner strokes = new Scanner (System.in);
		Random Generator = new Random();
		int random_number;

		out.print("Enter A \"YES OR NO\" Question: ");
		strokes.nextLine();

		random_number = Generator.nextInt(10) + 1;

		switch (random_number) {
		case 1 :
			out.println("yes,sir.OfCourse.");
			break;
		case 2 :
			out.println("NO,AND DON'T ASK AGAIN");
			break;
		case 3 :
			out.println("WHAT PART OF \"NO\" DON'T YOU UNDERSTAND.");
			break;
		case 4 :
			out.println("SURE,whatever!");
			break;
		case 5 :
			out.println("Yes,buy only if you are good to your mother.");
			break;
		case 6 :
			out.println("NO,CHNACE.NOT EVEN LITTLE.");
			break;
		case 7 :
			out.println("Yes,AS IF I CARE.GO AWAY AND DON'T COME AGAIN.");
			break;
		case 8 :
			out.println("NO,and please i can't take anymore.");
			out.println("DON'T ASK THAT STUPID Question AGAIN CAUSE IT WILL NEVER BE.");
			break;
		case 9 :
			out.println("Yes,Are You happy!.");
			break;
		case 10 :
			out.println("I'am Sorry but 'NO'.");
			break;
		default:
			out.println("YOU THINK YOU HAVE PROBLEMS.");
			out.println("MY RANDOM NUMBER GENERATOR IS BROKEN.");
			out.println("YOU AND YOUR STUPID QUESTIONS.");
		}

		out.println("BYE!!");

		strokes.close();
	}

}
