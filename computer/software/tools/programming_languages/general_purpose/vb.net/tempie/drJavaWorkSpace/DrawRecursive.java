//package RecursiveMethods;

import static java.lang.System.*;

class DrawRecursive {
	public static void main(String[] args) {
		DrawRecursive.printLine("*&", 12, true);
	}

	/**
	 * prints the shapes you want with the length you want with the ability to add a new line
	 * after each line.
	 * <p>You can enter any shape you want but number of shapes can't be more than 3 or the 
	 * rest will be chopped.</p>
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
		if (length /*shape.length()*/ > 0) {
			//recursive case
			out.print(shape);
			//printLine(shape, (length - shape.length()), newLine);
			//this is more logical for me
			printLine(shape, length - 1, newLine);
		}
		else {
			//base case
			//don't need that line cause i'll execute only on the last call when length % shape.length() = 0
			//out.print(shape.substring(0, length % shape.length()));		
			if (newLine) {
				out.println();
			}
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
		if (length > 0) {
			out.print(" ");
			printSpaces(length - 1, newLine);
		}
		else {
			if (newLine) {
				out.println();
			}
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
	public static void forwardSpace(String shape, int spaces, int steps) {
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
		if (steps > 0) {
			printLine(shape, 1, false);
			printSpaces(spaceLength, false);
			printLineWithSpaces(shape, steps - 1,  spaceLength);
		} else {
			printLine("", 1, true);
			return ;
		}
		
	}

	//NO DOCUMENTAION YET.
	public static void lineSpaceLine(String shape, int steps, int spaces, int spaceLength) {
		if (steps > spaces) {
			if (steps > 0) {
				printLine(shape, 1, false);
				if (spaces > 0) {
					printSpaces(spaceLength, false);
					spaces--;				
				}
				lineSpaceLine(shape, steps - 1, spaces, spaceLength);
			} else {
				printLine("", 1, true);
				return ;
			}
		} else {
			if (spaces > 0) {
				printSpaces(spaceLength, false);
				if (steps > 0) {
					printLine(shape, 1, false);
					steps--;
				}
				lineSpaceLine(shape, steps, spaces - 1, spaceLength);
			} else {
				printLine("", 1, true);
				return ;
			}
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
	public
	 static void printTriangleLeftV (String shape, int height, boolean strips) {
		if (height > 0) {
			printLine(shape, height, true);
			if (strips) {
				out.println();
			}
			printTriangleLeftV(shape, height - 1, strips);
		} else {
			printLine("", 1, true);
			return ;
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
	static boolean mark = true;
	static int t = 0;
	public static void printTriangleLeftVReversed(String shape, int height, boolean strips) {
		//checking if it is the first time or not
		if (mark) {
			mark = false;
			t = height + 1;
		}
		if (height > 0) {
			printLine(shape, t - height, true);
			//another way
			/*for (int j = 1; j <= i; j++) {
				out.print(shape);
			}
			out.println();*/
			if (strips) {
				out.println();
			}
			printTriangleLeftVReversed(shape, height - 1, strips);	
		} else {
			printLine("", 1, true);
			return ;
		}
	}


	static boolean flag = true;
	static int indent;
	public static void printTriangleV(String shape, int height, boolean strips) {
		//adjusting the height variable
		if (flag) {
			height *= 2;
			height = height % 2 == 1? height : height-1;
			flag = false;
			indent = 0;
		}

		//printing the trianlge step by step
		if (height > 0) {
			forwardSpace(shape, indent++, height);
			if (strips) {
				out.println();
			}
			printTriangleV(shape, height - 2, strips);
		}
		else {
			printLine("", 1, false);
			return ;
		}
	}

	static int counter = 1;
	public static void printTriangleA(String shape, int height, boolean strips) {
		//recursion starts here
		if (height > 0) {
			forwardSpace(shape, height - 1, counter);
			if (strips) {
				out.println();
			}
			counter += 2;
			printTriangleA(shape, height - 1, strips);	
		} else {
			counter = 1;
			return ;
		}
	}

	public static void printRhombus(String shape, int height, boolean strips) {
		printTriangleA(shape, height, strips);
		//
		printTriangleV(shape, height, strips);
	}
}
