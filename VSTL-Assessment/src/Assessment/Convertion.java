package Assessment;

public class Convertion {

	static Calculator objCalculator = new Calculator();

	static int intReturnVal;

	public static void main(String[] args) {

		// String to int

		String strNumber = "20";
		int intNumber = Integer.parseInt(strNumber);
		intReturnVal = objCalculator.doAddition(intNumber, 50);
		System.out.println("Final Total : " + intReturnVal * 5);

		// int to long

		int number = 15;
		long number2 = number;
		System.out.println(number2);

		// long to int

		long num = 1234;
		int num1 = (int) num;
		System.out.println(num1);

		// int to double

		int age = 22;
		double age1 = age;
		System.out.println(age1);

		// double to int

		double dblValue = 10.8;
		int intAge = (int) dblValue;
		System.out.println(intAge);

		// char to int
		
		char C = '2';
		int intAge1 = Character.getNumericValue(C);
		System.out.println(intAge1);
		
		
		

	}

}
