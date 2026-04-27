package com.arrays;

public class ArrayDemo {

	public static void main(String[] args) {


		//	int  ar[]   =new int[] {5,10,15,20,25,30};
		
		int ar[] = new int[4];
		
				ar[0] = 99;
			
			System.out.println("array size "+ar.length);
			
		//	System.out.println(ar[4]);
			
			
			System.out.println(ar);
			
			
			for (int i = 0; i < ar.length; i++) {
				
				System.out.println(i +" "+ ar[i]);
				
			}
			
			System.out.println("For Each Loop");
			
		
				for(int x:ar) {
					
					System.out.println(x);
				}
		

	}

}
