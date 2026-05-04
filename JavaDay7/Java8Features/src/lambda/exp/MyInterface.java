package lambda.exp;

@FunctionalInterface
public interface MyInterface {
	
	
			//public int add(int a, int b);// Function functional interface
			
			
			//public void setName(String name); // Consumer Functional Interface
	
	
		//	public int  getCount(); // Supplier Functional Interface
	
			public boolean  isValidName(String name);
			
			
			public static void m1() {
				
				System.out.println("m1() static method");
			}
			
			
			public default void m2() {
				
				
				System.out.println("default m2()");
			}
			
			
}
