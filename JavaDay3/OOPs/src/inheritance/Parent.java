package inheritance;

 public class Parent extends Object {

 private	int pid;

	public  Parent() {

		super(); // Object()

		System.out.println("Parent() called... parent object created");

	}

 	 Object m1() {

		System.out.println("m1() from Parent class..");
		
		return null;
		
	}
	
	
	@Override
	public String toString() {
		
		return "Parent toString()";
	}
	
	

}
