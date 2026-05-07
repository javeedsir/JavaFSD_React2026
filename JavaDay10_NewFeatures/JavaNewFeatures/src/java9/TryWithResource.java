package java9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryWithResource {
	
	
	
	public static void main(String[] args) throws Exception {
		
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        try (br) {
            System.out.println(br.readLine());
        }

		
		
		
	}
	

}
