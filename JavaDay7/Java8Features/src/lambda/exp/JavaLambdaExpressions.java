package lambda.exp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaLambdaExpressions {

	public static void main(String[] args) {

		Consumer<Integer> consumer = (Integer x) -> {
			System.out.println(x);
		};

		consumer.accept(55);

		Supplier<Integer> supplier = () -> {
			return 99;
		};

		System.out.println(supplier.get());

		Predicate<String> predicate = (String name) -> {
			return name.length() > 4;
		};

		System.out.println(predicate.test("Raj"));

		Function<String, Integer> function = (String name) -> {
			return name.length();
		};
		
				System.out.println(function.apply("King Khan"));
		
		
		

	}

}
