package java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectinsFactoryMethods {

	public static void main(String[] args) {


        List<String> list = List.of("A", "B", "C");
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "One", 2, "Two");

        System.out.println(list);
        
        System.out.println(map);

		
		
	}

}
