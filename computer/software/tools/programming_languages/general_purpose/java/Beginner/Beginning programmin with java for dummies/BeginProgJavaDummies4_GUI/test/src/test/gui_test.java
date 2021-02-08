package test;

import java.util.*;
import static java.lang.System.*;

public class gui_test {
	public static void main(String ex[]) {
		Scanner key = new Scanner(in);
		char [] arr = new char [10];
		
		/*for (int i = 0; i < 10 ; i++) {
			arr[i] = key.next().charAt(0);
		}

		System.out.println(arr);*/
		System.out.println(key.findWithinHorizon("4" , 3));
		
		key.close();

	}
}
