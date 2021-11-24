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
		
		height[0]= 170.2;
		height[1]= 165.5;
		height[2]= 172.8;
		
		System.out.println("Preeti "+height[0]);
		System.out.println("Divya "+height[1]);

				
		//boolean array :
		
		boolean statement[]= new boolean[3];
		
		statement[0]= true;
		statement[1]= false;
		
		System.out.println("Got the output: "+statement[0]);
		
				

	}

}
