package edx_files;

public class Arith_O_Diff_Types {

	/**
	 *arithmatics of different types
	 */
	public static void main(String[] args) {
		//System.out.println(4*4);//int * int = int
		//System.out.println(4*4.0);//int * float = float
		//System.out.println(4.0*4.0);//float * float = float
		int testy1=4;
		int testy2=5;
		double testy3=testy1+testy2;//you can convert integers into floats
		//int testy4=(int)testy1 + testy2;//you cannot convert floats into integers without casting
		System.out.println(testy3);
		
		int x=88;
		String a = "I am learning Java.";
		String b = "You are learning Java.";
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println((((x*2)+32)/2)-x);//the output number will differ by the value of {32}
		System.out.println((((x+3)*2)-8)/2);//x-1 (differ by the value of x)
	}

}
