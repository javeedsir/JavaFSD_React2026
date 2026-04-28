package inheritance;

public class Main {
	
 public	static	float  add(int a, float b) {
			
			return a+b;
			
		}
	
		
	
public	static	float  add( float y , int x) {
			
			return x+y;
			
		}
	
	
		public static void main(String[] args) {
			
			
			System.out.println(add(5,7L));
			
			
			
			Object o = new Object();
			
			System.out.println(o.toString());
			
			
			
			Parent p = new Parent();
			
			 p.m1();
			 
			 System.out.println(p.toString());
			
			
			Child c  = new Child();
			
			c.m2();
			
			System.out.println(c.toString());
			
			
			c.m1();
			
			
			Object obj = (Object)  new Child();  // Runtime polymorphism
			
			Parent p1  =  new Child();
			
			
			p1.toString();
			
		//	Child c1 = new Parent();
			
			 Child c1 = (Child)  obj ; 
			 
			 
			 String s = p1.toString();
			
			
			
		}
	
	

}
