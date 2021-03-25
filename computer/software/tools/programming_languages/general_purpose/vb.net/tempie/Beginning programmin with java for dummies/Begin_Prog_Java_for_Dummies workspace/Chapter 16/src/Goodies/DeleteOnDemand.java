package Goodies;
import java.io.File;
public class DeleteOnDemand {

	public static void main(String[] args) {
		File file1 = new File("C:\\Windows\\Temp\\g4AE4.tmp");
		File file2 = new File("C:\\Windows\\Temp\\g3025.tmp.exe");
		
		file1.delete();
		file2.delete();
		
		System.out.println("Deleted Successfully!");
	}

}
