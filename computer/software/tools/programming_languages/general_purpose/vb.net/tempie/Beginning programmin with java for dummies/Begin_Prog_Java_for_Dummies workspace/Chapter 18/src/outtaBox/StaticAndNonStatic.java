package outtaBox;

class Sheep {
	 int LEGS = 4;
	 String color;
	 float size;

	 void walk() {
		 System.out.print("..........");
	 }
	static Sheep bigger(Sheep sheep1,Sheep sheep2) {
		if (sheep1.size > sheep2.size) {
			return sheep1;
		}
		else {
			return sheep2;
		}
	}
}

public class StaticAndNonStatic {

	public static void main(String[] args) {
		Sheep sheep1 = new Sheep();
		Sheep sheep2 = new Sheep();

		sheep1.color = "red";
		sheep1.size = (float) 5.5;
		sheep2.color = "white";
		sheep2.size = 6;

		if (Sheep.bigger(sheep1,sheep2) == sheep1) {
			System.out.println("sheep1 is bigger than sheep2");
		}
		else {
			System.out.println("sheep2 is bigger than sheep1");
		}

		sheep1.walk();
		sheep2.walk();

	}

}
//Made with ♥ by R}AM#UN>