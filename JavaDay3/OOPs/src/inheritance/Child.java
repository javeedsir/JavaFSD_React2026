package inheritance;

public class Child extends Parent {

	int cid;

	public Child() {

		super(); // Parent();

		System.out.println("Child() is called... child object creted");

	}
	
	@Override
	public  Parent  m1() {
		
		
		System.out.println("m1() from Child class");
		
		return null;
		
	}
	

	public void m2() {

		System.out.println("m2() from Child class");

	}

	 @Override
	public String toString() {
		return "Child toString()";
	}
	
	
}
