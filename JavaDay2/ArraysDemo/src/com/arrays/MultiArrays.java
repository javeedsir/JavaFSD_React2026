package com.arrays;

public class MultiArrays {

	public static void main(String[] args) {

		
			int ar[][] = new int[4][2];
		
				
			System.out.println(ar.length);
			
			System.out.println(ar);
			
			System.out.println(ar[0].length);
			
			System.out.println(ar[2]);
			
			System.out.println(ar[2][0]);
			
			int  ar2d[][] = {{6,7},{8,9},{10,11}};
			
			int arr[][] = new int[4][];
			
						arr[0] = new int[3] ;
						arr[1] = new int[4];
						arr[2] = new int[2];
						arr[3] = new int[3];
						
						
				for(int i=0; i < arr.length; i++) {
					
					for(int j=0; j<arr[i].length; j++) {
						
						
							System.out.println(arr[i][j]);
						
					}
					
					
				}		
						
			
			
			int  arrr[][][] = new int[3][][];
			
			
					arrr[0] = new int[2][4]; 
			
			
		
	}

}
