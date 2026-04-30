package set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet {

	public static void main(String[] args) {

		Set<Employee> set = new HashSet<Employee>();
		
			//Set<Employee> set = new LinkedHashSet<Employee>();

		Employee e1 = new Employee(101,"king",50000);
		Employee e2 = new Employee(102,"tom",25000);
		Employee e3 = new Employee(103,"ford",15000);
		Employee e4 = new Employee(104,"smith",60000);
		Employee e5 = new Employee(105,"javeed",35000);
		Employee e6 = new Employee(105,"satish",19000);


		set.add(e1);
		
		set.add(e4);
		set.add(e5);
		set.add(e6);// duplicate
		
		set.add(e2);
		set.add(e3);

		System.out.println(set);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e5.equals(e6));
		System.out.println(e1.toString());

	}

}
