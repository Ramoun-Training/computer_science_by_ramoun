package Goodies;
import java.io.File;
public class DeleteAgain {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\pc _world\\Desktop");
		for (File file : folder.listFiles()) {
			if (file.getName().endsWith(".txt")) {
				file.delete();
			}
		}
		
		System.out.println("Deleted Successfully.");
	}

}
