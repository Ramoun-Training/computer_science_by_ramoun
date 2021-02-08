import java.util.Scanner;
class findWithinHorizon{
	/*
	 * findWithinHorizon("arg1",arg2);
	 * arg1 determines the regular expression
	 * arg2 determines the horizon(number of digits to search in)
	 */
    public static void main(String[] args) {
            findWithinHorizonReverse();
    }
    
    public static void findWithinHorizonReverse() {
    	Scanner keys=new Scanner(System.in);
        char c,d,e,f,g,h;

        System.out.print("Enter 5 character word: ");
        c=keys.findWithinHorizon(".",1).charAt(0);//smart way to convert to (char) type
        d=keys.findWithinHorizon(".",1).charAt(0);
        e=keys.findWithinHorizon(".",1).charAt(0);
        f=keys.findWithinHorizon(".",1).charAt(0);
        g=keys.findWithinHorizon(".",1).charAt(0);
        h=keys.findWithinHorizon(".",1).charAt(0);

        System.out.print(h);
        System.out.print(g);
        System.out.print(f);
        System.out.print(e);
        System.out.print(d);
        System.out.print(c);

        keys.close();
    }

    public static void findWithinHorizonConsecutive() {
    	/*
    	 * input prompt for each method never ends until you enter 3 consecutive numbers
    	 */
    	Scanner strokes=new Scanner(System.in);
    	String s2,s1;
    	
    	System.out.print("Enter 3 consecutive numbers(digits) per turn: ");
    	s1=strokes.findWithinHorizon("\\d\\d\\d", 0);//ends when you enter 3 numbers
    	s2=strokes.findWithinHorizon("\\d\\d\\d", 0);//same here
    	
    	System.out.println(s1);
    	System.out.println(s2);
    	
    	strokes.close();
    }
}