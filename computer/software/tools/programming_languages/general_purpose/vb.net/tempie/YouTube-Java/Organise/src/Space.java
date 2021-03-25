//import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Space {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		//Desktop desk = Desktop.getDesktop();
		boolean cont = false;
		
		File partitions [] = {new File("C:\\"),
							  new File("D:\\"),
							  new File("E:\\")}; 
		System.out.println("Choose one of the following:");
		System.out.println("0: C:\\");
		System.out.println("1: D:\\");
		System.out.println("2: E:\\");
		System.out.println("----------------------------");
		do {
			System.out.print("Enter your choise: ");
			try {
				int choice = scanner.nextInt();
				if (choice > 2 || choice < 0) {
					System.out.print("Please,Enter only one of the numbers:");
					System.out.println("0,1,2 only.");
					System.out.println();
					cont = true;
				} else {
					showSpace(partitions, choice);
				}
			} catch (IOException e) {
				System.out.println("please, enter a whole number from 0 to 2.");
				cont = true;
			} 
		} while (cont);
		
	}
	
	public static void showSpace(File [] arr, int choice) throws IOException {
		DecimalFormat df = new DecimalFormat("#.##");
		scanner = new Scanner(System.in);
		double spaceInGigs;
		double spaceInMegs;
		double spaceInKilos;
		double spaceInBytes;
		String finalSpace;
		
		File drive = arr[choice];
		File [] files = drive.listFiles();
		boolean flag = false;
		
		for (int i = 0; i < files.length; i++) {
			System.out.println();
			//Runtime.getRuntime().exec("cls");
			spaceInBytes = size(files[i]);
			spaceInGigs = spaceInBytes / 1024 / 1024 / 1024;
			spaceInMegs = spaceInBytes / 1024 / 1024;
			spaceInKilos= spaceInBytes /1024;
			if (spaceInGigs > 1) {
				finalSpace = String.valueOf(df.format(spaceInGigs) + " GB");
			} else if (spaceInMegs > 1024) {
				finalSpace = String.valueOf(df.format(spaceInMegs) + " MB");
			} else if (spaceInKilos > 1024 * 1024) {
				finalSpace = String.valueOf(df.format(spaceInKilos) + " KB");
			} else {
				finalSpace = String.valueOf(df.format(spaceInBytes) + " B");
			}
			
			System.out.println("(" + finalSpace + ")" + ": " + i
					+ " :" + files[i].getName());
		}
		
		do {
			System.out.print("Enter: ");
			try {
				int choose = scanner.nextInt();
				if (choose < 0 || choose > files.length) {
					System.out.println("Please,Enter only one of the numbers:");
					for (int i = 0; i < files.length; i++) {
						System.out.print(i + ", ");
					}
					flag = true;
				} else {
					if (files[choose].isDirectory()) {
						showSpace(files, choose);
					} else {
						System.out.println("Sorry this is a file not a directory.");
					}
				}
			} catch (Exception e) {
				System.out.println("please, enter a whole number from 0 to " + 
						files.length + ".");
				flag = true;
			}
		} while (flag);
	}
	
	public static double size(File dir) {
		double length = 0;
		for (File f : dir.listFiles()) {
			if (f.isDirectory()) {
				length += size(f);
			} else {
				length += f.length();
			}
		}
		return length;
	}

}
