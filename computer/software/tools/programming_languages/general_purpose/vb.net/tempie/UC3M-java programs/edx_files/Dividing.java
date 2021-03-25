package edx_files;

public class Dividing {

	/**
	 *dividing method
	 */
	public static void main(String[] args) {
		int x=120;
		int y=6;
		int i=0;
		int remainder=x;
		while(remainder>=y){remainder=remainder-y; i++;}
		System.out.println("The Result:"+i);
		System.out.println("The Remainder:"+remainder);
		System.out.println("------------------");
		System.out.println("The Entered Number:"+(y*i+remainder));
	}

}
