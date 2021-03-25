import static java.lang.System.out;
public class zMaze {

	public static void main(String[] args) {
		int size = 7; 
		
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if (i == 0 || i == size-1) {
					out.print("1");
				}
			}
			out.println();
		}

	}

}
