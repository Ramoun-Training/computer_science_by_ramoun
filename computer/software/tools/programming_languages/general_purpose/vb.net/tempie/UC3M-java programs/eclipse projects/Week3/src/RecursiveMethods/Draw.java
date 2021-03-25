package RecursiveMethods;

public class Draw {

    static void printLine(int width) {
     for (int i = 0; i< width; i ++) {
         System.out.print("*");
     }
     
     System.out.println();
    }

    static void printLineWithSpaces(int width, int spaces) {
     for (int i = 0; i< spaces; i ++) {
         System.out.print(" ");
     }
     
     for (int i = 0; i< width; i ++) {
         System.out.print("*");
     }
     
     System.out.println();
    }

    static void printTriangleA(int height) {
     if (height <= 0){
         return;
     }
     
     printLine(height);
     printTriangleA(height-1);
    }

    static void printTriangleB(int height) {
     if (height <= 0) {
         return;
     }
     
     printTriangleB(height-1);
     printLine(height);
    }

    static void printTriangleC(int base,int height) {
     if (height <= 0) {
         return;
     }
     
     printLineWithSpaces(height, (base - height)/2);
     printTriangleC(base, height-2);
    }

    static void printTriangleD(int base,int height) {
     if (height <= 0) {
         return;
     }
     
     printTriangleD(base, height-2);
     printLineWithSpaces(height, (base - height)/2);
    }

    /*
     * Complete the function to print a rhombus
     * Use the previous functions
     */
    static void printRhombus(int base, int height) {
        printTriangleD(base,height);
        printTriangleC(base,height);
    }


    public static void main(String[] args) {
     printTriangleA(4);
     printTriangleB(4);
     printTriangleC(7,7);
     printTriangleD(7,7);
     printRhombus(7,12);
     String str = "****";
     System.out.println(str.substring(0,1));
    }
    
}
