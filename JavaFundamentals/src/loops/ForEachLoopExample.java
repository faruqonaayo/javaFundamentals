package loops;

public class ForEachLoopExample {
	public static void main(String[] args) {
		String[] students = { "Josh", "Faruq", "Adeel" };

		for (String student : students) {
			System.out.println(student);
		}
	}
}