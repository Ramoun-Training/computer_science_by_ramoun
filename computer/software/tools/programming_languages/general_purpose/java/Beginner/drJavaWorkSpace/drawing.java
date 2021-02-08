class Draw {

	public static void main(String[] args) {
		for (int y = 0; y < 7; y++) {
			for (int x = 0; x < 7; x++) {
				if ((x + y == 3 && y < 3) || (x + y == 7 && y < 7 && y > 1) || (y == x - 1  && x > 0 && x < )6) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
