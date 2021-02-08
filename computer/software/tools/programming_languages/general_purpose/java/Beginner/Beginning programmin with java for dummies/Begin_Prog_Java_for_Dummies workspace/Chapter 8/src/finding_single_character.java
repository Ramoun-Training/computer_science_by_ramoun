import java.util.Scanner;
public class finding_single_character {

	public static void main(String[] args) {
		System.out.print("We are going to take 3 characters only: ");
        m2();
	}

	public static void m1() {
		Scanner strokes=new Scanner(System.in);
		char c1,c2,c3;//the charAt() will return a char type output
		
		c1=strokes.findWithinHorizon(".", 0).charAt(0);
		c2=strokes.findWithinHorizon(".", 0).charAt(0);
		c3=strokes.findWithinHorizon(".", 0).charAt(0);
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		
		strokes.close();
	} 
	
	public static void m2() {
		Scanner strokes=new Scanner(System.in);
        String s1,s2,s3;//findWithinHorizon returns a string type output
        
        s1=strokes.findWithinHorizon(".",0);
        s2=strokes.findWithinHorizon(".",0);
        s3=strokes.findWithinHorizon(".",0);
        System.out.print(s1);
        System.out.print(s2);
        System.out.print(s3);
        strokes.close();
	}
	
}
