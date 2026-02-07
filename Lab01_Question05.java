class Calculator {
	int add(int a, int b) {
		return a + b;
	}
	
	int multiply(int a, int b) {
		return a * b;
	}
	
	int square(int a) {
		return a * a;
	}
}

public class Lab01_Question05 {
	public static void main(String[]args) {
		Calculator calc = new Calculator();
		
		int result1, result2;
		
		result1 = calc.square(calc.add(calc.multiply(3, 4), calc.multiply(5, 7)));
		System.out.println("Result of (3 * 4 + 5 * 7)^2 expression is: "+result1);
		
		result2  = calc.add(calc.square(calc.add(4, 7)), calc.square(calc.add(8, 3)));
		System.out.print("Result of (4 + 7)^2 + (8 + 3)^2 expression is: "+result2);
	}
}