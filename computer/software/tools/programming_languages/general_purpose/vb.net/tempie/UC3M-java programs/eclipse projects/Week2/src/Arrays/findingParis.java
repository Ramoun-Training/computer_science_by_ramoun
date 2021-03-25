package Arrays;
import static java.lang.System.out;
public class findingParis {
	
	public static void main(String[] args) {
		int array[] = {1,2,2,4,5,6,7,2};
		int counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 1 + i; j < array.length; j++) {
				counter += array[i] == array[j]? 1 : 0;
			}
		}
		
		out.println(counter > 0? "found "+counter+" pair(s)." : "didn't find pairs.");
	}

}
//Made with ♥ by R}AM#UN>