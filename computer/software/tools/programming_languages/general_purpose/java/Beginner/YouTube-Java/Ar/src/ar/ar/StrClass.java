package ar.ar;

class Strclass {
	String text;
	Strclass(String x) {
		text = x;
	}
}
public class StrClass {
	public static void main (String args[]) {
		Strclass thing = new Strclass("something");
		System.out.println(thing);
	}
}