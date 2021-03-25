package ramoun.files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BlurCurse {
	public static void main(String[] args) throws IOException {
		//Search find = new Search ("D:\\", "");
				File sourceFile = new File("C:\\Users\\Ramoun\\Desktop\\holder\\n.txt");
				File holderFolder = new File(sourceFile.getParent());
				File newFolder = new File(holderFolder.getParent() + "\\" + "outtaCursing");
				if (!newFolder.exists()) {
					newFolder.mkdir();
				}
				File newFile = new File(newFolder.getPath() + "\\" + sourceFile.getName());
				
				FileWriter fw = new FileWriter(newFile);
				PrintWriter pw = new PrintWriter(fw);

				Scanner scanner = new Scanner(sourceFile);
				
				while (scanner.hasNext()) {
					String line = scanner.nextLine();
					int n = line.length() / 2;
					int beg = n - 2;
					char[] charArray = line.toCharArray();
					for (int i = beg; i <= n; i++) {
						charArray[i] = '*';
					}
					pw.println(charArray);
				}
				
				
//				input = input.toLowerCase();
//				input = input.replaceAll("fuck", "F**K");
				
				System.out.println();
				
				scanner.close();
				pw.close();
				
	}
}
