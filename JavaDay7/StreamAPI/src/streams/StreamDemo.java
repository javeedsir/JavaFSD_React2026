package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		Stream<Integer>  stream =		Stream.of(2,4,6,8);
		
		
			Consumer<Integer>  consumer = (Integer x)->{  System.out.println(x); };
		
				stream.forEach(consumer);
				
		//stream.forEach((Integer z) -> {  System.out.println(z);});
				
				
						Integer ar[] = {11,22,33,44,55,66};
						
							
				Stream<Integer> stream2 =		Arrays.stream(ar);
				
					//	stream2.forEach(consumer);
				
				
				Predicate<Integer>  predicate = (Integer n)->{  return n > 30;};
				
			//Stream<Integer> stream3 =	stream2.filter(predicate);
				stream2.filter(predicate).forEach(consumer);
				
				
				//stream3.forEach(consumer);
				
				
						
						
				
		
		
	}

}
