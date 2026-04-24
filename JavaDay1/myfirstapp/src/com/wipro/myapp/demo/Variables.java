package com.wipro.myapp.demo;

public class Variables {
	
	
			public static void main(String[] args) {
				
				
					byte b = (byte) 129; // 8-bits  (0 to 7)  or -2pow7  to  2pow7  -1
								// -127  to 128	
				
					System.out.println(b);
					
					
					int  x =   b;  // (int) b; implicit type casting
					
					int z = 120;
					
					byte  b1 = (byte) z; // needs explicit type casting
					
					System.out.println(x);
					
					System.out.println(b1);
					
					
					float  f = 4.555f;
					
					double  d = 999993.9999999999999999;
					
					float f1 = (float)  d;
					
					System.out.println(f1);
					
					
					long l = 9999999999999L;
					int  y =(int) l;
					
					float f2 = l;
					
					System.out.println(f2);
					
					
					
					Integer  i = y; // new Integer(y); or auto boxing
					
					int k = i;   // unboxing
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
			}

}
