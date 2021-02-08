import java.io.IOException;

public class TestingClearing {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("testing the console.");
		/*for (int i = 0; i < 10; i++) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println(new String(Character.toChars(9775)));
		}*/
		/*final String operatingSystem = System.getProperty("os.name");

		if (operatingSystem .contains("Windows")) {
		    Runtime.getRuntime().exec("cls");
		}
		else {
		    Runtime.getRuntime().exec("clear");
		}*/
		System.out.println("\033[H\033[2J");
		
		System.out.println("you said what????");
	}
}
