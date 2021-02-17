package recursiveFactorial;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * factorial Ex: 5! = 5x4x3x2x1 = 120
		 */
		System.out.println(factorial(5));
	}

	public static int factorial(int number) {

		if (number == 1) {			
			return 1;
		}else {
			return number * factorial(number -1);
		}
		
	}

}
