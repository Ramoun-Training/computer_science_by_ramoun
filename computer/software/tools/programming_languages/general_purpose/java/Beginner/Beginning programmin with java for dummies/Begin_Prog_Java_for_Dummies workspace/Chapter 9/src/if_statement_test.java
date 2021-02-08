import java.util.Scanner;
public class if_statement_test {

	public static void main(String[] args) {
		Scanner strokes=new Scanner(System.in);
		double x;
		
		System.out.print("Enter password: ");
		x=strokes.nextDouble();
		
		if(x==123)System.out.println("good");//if clause ends here
		//System.out.println("hahahah");//a statement out of the if scope 
		else ;//else clause ends here
		System.out.println("BAD");//a statement that will execute anyway 
		
		strokes.close();
	}

}
