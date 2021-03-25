public class traingleV2 {
	public static void main(String [] args) {
		for(int j=0; j<5; j++) {
		    for(int i=0; i<=j; i++) {
		        System.out.print(((i+j)%2==0 ? "*" : "#"));
		    }
		    System.out.println();
		}
	}
}
