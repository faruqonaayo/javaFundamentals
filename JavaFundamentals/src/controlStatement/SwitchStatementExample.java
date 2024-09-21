package controlStatement;

import java.util.Scanner;

public class SwitchStatementExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1-->	admin \n2-->	subadmin \n3-->	testprep \n4-->	user");
		System.out.println("What kind of user are you?");

		int userOption = scanner.nextInt();

		switch (userOption) {
		case 1:
			System.out.println("Get full access");
			break;
		case 2:
			System.out.println("Get access to create and delete courses");
			break;
		case 3:
			System.out.println("Get access to create and delete tests");
			break;
		case 4:
			System.out.println("Get access to consume course");
			break;
		default:
			System.out.println("You have no access");
			break;
		}
	}
}