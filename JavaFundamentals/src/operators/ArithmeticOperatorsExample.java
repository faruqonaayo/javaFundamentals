package operators;


public class ArithmeticOperatorsExample {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		
		System.out.println("Addition " + (num1 + num2));
		System.out.println("Subtraction " + (num1 - num2));
		System.out.println("Multiplication " + (num1 * num2));
		System.out.println("Division " + (num1 / num2));
		System.out.println("Remainder " + (num1 % num2));
		
		System.out.println("Post Increment " + (num1++));
		System.out.println("Pre Increment " + (++num1));
		
		System.out.println("Post Decrement " + (num1--));
		System.out.println("Pre Decrement " + (--num1));
	} 
}