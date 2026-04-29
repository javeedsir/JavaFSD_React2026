package imports;

import java.lang.*; // not recommend

import java.lang.Thread;
import java.lang.System;

import static  java.lang.System.*;
import static  java.lang.System.gc;


public class Demo {

	public static void main(String[] args) {

		
		Thread t = new Thread();
		
		java.lang.String str = new java.lang.String("hello");
		
		System.out.println(t);
		System.out.println(str);
		
		
		out.println("welcome");
		out.println("thank you");
		
		gc();
		
		err.println("Some Error");
		
	}

}
