package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {

		
	List<String> list =	Arrays.asList("king","satish kumar","abinav sharma","imran hussain","javeed");
	
	
				Stream<String>  stream =		list.stream();
				
					
			List list2 =		stream.map( (String name)->{System.out.println(name); return name.length();})
								.filter((Integer n)->{ return n > 6 ;} )
								//.forEach((Integer x)->{ System.out.println(x); });
								//.forEach(System.out::println);
								
								.collect(Collectors.toList());
			
			
				System.out.println(list2);
		
		
	}

}
