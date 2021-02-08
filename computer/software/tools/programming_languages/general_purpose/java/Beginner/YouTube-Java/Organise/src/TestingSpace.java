import java.io.File;
import java.text.DecimalFormat;
import java.util.Locale;

public class TestingSpace {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		double spaceInBytes = size(new File("D:\\"));
		double spaceInGigs = spaceInBytes / 1024.0 / 1024.0 / 1024.0;
		double spaceInMegs = spaceInBytes / 1024.0 / 1024.0;
		double spaceInKilos= spaceInBytes /1024.0;
		
		System.out.println(df.format(spaceInGigs) + " giga");
		System.out.println(df.format(spaceInMegs) + " mega");
		System.out.println(df.format(spaceInKilos)+ " kilo");
		System.out.println((spaceInBytes) + " bytes");
		
	}
	
	public static double size (File dir) {
		double length = 0;
		try {
			for (File file : dir.listFiles()) {
				if (file.isDirectory()) {
					length += size (file);
				} else {
					length += file.length();
				}
				System.out.println(file);
			}
		} catch (NullPointerException e) {
			
		}
		return length;
	}
}
