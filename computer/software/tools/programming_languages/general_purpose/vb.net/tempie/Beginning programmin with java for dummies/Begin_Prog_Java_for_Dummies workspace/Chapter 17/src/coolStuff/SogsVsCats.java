package coolStuff;

enum dog_types {pitbull,german}
enum cat_types {sherazi,siame}
enum color {red,blue,white,black,brown}

class Dog {
	static final int LEGS = 4;
	color Color;
	dog_types type;
	String text;
}

class Cat {
	final int LEGS = 4;
	color Color;
	cat_types type;
}

public class SogsVsCats {
	
	public static void main (String args[]) {
		Cat selena = new Cat();
		Dog rex = new Dog();
		
		selena.Color = color.red;
		selena.type = cat_types.sherazi;
		
		rex.Color = color.white;
		rex.type =  dog_types.german;
		
		System.out.println("selena's legs: "  + selena.LEGS);
		System.out.println("selena's color: " + selena.Color);
		System.out.println("selena's type: "  + selena.type);
		System.out.println(selena.LEGS);
	}
	
}
//Made with ♥ by R}AM#UN>