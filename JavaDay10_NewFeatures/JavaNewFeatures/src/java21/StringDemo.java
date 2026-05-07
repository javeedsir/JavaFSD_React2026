package java21;

import static java.lang.StringTemplate.STR;

public class StringDemo {

	public static void main(String[] args) {

		
		
		String name = "Alice";
		int age = 25;

		// STR is a template processor
		String result = STR."Name: \{name}, Age: \{age}";
		System.out.println(result);

		
		
	}

}
