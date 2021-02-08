package tryItOut;
import java.util.Random;

public class ValueGenerator {
    Random generator = new Random();
    public double balance = generator.nextDouble() + generator.nextInt(10000000);
    public int id = generator.nextInt(500000);
    public String Name = char_generator();
    String char_generator() {
        char c1 = (char) (generator.nextInt(26) + 'a');
        c1 = Character.toUpperCase(c1);
        char c2 = (char) (generator.nextInt(26) + 'a');
        char c3 = (char) (generator.nextInt(26) + 97);
        char c4 = (char) (generator.nextInt(26) + 97);
        return "" + c1 + c2 + c3 + c4;
    }

}
//Made with ♥ by R}AM#UN>