package outtaBox;
import static java.lang.System.out;
public class stringEquality {

	public static void main(String args[]){
//		Equality eq = new Equality();
	    String str1 = "Hello world.";
	    String str2 = "Hello world.";

	    // if (str1 == str2)
	    //     System.out.print("str1 == str2\n");
	    // else
	    //     System.out.print("str1 != str2\n");
		//
	    // if(str1.equals(str2))
	    //     System.out.print("str1 equals to str2\n");
	    // else
	    //     System.out.print("str1 doesn't equal to str2\n");

		if (Equality.equels(str1,str2)) {
			out.println("yeah it works finally");
		}
		else {
			out.println("why the heck it is not working.");
		}


	    out.println();
	    String str3 = new String("Hello world.");
	    String str4 = new String("Hello world.");

		if (Equality.equelTo(str3,str4)) {
			out.println("yup they are equel");
		}
		else {
			out.println("No they are not equel.");
		}

	    // if (str3 == str4)
	    //     System.out.print("str3 == str4\n");
	    // else
	    //     System.out.print("str3 != str4\n");
		//
	    // if(str3.equals(str4))
	    //     System.out.print("str3 equals to str4\n");
	    // else
	    //     System.out.print("str3 doesn't equal to str4\n");
		//
		// Integer num = 3;
		// Integer number = new Integer(3);
		//
		// if (num == number) {
		// 	out.println("yes of course they are equel");
		// }
		// else {
		// 	out.println(num + " " + number.toString());
		// }
	}

}

class Equality {

	public static boolean equelTo(String x, String y) {
		int i = 0;
		boolean flag = true;

		if (x.length() != y.length()) {
			return false;
		}

		while (i < x.length()) {
			if (x.charAt(i) != y.charAt(i)) {
				flag = false;
			}
			i++;
		}

		return flag;
	}

	public static boolean equels(String x, String y) {
		int i = 0;
		int c = 0;

		if (x.length() != y.length()) return false;

		while (i < y.length()) {
			if (x.charAt(i) == y.charAt(i)) {
				c++;
			}
			i++;
		}

		if (c == y.length()) {
			return true;
		}
		else {
			return false;
		}

	}

}
//Made with ♥ by R}AM#UN>