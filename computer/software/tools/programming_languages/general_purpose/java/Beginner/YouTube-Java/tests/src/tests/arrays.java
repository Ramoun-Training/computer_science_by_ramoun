package tests;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import ramoun.files.Search;

public class arrays {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Desktop desk = Desktop.getDesktop();
		Scanner reader = new Scanner(System.in);
		ArrayList<String> txtFiles = new ArrayList<String>();
		Search looking;
		char input;
		
		System.out.print("Choose a path <q: for quit.>: ");
		input = reader.findWithinHorizon(".", 0).charAt(0);
		
		while (input != 'q') {
			looking = new Search(Search.OpenOp.PATH_COPY);
			txtFiles.add(Search.desiredPath.getPath());
			System.out.print("Choose a path <q: for quit.>:");
			//at the second iteration a NosuchElementException is thrown
			reader = new Scanner(System.in);
			input = reader.findWithinHorizon(".", 0).charAt(0);
		} 
		
		System.out.println(txtFiles);
		
		for (int i = 0; i < txtFiles.size(); i++) {
			desk.open(new File(txtFiles.get(i)));
		}
		
		reader.close();
		
	}
	
	
	
}
