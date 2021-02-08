package tryItOut;
import java.util.Random;
import static java.lang.System.out;
public class Random_Names {
	
    public static void main(String[] args) {
        Random generator = new Random();
        String total = "";
        char c1 = ' ';
        char c2 = ' ';
        char c3 = ' ';
        char c4 = ' ';

        while (!total.equals("Ramn")) {
            c1 = (char) (generator.nextInt(26) + 97);
            c1 = Character.toUpperCase(c1);
            c2 = (char) (generator.nextInt(26) + 97);
            c3 = (char) (generator.nextInt(26) + 97);
            c4 = (char) (generator.nextInt(26) + 97);
            total = "" + c1 + c2 + c3 + c4;
        }
        out.println(total);
    }
}
//Made with ♥ by R}AM#UN>