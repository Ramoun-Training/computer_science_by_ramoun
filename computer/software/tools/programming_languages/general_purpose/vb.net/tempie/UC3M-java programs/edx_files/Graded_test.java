package edx_files;

public class Graded_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int x=5;
		String str=x+" great";
		//System.out.println("str is:"+str);//remember java converts ints into strs 
		//if one of the both sides is a string when concatenating
        //if(10 > x)System.out.println(x);
		String a = "This is a String.";
        String b="This is another String.";
        String c = "Another String this is.";
        System.out.println("b:"+b.length());
        System.out.println("c:"+c.length());
        System.out.println("a:"+a.length());*/
		
		int score = 75;//C
		String show;
		double total=score*20/100;
		
		if(score>=90)show="A";
		else if(score>=80)show="B";
		else if(score>=70)show="C";
		else if(score>=60)show="D";
		else show="F";
		
		System.out.println("First Graded Test:");
		System.out.println("YOU GOT:"+score+"%");
		System.out.println("Grade:"+show);
		System.out.println("------------------");
		System.out.println("Total="+total+"%");
	}

}
