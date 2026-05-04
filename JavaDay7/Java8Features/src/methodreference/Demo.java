package methodreference;

import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {


			//Consumer<String>  consumer = (String x) -> { System.out.println(x);};
			
		
		Consumer<String>  consumer = System.out::println;
					consumer.accept("Javeed");
					
					
					String x = "5000";
					
					
			Function<String,Integer>  function =		Integer::parseInt; // method ref
			
							
						System.out.println(function.apply(x));
						
						
						
						
						
						StudentInterface si =  Student::new; // constructor ref
						
								si.setStudentData(101, "king");
								
								
						
				Consumer<String> cons =		StudentInterface::hello;
						
							cons.accept("king khan");
						
						
						
						
		
	}	

}
