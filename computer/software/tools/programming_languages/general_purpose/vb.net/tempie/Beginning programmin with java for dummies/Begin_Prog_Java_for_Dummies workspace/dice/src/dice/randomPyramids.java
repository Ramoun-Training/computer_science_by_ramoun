package dice;
import static java.lang.System.out;
import java.util.Random;

public class randomPyramids {

	public static void main(String[] args) {
		Random generator = new Random();
		int i = generator.nextInt(10)+1;
		int j = i;
		String space = "";
		String pres = "";
		String astrisk = "";
		
		out.println("test");
		
		while(j>0) {
			pres = pres +" ";
			j--;
		}
		while(i>0) {
			out.print(pres);
			out.print("*");
			out.print(space);
			out.println("*");
			i--;
			space = space + "  ";
			astrisk = astrisk + "**";
			pres = pres.substring(0, i);
		}
		
		out.println("*"+astrisk+"*");
	}

}
