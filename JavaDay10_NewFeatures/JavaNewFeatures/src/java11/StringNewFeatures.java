package java11;

import java.util.stream.Stream;

public class StringNewFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = " ";
		
			System.out.println(str.isBlank());
		
			
			String text = "Java\nPython\nC++";

	        Stream<String> lines = text.lines();
	        lines.forEach(System.out::println);

			
	        String str1 = "  Hello  ";

	        System.out.println(str1.strip());         // "Hello"

	        
	        System.out.println(str1.stripLeading());  // "Hello  "
	        System.out.println(str1.stripTrailing()); // "  Hello"

			
	        System.out.println("Javeed".repeat(4));

	}

}
