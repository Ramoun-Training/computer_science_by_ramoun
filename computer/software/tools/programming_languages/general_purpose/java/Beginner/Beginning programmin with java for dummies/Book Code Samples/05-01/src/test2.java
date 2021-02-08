import ramoun.io.input;

public class test2 {

	public static void main(String[] args) {
		int page = input.inputInt("Enter number of page:");
		final int TOTAL_PAGES = 483;
		double percentage = (page / (double) TOTAL_PAGES) * 100;

		System.out.printf("Percentage: %.1f",percentage);
		System.out.println("%");
	}

}