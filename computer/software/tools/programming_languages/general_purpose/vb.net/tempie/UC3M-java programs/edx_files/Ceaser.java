package edx_files;

public class Ceaser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char text[]={'A','a','B','O','m','Z'};
		for(char x:text)System.out.print(x);
		System.out.println();
		for(char x:text){
			int swap=(int)x;
			char y=Character.toLowerCase(x);
			if( y < 'z' && y >= 'a' ){//|| x < 'Z' && x >= 'A'){//#the condition
				swap+=1;
			}
			else if(x == 'z'){
				swap=(int)'a';
			}
			else if(x == 'Z'){
				swap=(int)'A';
			}
			x=(char)swap;
			System.out.print(x);
		}	
		//small program to convert lower case to upper case chars
		System.out.println();
		char didi='d';
		didi=Character.toUpperCase(didi);
		System.out.println(didi);
	}

}
