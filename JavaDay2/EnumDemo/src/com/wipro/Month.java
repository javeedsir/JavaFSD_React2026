package com.wipro;

public enum Month {
	
	
	
	JAN(31), FEB(28) , MAR(31) , APR(30) , MAY(31) , OCT(31) , NOV(30) , DEC(31);
		
		int days;
		
		private Month(int days) {
			
			this.days = days;
			
		}	
		
	
}
