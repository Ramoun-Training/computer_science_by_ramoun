package Arrays;
import static java.lang.System.out;
public class CountEven {

	public static void main(String[] args) {
		int counter = 0;
		int array[] = {1,2,2,4,5,6,7,13};
		
		for (int element : array) {
			if (element % 2 == 0) {
				counter++;
			}
		}
		
		out.println("There is " + counter + " even number(s).");
	}

}
//Made with ♥ by R}AM#UN>