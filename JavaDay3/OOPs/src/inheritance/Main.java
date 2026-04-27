package inheritance;

public class Main {
	
	
		public static void main(String[] args) {
			
			Object o = new Object();
			
			System.out.println(o.toString());
			
			
			
			Parent p = new Parent();
			
			 p.m1();
			 
			 System.out.println(p.toString());
			
			
			Child c  = new Child();
			
			c.m2();
			
			System.out.println(c.toString());
			
			
			c.m1();
			
			
			Object obj =  new Child();
			
			Parent p1  =  new Child();
			
			
			
		}
	
	

}
