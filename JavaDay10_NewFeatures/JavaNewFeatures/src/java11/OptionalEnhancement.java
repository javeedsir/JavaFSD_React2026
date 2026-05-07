package java11;

import java.util.Optional;

public class OptionalEnhancement {

	public static void main(String[] args) {

        Optional<String> opt = Optional.ofNullable(null);

        opt.or(() -> Optional.of("Default"))
           .ifPresent(System.out::println);

		
		
	}

}
