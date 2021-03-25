package edx_files;

public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*
		// array declartion
		byte[]a;
		short[] b;
		int[] c;
		long[] d;
		double[] e;
		float [] f;
		boolean[] g;
		char[] h;
		String[] i;

		//array creation (reserving space in memory)
		a=new byte[5];
		b=new short[5];
		c=new int[4];
		d=new long[5];
		e=new double[6];
		f=new float[4];
		g=new boolean[3];
		h=new char[4];
		i=new String[3];
		//declaration and creation in the same line
		int[] nums=new int[4];
		//access elements of an array
		nums[0]=11;//first element in the array is now 11
		nums[4]=22;//error array has been declared of length 4 indices go from 0 to 3
	    //assignment
		c[0]=33;
		c[1]=44;
		c[2]=55;
		c[3]=c[1]+c[2];//array name with an index is like identifiers
		//Declaration ,creation,initialization at once
		String[] bears={"red","blue","green"};
		//arrays and strings are not the same thing although it is straightforward to
		//convert from one to another
		char[] word={'w','o','r','d'};
		//an element of an array might also be an array
		//2-D arrays
		int[]twodim={[1,2,3,4],[5,6,7,8]};
		//Conclusion
		//Length fixed at declaration
		//All elements of the same time
		//elements might be arrays
*/
/*
		int [] roots={2,3,4,5,6,7,8,9,10};
		int [] square=new int[roots.length];
		int sum=0;
		int sum_sq=0;
		for (int i=0;i< roots.length ;i++) {
			//square[i]=roots[i]*roots[i];
			square[i]=roots[i]*roots[i];
			sum+=roots[i];
			sum_sq+=square[i];
			System.out.println("root:"+roots[i]+"     "+"squared:"+square[i]);
		}

		System.out.println("---------------------------------------------");
		System.out.println("roots sum:"+sum);
		System.out.println("squared sum:"+sum_sq);
*/
		/*

		int [] list1=new int[5];
		list1[0]=1;
		list1[1]=2;
		list1[2]=3;
		for (int x:list1) {
				System.out.println("list["+"]:"+x);
		}
    //----------------------------------------------------------------------
		//average of an array v.1.0
    int[] array = new int[] {11, 22, 33, 44, 55};//new way of initialization
    double average = 0;
    for (int element : array){
        average += element;
    }
    if (array.length > 0){//check if the array is empty or not
        average = average / array.length;
    }
    System.out.println(average);
    //----------------------------------------------------------------------
		//average of an array v.2.0
		int[] array = new int[] {11, 22, 33, 44, 44};
		double average = 0;
		double sum = 0;
		int count = 0;
		for (int element : array){
		    if (element % 2 != 0) {
		        count++;
		        sum += element;
		    }
		}
		if (count > 0){
		    average = sum / count;
		}
		System.out.println(average);
		//-----------------------------------------------------------------------
		//max value in an array by index
		int array[] = {1,23,14,205,48};
    int max = 0;
    for (int i = 1; i < array.length; i++){
         if (array[ind] < array[i]){
             ind = i;
         }
    }
    System.out.println(array[ind]);
		//-----------------------------------------------------------------------
		//max value in an array by value
		int ar[]={1,2,3,4};
    int maxx=ar[0];
    for(int i=1;i<ar.length;i++)
    {
        if(ar[i] >= maxx){
            maxx=ar[i];
        }
    }
    System.out.println(maxx);*/
	}
}
