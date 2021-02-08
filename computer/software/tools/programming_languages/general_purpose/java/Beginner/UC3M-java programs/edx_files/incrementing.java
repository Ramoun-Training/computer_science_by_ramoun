package edx_files;

public class incrementing {

	/**
	 * incrementing
	 */
	public static void main(String[] args) {
		/*
		int x=0;
		x++;//return old value then increment x+=1;
		System.out.println(x);//will print the x (actually it is already incremented)
		//so you will not feel any difference.
		//although it will appear clearly if you put it as a part of an expression
		*/
		int x=1;
		if (++x==2) {
			System.out.println("Really!!??HOw come ???");
		}
		else{
			System.out.println("yeah x is :"+x);
		}
		//now see this program.
	  // int a = 0;
	  //int b = a + 1;//1
	  //int c = (2*3)+5*4;//26
	  //int c=2;
	  //int d = c++;//26   c=27
	  //int f = --c;//26
	  
	 // System.out.println(c=12);//12
	//	System.out.println(d);
	//  System.out.println(d+1);//27
	//  System.out.println(c%2);//0
	//  System.out.println(3+4+f*2);//59
	}

}
