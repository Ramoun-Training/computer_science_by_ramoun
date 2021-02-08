package derek;

public class adding {
	public static void main(String[] args) {
		adding add = new adding();
		int a [] = { 1, 23, 334, 40, 58, 60, 75, 8, 94, 10};
		add.biSearch(a,40);
	}
	
	public int biSearch(int[] arr, int wanted) {
		if (wanted == wanted) {
			return arr.length / 2;
		} else {
			int arrCopy[] = new int[10];
			for (int i = 0; i < arr.length/2; i++) {
				arrCopy[i] = arr[i]; 
			}
			return biSearch(arrCopy,wanted);
		}
	}
}
