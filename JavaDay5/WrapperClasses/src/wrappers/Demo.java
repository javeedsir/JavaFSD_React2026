package wrappers;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		int ar[] = { 4, 6, 8, 2, 7 };

		System.out.println(ar);

		String str1 = "500";

		int num1 = Integer.parseInt(str1);

		String str2 = "300";

		double num2 = Double.parseDouble(str2);

		System.out.println(num1 + num2);
		
		
		int x = 10;
		
			Integer i = new Integer(x);
			
			System.out.println(i.toString());
			
			int z  =  i.intValue();
			
			System.out.println(z);
			
			
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			/*
			 * list.add(new Integer(22));
			 *  list.add(new String("hello")); 
			 *  list.add(new Double(4.55));
			 */
		
				list.add(30);  // list.add(new Integer(30));
				list.add(40);
				list.add(20);
 		
		
		

	}

}
