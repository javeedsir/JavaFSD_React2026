package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

			
		
		List<String>  list = new ArrayList<String>();
		
		
				list.add("Brown");
				list.add("Tom");
				list.add("Adam");
				list.add("Carry");
				list.add("Ford");
				
				System.out.println(list);
				
				
				
				Collections.sort(list);
				
				
				System.out.println(list);
				
				
		int  index =		Collections.binarySearch(list, "Brown");
				
				
			System.out.println("Element found at : "+ index);
			
				
					Collections.reverse(list);
					
					System.out.println(list);
			
			
			
			Object[]   ar = 	 list.toArray();
			
					for (Object o : ar) {
						
						
						System.out.println(o.toString());
						
					}
			
					
					
					
					int  arr[] =  {4,8,2,1,7,3};
					
						
						Arrays.sort(arr);
					
					
					for (int i : arr) {
						
						System.out.println(i);
						
					}
					
					
			int ind =		Arrays.binarySearch(arr, 7);
			
				System.out.println("Element in array found at : "+ind);
					
					
					
					
					
					
					
					
			
			
		
		
	}

}
