import java.util.Scanner;
public class Score_Basketball_Ramoun {

	public static void main(String[] args) {
		Scanner strokes = new Scanner (System.in);
		int yankees,socks;
	

		System.out.print("Enter the yankees score: ");
		yankees=strokes.nextInt();
		System.out.print("Enter the socks score: ");
		socks=strokes.nextInt();

		if (yankees>socks) {
			System.out.println("yankees: "+yankees);
			System.out.println("socks: "+socks);
		}
		else{
			System.out.println("socks: "+socks);
			System.out.println("yankees: "+yankees);
		}
		
		strokes.close();
	}

}
