package loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input;
		do {
			System.out.println("Enter a message");
			input = scanner.nextLine().toLowerCase();
			System.out.println(input);
		} while (!input.equals("quit"));

		System.out.println("Program terminated");
	}
}