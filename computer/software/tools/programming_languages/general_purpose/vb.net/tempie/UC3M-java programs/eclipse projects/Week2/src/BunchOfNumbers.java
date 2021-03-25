/**
 * Do not change the method or class
 * declarations.
 */

public class BunchOfNumbers {

	public static void main(String[] args) {
		// Option 1
		for(int i=20; i >= 0 ; i--){
		    System.out.print(i);
		    if(i>0){
		        System.out.print(", ");
		    }
		}
		System.out.println(".");
		
		
		// Option 2
		for(int i=0; i < 21; i++){
		    System.out.print((20-i));
		    if(i<20){
		        System.out.print(", ");
		    }
		}
		System.out.println(".");
	}
}
