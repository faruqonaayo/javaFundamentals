package Arrays;


public class StringManipulationExample {
	public static void main(String[] args) {
//		string literal
		String str1 = "Hello";
		System.out.println(str1);
		
//		string object
		String str2 = new String("World");
		System.out.println(str2);
		
//		concatenating string literal and string object
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		
		
		//string manipulation method
		System.out.println(str3.length());
		System.out.println(str3.charAt(0));
		System.out.println(str1.concat(" ").concat(str2));
		System.out.println(str3.substring(6, 11));
		System.out.println(str2.contains("o"));
		
		String str4 = "Hello;World";
		String[] strArray = str4.split(";");
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	} 
}