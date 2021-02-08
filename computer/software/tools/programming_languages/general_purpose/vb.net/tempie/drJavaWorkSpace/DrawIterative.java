//package RecursiveMethods;

import static java.lang.System.*;

class DrawIterative {

	public static void main(String[] args) {
		
	}

	/**
	 * prints the shapes you want with the length you want with the ability to add a new line
	 * after each line.
	 * <p>You can enter any shape you want but number of shapes can't be more than 3 or the 
	 * rest will be chopped.</P>
	 *
	 * <b>Example:</b></br>
	 * </pre>        printLine("*", 5, true);
	 *			     <em>output:</em> *****
	 *
	 * @param shape the shapes you wanna see in the printed line
	 * @param length the length (number of times you wanna repeat that shape)
	 * @param newLine the ability to move the cursor to a new line after printing the shapes
	 * 
	 */
	public static void printLine(String shape, int length, boolean newLine) {
		/*if (shape.length() == 1) {
			for (int i = 0; i < length; i++) {
				out.print(shape);
			}
		} else if (shape.length() == 2) {
			for (int i = 0; i < length/2; i++) {
				out.print(shape);
			}
			out.print(length % 2 == 1? shape.substring(0,1) : "");
		} else {*/
			/*
			shape = shape.substring(0,3);
			for (int i = 0; i < length/3; i++) {
				out.print(shape);
			}
			if (length % 3 == 0) {
				// do nothing
			} else if (length % 3 == 1) {
				out.print(shape.substring(0,1));
			} else if (length % 3 == 2) {
				out.print(shape.substring(0,2));
			}
			*/
			for (int i = 0; i < length/shape.length(); i++) {
				out.print(shape);
			}
			out.print(shape.substring(0, length % shape.length()));
        //}

		if (newLine) {
			out.println();
		}
	}

	/**
	 * prints spaces as a line depending on the length that the user enters.
	 *
	 * <p>Example:</p></br>
	 * </pre>        printSpaces(4, true);
	 *				 <em>Output:</em>_ _ _ _ (^_* the _ is a representation of spaces)
	 *
	 * @param length number of printed spaces on the screen
	 * @param newLine the ability to move the cursor to a new line after printing the spaces
	 *
	 */
	public static void printSpaces(int length, boolean newLine) {
		for (int i = 0; i < length; i++) {
			out.print(" ");
		}

		if (newLine) {
			out.println();
		}
	}

	/**
	 * adds a space preceding the shape you wanna print
	 *
	 * <p>Example:</p></br>
	 * </pre>        forwardSpace("#", 6, 3);
	 *               <em>Output:</em>   ######
	 *
	 * @param shape the shape you wanna see in the printed line
	 * @param steps number of times you wanna repaeat that shape
	 * @param spaces number of spaces you wanna print before the printing the shape
	 *
	 */

	public static void forwardSpace(String shape, int steps, int spaces) {
		printSpaces(spaces, false);
		printLine(shape, steps, true);
	}

	/**
	 * prints a line of shapes and spaces between them
	 *
	 * <p>Example:</p></br>
	 * </pre>        printLineWithSpaces("*", 5, 2);
	 *				 <em>Output:</em>*  *  *  *  *
	 *
	 * @param shape the shape you wanna see in the printed line
	 * @param steps number of times you wanna repaeat that shape with the space
	 * @param spaceLength the length of the spaces between shapes
	 *
	 */
	public static void printLineWithSpaces(String shape, int steps, int spaceLength) {
		for (int i = 0; i < steps; i++) {
			printLine(shape, shape.length(), false);
			printSpaces(spaceLength, false);
		}
		out.println();
	}

	//NO DOCUMENTAION YET.
	public static void lineSpaceLine(String shape, int steps, int spaces, int spaceLength) {
		if (steps > spaces) {
			for (int i = 0; i < steps; i++) {
				printLine(shape, 1, false);
				if (spaces > 0) {
					printSpaces(spaceLength, false);
					spaces--;
				}
			}
			out.println();
		}
		else {
			for (int i = 0; i < spaces; i++) {
				printSpaces(spaceLength, false);
				if (steps > 0) {
					printLine(shape, 1, false);
					steps--;
				}
			}
			out.println();
		}
	}

	/**
	 * prints a left v shape triangle
	 *
	 * <p>Example:</p></br>
	 * </pre>        printTriangleLeftV("*", 4, false);
	 *				 <em>Output:</em>****
	 *								 ***
	 *                               **
	 *                               *
	 *
	 * @param shape the shape you wanna see in the printed line
	 * @param height the height (number of lines) of the triangle
	 * @param strips the ability to add blank lines between the lines of the triangle
	 *
	 */
	public static void printTriangleLeftV (String shape, int height, boolean strips) {
		for (; height > 0; height--) {
			printLine(shape, height, true);
			if (strips) {
				out.println();
			}
		}
	}

	/**
	 * prints a reversed left v shape triangle
	 *
	 * <p>Example:</p></br>
	 * </pre>        printTriangleLeftVReversed("*", 4, false);
	 *				 <em>Output:</em>*
	 *								 **
	 *                               ***
	 *                               ****
	 *
	 * @param shape the shape you wanna see in the printed line
	 * @param height the height (number of lines) of the triangle
	 * @param strips the ability to add blank lines between the lines of the triangle
	 *
	 */
	public static void printTriangleLeftVReversed(String shape, int height, boolean strips) {
		for (int i = 1; i <= height; i++) {
			printLine(shape, i, true);
			//another way
			/*for (int j = 1; j <= i; j++) {
				out.print(shape);
			}
			out.println();*/
			if (strips) {
				out.println();
			}
		}
	}

	public static void printTriangleV(String shape, int height, boolean strips) {
		height *= 2;
		for (int i = 0; height >= 0; height-=2, i++) {
			//printSpaces(i, false);
			//printLine(shape, height, true);
			height = height % 2 == 1? height : height-1;
			forwardSpace(shape, height, i+1);
			if (strips) {
				out.println();
			}
		}
	}

	public static void printTriangleA(String shape, int height, boolean strips) {
		int tempHeight = height;
		height *= 2;
		for (int counter = 1; counter <= height; counter+=2, tempHeight--) {
			//printSpaces(tempHeight, false);
			//printLine(shape, i, true);
			forwardSpace(shape, counter, tempHeight);
			if (strips) {
				out.println();
			}
		}
	}

	public static void printRhombus(String shape, int height, boolean strips) {
		printTriangleA(shape, height, strips);
		printLine(shape, height*2+1, true);
		printTriangleV(shape, height, strips);	
	}

}
/*
Ideas:
At printShapes -> you can convert the shapes var into an array of chars and 
				  use an if statement so that at certain position when the remainder is
				  one print an astrisk and so on...
*/

//and his name is john cena
