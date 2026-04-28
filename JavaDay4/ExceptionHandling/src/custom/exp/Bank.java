package custom.exp;

public class Bank {

	public static void main(String[] args) {


			int accounts[] = {1001 , 1002, 11003 ,1004 , 1005};
			String names[] = {"king","ford" , "smith" , "tom", "scott"};
			double balance[] = {70000 , 2000000 , 60000 , 45 , 35000};
			
			System.out.println("AcNo   Name   Balance");
			
			for (int i = 0; i < accounts.length; i++) {
				
				System.out.println(accounts[i] +"   "+ names[i]+ " "+ balance[i]);
				
				if(balance[i] < 1000) {
					
					try {
					throw new LowBalanceExpception();
					}
					catch (LowBalanceExpception e) {
							
							System.err.println("Sorry! "+names[i]+ " your balance is low" + balance[i]+" please deposit some amount");

					}
					
				}
				
				
			}
		
		
		
	}

}
