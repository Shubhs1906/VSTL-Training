package Collections;

import java.util.ArrayList;

public class TestListEx {

	public static void main(String[] args) {

		ListExamples objListExamples = new ListExamples();
		ArrayList<String> list = objListExamples.carDetailsList();

		for (String carDetailsList : list) {
			if (carDetailsList.contains("AT")) {
				System.out.println("Present");
				break;
			} else
				System.out.println("Absent");

		}

	}

}
