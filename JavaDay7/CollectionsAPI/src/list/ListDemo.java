package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	
	public static void m1(Object o) {
		
		
	}
	
	

	public static void main(String[] args) {

			
		

		List<Object> list =	new ArrayList<Object>(); // new Vector<Object>();
		
				list.add(new Integer(30));
				list.add(new String("hello"));
				list.add(new ListDemo());
				list.add(new Double(4.5));
				
				System.out.println(list);
			
				
		List<Integer>  list2 = new LinkedList<Integer>();	
		
				list2.add(40);// new Integer(40)
				list2.add(20);
				list2.add(15);
				list2.add(90);
				list2.add(80);
				list2.add(20);
				list2.add(null);
				
				System.out.println(list2);
				
				
				System.out.println("for each");
				
				for (Integer i : list2) {
					
					System.out.println(i);
					
				}
				
				
				System.out.println("Iterator ");
				
				
		Iterator<Integer>   it =			list2.iterator(); // abstraction 
		
					while(it.hasNext()) {
						
				Integer  x =	   it.next();
						
						System.out.println(x);
						
					}
		
					
					System.out.println("List Iterator");
		
		ListIterator<Object>  lit =			  list.listIterator();
		
		
				while(lit.hasNext()) {
					
					
					Object o =  lit.next();
					
					System.out.println(o);
					
				}
				
				
				while(lit.hasPrevious()) {
					
					
					System.out.println(lit.previous());
					
					
				}
				
				
					
					
		
	}

}
