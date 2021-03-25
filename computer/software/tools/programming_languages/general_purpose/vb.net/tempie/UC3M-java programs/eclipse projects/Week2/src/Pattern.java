/**
 * Main class of the Java program.
 * Change the value of the attribute selection to see different mazes
 * You can use as values Main.LIGHTUP, Main.Z_PATTERN, Main.Z_PATTERN and -1
 * Remember compile again after each change
 */

//So dammen samrt way instead of enumeration.
public class Pattern {
    private static int numTiles = 8;
	private static final int LIGHTUP = 0;
	private static final int Z_PATTERN = 1;
	private static final int ZIGZAG_PATTERN = 2;
	private static int selection = Z_PATTERN; //Change value of "selection"

  public static void main (String[] args){
	if(selection == LIGHTUP){
		lightUp(numTiles);
	}else if(selection == Z_PATTERN){
		zPattern(numTiles);
	}else if(selection == ZIGZAG_PATTERN){
		zigzagPattern(numTiles);
	}else{
		System.out.println("Non valid pattern");
	}
  }

  public static void lightUp(int numTiles){
	for(int i = 0; i < numTiles; i++){
		for(int j = 0;j < numTiles; j++){
			if((i+j)%2 == 0){
				System.out.print("1");
			}else{
				System.out.print("0");
			}
		}
	    System.out.println();
		}
	}
  public static void zPattern(int numTiles){
	for(int i = 0; i < numTiles; i++){
		for(int j = 0; j < numTiles; j++){
			if(i == 0 || i == numTiles-1){
				System.out.print("1");	
			}else if (i+j == numTiles-1){
				System.out.print("1");				
			}else{
				System.out.print(" ");
			}				
		}
		System.out.println();
	}
  }

  public static void zigzagPattern(int numTiles){
	for(int i = 0; i < numTiles; i++){
		for(int j = 0; j < numTiles; j++){
			if(i%2 == 0){
				System.out.print("1");	
			}else if ((i-1)%4 == 0 && j == numTiles-1){
				System.out.print("1");				
			}else if((i+1)%4 == 0 && j == 0){
				System.out.print("1");	
			}else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
  }
}
