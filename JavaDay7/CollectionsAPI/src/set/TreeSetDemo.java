package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {


		Set<String>  set1 = new TreeSet<String>();
		
		
				set1.add("B");  
				set1.add("A"); //  "B".compareTo("A"); 66 - 65  = 1
				set1.add("D");
				set1.add("C");  // "D".compareTo("C");  68 - 67 =  1 
				
				System.out.println(set1);
				
				
				

				
				
				
				
		
		
	}

}
