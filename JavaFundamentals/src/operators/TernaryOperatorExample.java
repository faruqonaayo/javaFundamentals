package operators;


public class TernaryOperatorExample {
	public static void main(String[] args) {
		boolean isAuthenticated = true;
		
		if (isAuthenticated) {
			System.out.println("You are authenticated");
		} else {
			System.out.println("You are not authenticated");
		}
		
		String resultString = isAuthenticated ? "Authenticated" : "Not Authenticated";
		System.out.println(resultString);
	} 
}