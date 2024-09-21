package arrays;

public class SingleDimensionalArraysExample {
	public static void main(String[] args) {
		// array declaration
		int[] faruqScores;

		// declaring array length
		faruqScores = new int[5];

		// initializing array
		faruqScores[0] = 100;
		faruqScores[1] = 92;
		faruqScores[2] = 72;
		faruqScores[3] = 65;
		faruqScores[4] = 79;

		for (int i = 0; i < faruqScores.length; i++) {
			System.out.print(faruqScores[i] + ",");
		}
		System.out.println();

		int[] musabScores = new int[] { 82, 80, 79, 83, 100 };

		for (int mark : musabScores) {
			System.out.print(mark + ",");
		}
	}
}