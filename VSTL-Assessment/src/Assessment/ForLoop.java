package Assessment;

public class ForLoop {

	public void exeAge() {

		// for loop using post increment

		int intAge[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int intAll = 0; intAll < 8; intAll++) {

			System.out.println(intAge[intAll]);
		}

		System.out.println("********");

		// for loop using post decrement

		int intWeight[] = { 61, 65, 70, 75, 80 };

		for (int intAll = 4; intAll > -1; intAll--) {

			System.out.println(intWeight[intAll]);
		}
		System.out.println("********");

	}

}
