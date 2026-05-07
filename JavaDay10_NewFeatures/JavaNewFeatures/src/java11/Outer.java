package java11;

public class Outer {
	
	

	    private static String msg = "Hello";

	static    class Inner {
	      static  void printMsg() {
	            System.out.println(msg); // Direct access allowed
	        }

	    }
	    
	    
	    public static void main(String[] args) {
			
	    		Outer.Inner.printMsg();
	    			
	    	
	    	
		}
	    
}
