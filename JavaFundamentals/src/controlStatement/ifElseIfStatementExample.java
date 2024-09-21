package controlStatement;

public class ifElseIfStatementExample {
	public static void main(String[] args) {
		float sellingPrice = 1200, costPrice = 1500;

		if (sellingPrice > costPrice) {
			System.out.println("Profit");
		} else if (costPrice > sellingPrice) {
			System.out.println("Loss");
		} else {
			System.out.println("No profit nor loss");
		}

		// if else ladder
		if (sellingPrice > costPrice) {
			System.out.println("Profit");
		} else {
			if (costPrice > sellingPrice) {
				System.out.println("Loss");
			} else {
				System.out.println("No profit nor loss");
			}
		}
	}
}