package project;

import java.io.IOException;

public class pyking {
	
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("counter.py"); 
		System.out.println(p);
	}
	
}
