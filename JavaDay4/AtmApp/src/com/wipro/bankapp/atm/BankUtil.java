package com.wipro.bankapp.atm;

public class BankUtil { // Factory class
	
	
		public static   IBank   getBankObj(){  // Factory method
			
			
				return new BankImp2();
			
		}

}
