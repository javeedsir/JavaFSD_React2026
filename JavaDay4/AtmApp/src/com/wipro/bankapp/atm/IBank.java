package com.wipro.bankapp.atm;

/*
 * @Author: Javeed  TL
 * Desp:  IBank is a interface or specification
 * Date: 27-04-2026
 */


public interface IBank {
	
	public static final	String  IFSC = "HDCF1234";
	
		public abstract  void deposit();
		
		public abstract	void withdraw();
	
	
		public static void  m1() {  // any body can call who access IBank interface
			
			System.out.println("m1() from IBank");
		}
	
		public default  void m2() {
			
			System.out.println("m2() from IBank");
		}
		
		
		

}
