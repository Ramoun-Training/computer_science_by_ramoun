package Arrays;
import static java.lang.System.out;
public class IndexOfMaxValue {

	public static void main(String[] args) {
		int arr[] = {1,40,3,4,0,6,1,7};
		int max = arr[0];
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr [i] > max) {
				max = arr [i];
				index = i;
			}
		}
		
		out.println("The maximum number index is: " + index);
	}

}
//Made with ♥ by R}AM#UN>