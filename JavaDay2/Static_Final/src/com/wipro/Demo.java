package com.wipro;

public final class Demo {
	
	final int X =99 ;
	
	
	public Demo() {
		
		System.out.println("Demo() is called..");
	}
	

	public static void main(String[] args) {

		
		 

		System.out.println("Hello from main()");
		
		Demo d = new Demo();
		

	}
	
	 static {
		
		
		 	System.out.println("Hello from static block");
		 
	}
	 
	 {
		
		 System.out.println("instance block executed..");
		 
		 
	 }

}
