package Assessment;

public class ArrayAssessment {

	public static void main(String[] args) {

		/*
		 * Array: A set of variables referenced by using a single variable name
		 * combined with a index number. All elements in an array must be of
		 * same type.
		 */

		// int array :

		// Age of Trainee's

		int age[] = new int[5];

		age[0] = 20;
		age[1] = 22;
		age[2] = 25;
		age[3] = 19;
		age[4] = 23;

		System.out.println("Mahesh- " + age[2]);
		System.out.println("Sachin- " + age[4]);

		// printing age of all the trainee's

		for (int all = 0; all < age.length; all++) {
			System.out.println(age[all]);
		}

		// double array :

		// height of Trainees

		double height[] = new double[3];

		height[0] = 170.2;
		height[1] = 165.5;
		height[2] = 172.8;

		System.out.println("Preeti " + height[0]);
		System.out.println("Divya " + height[1]);

		// boolean array :

		boolean statement[] = new boolean[3];

		statement[0] = true;
		statement[1] = false;

		System.out.println("Got the output: " + statement[0]);

		// char array

		char sym[] = new char[2];

		sym[0] = '$';
		sym[1] = '#';

		System.out.println(sym[0]);

		// String array

		String name[] = new String[3];

		name[0] = "Hello";
		name[1] = "Yogesh";
		name[2] = "Sir";

		for (int gesture = 0; gesture < name.length; gesture++) {
			System.out.println(name[gesture]);

			// In array all elements must be of same type. Thus Object array is
			// used in this case.

			// Object array

			Object sent[] = new Object[4];

			sent[0] = "height of Sachin";
			sent[1] = '=';
			sent[2] = 171.8;
			sent[3] = true;

			for (int full = 0; full < 4; full++) {
				System.out.println(sent[full]);

			}
			
			// In array size is fixed. Thus dynamic array/Collections are used such as Arraylist, Hashtable.  

		}

	}

}
