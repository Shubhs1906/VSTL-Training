package Assessment;

public class DoWhile {

	public void exeNum() {

		// do while loop

		int intFor = 1;

		do {
			System.out.println(intFor);
			intFor++;
		} while (intFor < 9);

		System.out.println("********");

		String strFor[] = { "Hello", "Good Morning", "Great Day" };

		// do-while loop:

		int intStr = 0;

		do {
			System.out.println(strFor[intStr]);
			intStr++;
		} while (intStr < 3);

		System.out.println("********");

		// do-while loop: statement executes for at least one time either
		// condition satisfies or not.

		int intGreet = 2;

		do {
			System.out.println(strFor[intGreet]);
			intGreet--;
		} while (intGreet < -1);

		System.out.println("********");

	}

}
