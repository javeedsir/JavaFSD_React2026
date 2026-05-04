package map;

import java.util.Map;
import java.util.TreeMap;

import set.Employee;
import set.MyComparator;

public class EmpTreeMap {

	public static void main(String[] args) {

		Map<Employee, String> map = new TreeMap<Employee, String>(new MyComparator());

		Employee e1 = new Employee(101, "king", 50000);
		Employee e2 = new Employee(102, "tom", 25000);
		Employee e3 = new Employee(103, "ford", 15000);
		Employee e4 = new Employee(104, "smith", 60000);
		Employee e5 = new Employee(105, "javeed", 35000);

		
		map.put(e2, "Mumbai");

		map.put(e3, "Chennai");

		map.put(e4, "Banglore");
		
		
		map.put(e1, "Hyderabad");

		map.put(e5, "Delhi");
		
		
			System.out.println(map);

	}

}
