import java.util.Scanner;
class scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println(keyboard.next());//just one word
		System.out.println(keyboard.nextInt());//an integer number
		System.out.println(keyboard.nextFloat());//a float number only	
		System.out.println(keyboard.nextLine());//full text line (String)

		keyboard.close();
}
}
