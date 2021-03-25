
public class testingThrow {
	
	public static void main(String[] args) throws Exception {
		try {
			int x = 3/0;
		}
		catch (ArithmeticException e) {
			e = new ArithmeticException("division by zero results in INFINITY.");
			throw e;
		}
	}
	
	public static void m1() {
		m2();
		System.out.println("This is method m1().");
	}
	
	public static void m2() {
		m3();
		System.out.println("this is method m2().");
	}
	
	public static void m3() {
		m4();
		System.out.println("this is method m3");
	}
	
	public static void m4() throws ArithmeticException {
		int x = 3 / 0;
		System.out.println("this is method m4.");
	}
}
