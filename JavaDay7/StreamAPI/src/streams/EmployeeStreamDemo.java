package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "king", 50000);
		Employee e2 = new Employee(102, "tom", 25000);
		Employee e3 = new Employee(103, "ford", 15000);
		Employee e4 = new Employee(104, "smith", 60000);
		Employee e5 = new Employee(105, "javeed", 15000);
		Employee e6 = new Employee(106, "satish", 19000);

		List<Employee> empList = Arrays.asList(e3,e4,e2,e1,e6,e5);
		


		Comparator<Employee> empComparator = (Employee emp1, Employee emp2) -> {

							return  -emp1.toString().compareTo(emp2.toString());
							};

							
							
		Collections.sort(empList, empComparator);
		
			
			empList.forEach(System.out::println);
			
			
	System.out.println("Predefined Comparator logics");		
	
	Comparator<Employee> empComparator2  =  Comparator.comparing( (Employee emp) -> emp.getSalary() )
														.thenComparing( (Employee emp) -> emp.getEname() );
	
	
			Collections.sort(empList , empComparator2);
			
			System.out.println(empList);
			
			
			 List<String> empNames = empList.stream().map(Employee::getEname).collect(Collectors.toList());
			  empNames.sort(Comparator.naturalOrder());
			  empNames.forEach(System.out::println);
						
			
			
			

	}

}
