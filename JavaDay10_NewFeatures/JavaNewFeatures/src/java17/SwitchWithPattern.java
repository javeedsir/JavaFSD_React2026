package java17;

public class SwitchWithPattern {

	public static void main(String[] args) {

		
				System.out.println(formatter(null)); // new Integer(50);
	

		
		
	}
	
	static String formatter(Object obj) {
	    return switch (obj) {
	        case Integer i -> "int: " + i;
	        case String s -> "string: " + s;
	        case null -> "null";
	        default -> "unknown";
	    };
	}

}
