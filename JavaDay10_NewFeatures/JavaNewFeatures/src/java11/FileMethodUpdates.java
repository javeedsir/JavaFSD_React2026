package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethodUpdates {

	public static void main(String[] args) throws IOException {


        String content = Files.readString(Path.of("test.txt"));
        System.out.println(content);

        Files.writeString(Path.of("output.txt"), "Hello Java 11");

	}

}
