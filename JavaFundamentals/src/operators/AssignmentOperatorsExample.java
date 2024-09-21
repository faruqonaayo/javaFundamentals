package operators;


public class AssignmentOperatorsExample {
	public static void main(String[] args) {
		//assignment operator
		int num0; //declaring num0
		num0 = 4; //assigning value on the left (4) to right
		
		//arithmetic assignment operator
		//addition assignment operator
		int num1 = 5;
		int num2 = 8;
		num1 += num2; // num1 = num1 + num2
		System.out.println("num1 += num2 :" + num1);
		
		//subtraction assignment operator
		int num3 = 7;
		int num4 = 4;
		num3 -= num4; // num3 = num3 - num4
		System.out.println("num3 -= num4 :" + num3);
		
		//multiplication assignment operator
		int num5 = 2;
		int num6 = 6;
		num6 *= num5; // num6 = num6 * num5
		System.out.println("num6 *= num5 :" + num6);
		
		//division assignment operator
		int num7 = 3;
		int num8 = 9;
		num8 /= num7; // num8 = num8 / num7
		System.out.println("num8 /= num7 :" + num8);
		
		//remainder assignment operator
		int num9 = 6;
		int num10 = 5;
		num9 %= num10; // num9 = num9 % num10
		System.out.println("num9 %= num10 :" + num9);
	} 
}