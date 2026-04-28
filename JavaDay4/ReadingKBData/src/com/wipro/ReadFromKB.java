package com.wipro;

import java.util.Scanner;

public class ReadFromKB {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter your name");
		
		String name = scanner.nextLine();  // "javeed"
		
		System.out.println("Enter Bill Amount");
		
			int amount =		scanner.nextInt();  // "5000"  --> 5000 
			
			scanner.nextLine();
			
		System.out.println("Enter City Name");	
		
			String city = scanner.nextLine();
			
			
			System.out.println("Hello  "+name +" you paid "+ amount +" welcome to "+city);
		


			
			
			
			
	}

}
