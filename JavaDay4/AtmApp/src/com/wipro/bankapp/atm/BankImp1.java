package com.wipro.bankapp.atm;
/*
 * @Author: Satish   Developer
 * Desp:  BankImp1 implements deposit()
 * Date: 27-04-2026
 * 
 */


public abstract class BankImp1   implements IBank{

	@Override
	public void deposit() {

			// business logics
		System.out.println("Deposit successfully done..");
		
	}
	
	
	public  abstract void withdraw();
	

	
}
