package Arrays;
import static java.lang.System.out;
public class Average {

	public static void main(String[] args) {
		int arr[] = {1,23,43,345,1,1,354,134,154,235};
		float average = 0;
		
		for (int element : arr) {
			average += element;
		}
		average /= arr.length;
		
		out.println("average: " + average);
	}

}
//Made with ♥ by R}AM#UN>