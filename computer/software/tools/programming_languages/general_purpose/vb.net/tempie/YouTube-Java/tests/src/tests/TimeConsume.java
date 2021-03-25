package tests;

public class TimeConsume {

	public static void main(String[] args) {
		System.out.println(loop(6));
	}
	
	public static int loop(int n) {
		return n*(n+1)/2;
	}
	
}
