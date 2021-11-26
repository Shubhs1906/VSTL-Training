package Assessment;

public class TestControlStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControlStatement objControlStatement = new ControlStatement();
		
		System.out.print("Raj - "); objControlStatement.resultPassOrFail(33);
		
		System.out.print("Aniket - "); objControlStatement.resultPassOrFail(40);
		
		System.out.print("Yash - "); objControlStatement.resultPassOrFail(65);
		
		System.out.print("Anirudha - "); objControlStatement.resultPassOrFail(90);
		
		
		// switch case\
		
		// Yash has  (strResult)  in the test.   passed/failed
		
		String strResult= "failed";
		
		switch(strResult){
		case "passed":
			System.out.println("True");
		break;
		
		case "failed":
			System.out.println("false");
		break;
		
		default:
			System.out.println("answer as passed or failed only");
		break;
		
		}
		
		// eligiblity by age 
		
		
		int ageCand;
		ageCand= 20;
		System.out.println(ageCand);
		if (ageCand <=18 ) System.out.println("candidate between 18-30 years of age are allowed ");
		
		else if (ageCand > 18 && ageCand < 30){
			System.out.println("you are eligible");
			System.out.println("Good Luck");
		}
		
		else if (ageCand >=30) System.out.println("candidate between 18-30 years of age are allowed ");
		
		
		

		
		

	}


}
