package javaExceptionHandling;

public class ExceptionHandling {

	public int division(int number_1, int number_2) {
		int intOutput = 0;
		try {
			intOutput = number_1 / number_2;
			System.out.println("Result: " + intOutput);
			return intOutput;

		} catch (ArithmeticException ArithmeticException) {
			System.out.println("I got exception : " + ArithmeticException.getMessage());
			System.out.println("ArithmeticExceptionHandled");
			return intOutput;
		}

	}

	public void arrayExample() {
		try {
			int a[] = new int[10];
			a[11] = 9;
		} catch (ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException) {
			System.out
					.println("I got arrayIndexOutOfBounds Exception : " + ArrayIndexOutOfBoundsException.getMessage());

		}
	}

}
