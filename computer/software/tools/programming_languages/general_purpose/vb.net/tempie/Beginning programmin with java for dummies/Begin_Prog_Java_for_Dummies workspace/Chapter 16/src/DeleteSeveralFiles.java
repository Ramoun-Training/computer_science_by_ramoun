import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
public class DeleteSeveralFiles {

	public static void main(String[] args) throws IOException {
		del("C:\\Users\\Ramoun\\Desktop\\fold");
		//create("C:\\Users\\Ramoun\\Desktop\\fold\\coco",1000000);
	}
	
	
	public static void del(String dir) {
		File folder = new File(dir);
		for (File element : folder.listFiles()) {
			if (element.getName().endsWith(".txt")) {
				element.delete();
			}
		}
	}

	
	
	public static void create(String dir, int n) throws IOException {
		File file = new File(dir);
		String path;
		for (int i = 0; i < n; i++) {			
			path = file.getPath() + i + ".txt";
			//System.out.println(path);
			File fil = new File(path);
			fil.createNewFile();
			
		}
	}
}
