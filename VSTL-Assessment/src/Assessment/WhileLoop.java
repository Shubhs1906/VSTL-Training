package Assessment;

public class WhileLoop {

	public void exeNames() {

		String strName[] = { "Shubham", "Mahesh", "Sachin", "Preeti", "Divya" };
		int intName = 0;

		// names using while loop

		while (intName < 5) {

			System.out.println(strName[intName]);
			intName++;
		}

		System.out.println("********");

		int intLoop = 4;
		while (intLoop > -1) {

			System.out.println(strName[intLoop]);
			intLoop--;
		}

	}

}
