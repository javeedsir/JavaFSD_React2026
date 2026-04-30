package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HSDemo {

	public static void main(String[] args) {


		
		//Set<Integer>  set =		new HashSet<Integer>();
		
		Set<Integer>  set =		new LinkedHashSet<Integer>();
		
		
				set.add(25);
				System.out.println(set.add(12));
				set.add(67);
				set.add(90);
				set.add(45);
				System.out.println(set.add(12));
				
				
				System.out.println(set);
				
				
		Iterator<Integer>  it =		set.iterator();
		
					while (it.hasNext()) {
						
						Integer in =  it.next();
						
						System.out.println(in);
						
					}
					
					
					
					
					
		
		
		
		
		
		
		
		
				
				
				
		
	}

}
