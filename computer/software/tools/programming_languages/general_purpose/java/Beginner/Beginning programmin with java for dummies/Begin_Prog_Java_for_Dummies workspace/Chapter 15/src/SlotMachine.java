import static java.lang.System.out;

enum Symbol {
	lemon,
	orange,
	cherry,
	rutabaga
}

public class SlotMachine {

	public static void main(String[] args) {

		for (Symbol leftReel : Symbol.values()) {
			for (Symbol middleReel : Symbol.values()) {
				for (Symbol rightReel : Symbol.values()) {
					System.out.print(leftReel);
					out.print(" ");
					out.print(middleReel);
					out.print(" ");
					out.println(rightReel);
				}
			}
		}

	}

}
