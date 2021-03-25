import java.util.Scanner;
public class WorldOfGumballs {
	/*
	 * A program about integers(whole numbers)
	 * the original name of the program is keeping kids quiet.
	 * original program by:Barry Burd
	 * this remix is by:R}AM#UN>
	 */
	public static void main(String[] args) {
			Scanner strokes=new Scanner(System.in);

			System.out.println("How many kids are there?How many gumballs are there? ");//prompt
			int num_kids=strokes.nextInt();//user input
		//	String t1=strokes.nextLine();				//uncomment this line
			int num_gumballs=strokes.nextInt();//user input
		//	String t2=strokes.nextLine();
			int gumballs_per_kid=(num_gumballs/num_kids);

			System.out.print("Each kid gets ");
			System.out.print(gumballs_per_kid);
	//		System.out.println(t2);

			strokes.close();
			/*
				input:
				=====
				3	kids
				40	gumballs

				output:
				======
				Each kid gets 13 gumballs
			*/
	}

}
