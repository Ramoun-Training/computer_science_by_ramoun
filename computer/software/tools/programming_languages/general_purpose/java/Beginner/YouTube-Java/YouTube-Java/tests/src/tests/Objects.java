package tests;

class Box {
	int height;
	int width;
}

public class Objects {
	public static void main(String[] args) throws ArithmeticException {
		try {
			int x = 3/0;
		} catch (Exception e) {
			System.out.println("shit");
		}//throwable -> Exception -> RuntimeException -> ArithmeticException
	}
}
