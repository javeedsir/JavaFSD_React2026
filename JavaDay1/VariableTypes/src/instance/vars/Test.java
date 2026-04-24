package instance.vars;

public class Test {

	public static void main(String[] args) {

			Employee e1 = new Employee(101, "King", 50000.0);
		
			
				e1.setEname("King Khan");
				
				System.out.println(e1.getEid()  +"  "+e1.getEname());
		

				//Employee e2 = new Employee(0,"javeed",0.0);
				
				Employee e2 = new Employee();
				
						e2.setEname("javeed");
				
			
						System.out.println(e2.getEid()  +"  "+e2.getEname() +" "+e2.getSalary());
				
				
			//	System.out.println(Employee.eid +" "+Employee.ename);
				
				
				
	}

}
