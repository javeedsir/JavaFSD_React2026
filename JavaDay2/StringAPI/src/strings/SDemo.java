package strings;

public class SDemo  extends Object{
	
	
	public String  toString() {
		
		return "javeed@007";
		
	}

	public static void main(String[] args) {
		
		int x = 10;
		
		SDemo d1 = new SDemo();
		
		Object d2 = new SDemo();
		
		System.out.println(d1.equals(d2));
		
		System.out.println(d1);// d1.toString();
		
		
		d1.show();
		
		d1.show("king");
		
		

		String s1 = "hello";
		
		String s2 = "hello";
		
		
		System.out.println(s1 == s2);
		
		String s3 = new  String("hello");
		
		String s4 = new  String("HELLO");
		
		System.out.println(s3 == s4);
		
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		
		  s1 = s1.concat(" world");
		  
		  System.out.println(s1.toString());
		  
		  s3 = s3 + s4;
		  
		  System.out.println(s3); // s3.toString();
		  
		  
		  
		  String str = "a";
			 
			 str = str + "b";
			 
			 str = str.concat("c");
			 
			 
			 String   t1 = "A";
			 
			 String t2 = "B";
			 
			 
			 System.out.println(t1.compareTo(t2)); // 65 - 66  = -1
			 
			 System.out.println(t2.compareTo(t1));  // 66 - 65  = 1
			 
			 
			 
			 
		
		
	}
	
	
	
	public void  show() {
		
		
		System.out.println("this is show() without param");
		
		
	}
	
	public void  show(String name) {
		
		
		System.out.println("this is show() with name param");
		
		
	}
	
	
	
	
	
	
	

}
