package java9;

import java.util.List;
import java.util.stream.Stream;

public class TakeWhile_DropWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        List<Integer> list = List.of(1, 2, 3, 4, 1, 2);

		
	 list.stream() .takeWhile(n -> n < 4) .forEach(System.out::println); // 1, 2, 3
		 
        list.stream()
        .dropWhile(n -> n < 4)
        .forEach(System.out::println); // 4, 1, 2

        
        Stream.ofNullable(null)
        .forEach(System.out::println); // nothing printed

		

	}

}
