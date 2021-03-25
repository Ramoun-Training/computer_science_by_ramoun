package project;

import java.io.*;

public class PyCreate {
	public static void main(String[] args) throws IOException {
		String path = "what_is_your_name.java";
		PyCreate.createFile(path);
		PyCreate.program(path);
	}
	
	public static void createFile(String path) throws IOException {
		File file = new File(path);
		file.createNewFile();
	}
	
	public static void program(String path) throws IOException {
		File file = new File(path);
		FileWriter fw = new FileWriter(file,true);
		fw.write("import java.util.Scanner;\n"
				+ "class NewClass {\n"
				+ "\tpublic static void main(String[]args){\n"
				+ "\t\tScanner scanner = new Scanner(System.in);\n"
				+ "\t\tSystem.out.println(\"Enter your name:\");\n"
				+ "\t\tString name = scanner.nextLine();\n"
				+ "\t\tSystem.out.println(\"Your name is : \" + name);\n"
				+ "\t}\n"
				+ "}");
		fw.close();
	}
}
