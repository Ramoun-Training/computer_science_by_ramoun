import static java.lang.System.out;
public class TestingTheSwitch {

	public static void main(String[] args) {
		java.util.Random generator ;//declaring the variable
		generator = new java.util.Random();//creating object //reserving space in ram
		int n = 1;boolean x;
		
		if (x = false);
		else
			switch (1 + generator.nextInt(12)) {
				case 2  :
						 out.println();
				case 11 : 
						 System.out.println("ok,ok.");out.println("n : "+n);//break;
				default : 
						 System.out.println("default nothing matches.");out.println("n : "+n);
						 out.println("the "+x+" part.");
			}
		//out.println(z);
	}

}
