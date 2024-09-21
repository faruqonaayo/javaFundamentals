package basics;
import java.util.Date;

public class VariablesAndDataTypesExample {
	public static  void main(String[] args) {
		// primitive data types
		byte age = 23;
		short height = 178;
		long viewsCount = 497_257_292;
		int accountNumber = 6914146;
		double accountBalance = 122_848.00; 
		float price = 234.56F;
		char gender = 'M';
		boolean invalid = false;
		
		
		
		System.out.println(age);
		System.out.println(viewsCount);
		System.out.println(price);
		System.out.println(gender);
		System.out.println(invalid);
		System.out.println(height);
		System.out.println(accountNumber);
		System.out.println(accountBalance);
		
		byte age2 = age;
		age = 12;
		System.out.println(age);
		System.out.println(age2);
		
		
		// non-primitive data types
		String name = "Faruq";
		System.out.println(name);
		Date now = new Date();
		System.out.println(now);
		

		

		
	}
}