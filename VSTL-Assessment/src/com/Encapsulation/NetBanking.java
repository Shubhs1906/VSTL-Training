package com.Encapsulation;

public class NetBanking extends Bank {
	
	


	
	public void checkAccountBalance (String strLoginId, int intPin){
		

		if(strLoginId == this.getStrLoginId_1() && intPin == this.getIntPin_2() )
			System.out.println(" Your account balance is : "+ this.getStrBalance());
		else System.out.println(" Invalid Id or Pin. Please enter valid Id & Pin");
		
	}

}
