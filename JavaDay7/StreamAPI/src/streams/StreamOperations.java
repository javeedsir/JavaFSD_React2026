package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOperations {
	
	static Optional<Integer> optional = null;

	public static void main(String[] args) {


		List<Integer>  list =		Arrays.asList();
		
		
				Stream<Integer>  stream1 =	list.stream();
				
				
		//stream1.filter((Integer n)->{ return n > 10;}).forEach(System.out::println);
		
		
			//stream1.distinct().forEach(System.out::println);		
				
				//stream1.limit(4).forEach(System.out::println);
				
				
			//	stream1.skip(5).forEach(System.out::println);
				
				
	 optional =		stream1.reduce((Integer a, Integer b)->{ return a+b;});
				
		
				if(optional.isPresent()) {
					
					
						System.out.println("Total "+optional.get());
					
				}
		
				else {
					
					
					System.out.println("Elements not found");
				}
				
				
				
			
				System.out.println(getTotal());
				
	}
	
	
	public static  Integer   getTotal() {
		
		
			return	optional.orElse(0);
		
	}
	
	

}
