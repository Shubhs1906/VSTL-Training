package Assessment;


public class LocalAndGlobalVariables {


	// Global or Instance variables :

	String name = "Shubham";
	int age = 22;

	public static void main(String[] args) {

		// Local Variables :

		int i = 10;
		System.out.println(i);

		LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

	public void sum() {

		// Local Variables :

		int i = 10;
		int j = 20;

	}


}
