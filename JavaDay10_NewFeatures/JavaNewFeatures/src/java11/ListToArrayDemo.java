package java11;

import java.util.List;

public class ListToArrayDemo {

	public static void main(String[] args) {


        List<String> list = List.of("Java", "Python", "SQL");

        String[] arr = list.toArray(String[]::new);

        for (String s : arr) {
            System.out.println(s);
        }

		
		
		
	}

}
