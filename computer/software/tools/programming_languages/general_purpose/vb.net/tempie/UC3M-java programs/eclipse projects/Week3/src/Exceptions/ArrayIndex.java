package Exceptions;

/**
 * Main class of the Java program.
 */

public class ArrayIndex {

    public static void main(String[] args) {
        int []array = new int[10];
        for(int i=0; i<10;i++){
            array[i]=i+1;
        }
        printArray(array,11);
    }
    /**
     * Prints from the first position to the element index of an array 
     * It does not control division by 0.
     * @param   array the array to print
     * @param   n the first positions to print
     */
    static void printArray(int []array, int n){
        for(int i=0; i <n; i++){
            try {
				System.out.println("array["+i+"]="+array[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("please,enter a valid index.");
				System.out.println("you've entered index '" + n + "'");
				System.out.println("maximum index you can reach: " + (array.length) );
			} catch (Exception e) {
				System.out.println("somehting went wrong.");
				System.out.println("Here is an informative message.");
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
        }
    }
}

