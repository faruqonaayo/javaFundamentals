package basics;


public class TypeCastingExample {
	public static void main(String[] args) {
		//
		int intValue = 5;
		
		//implicit type casting
		long longValue = intValue;
		double doubleValue = longValue;
		
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(doubleValue);
		
		double doubleValue2 = 100.65;
		
		//explicit casting
		final int intValue2 = (int) doubleValue2;
		 
		
		System.out.println(doubleValue2);
		System.out.println(intValue2);
	} 
}