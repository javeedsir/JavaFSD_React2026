package com.wipro;

import java.time.LocalTime;

public class TimeDemo {

	public static void main(String[] args) {

		LocalTime time =	LocalTime.now();
		
			System.out.println(time.getHour());
			System.out.println(time.getMinute());
			System.out.println(time.getSecond());
			
			
		
		
	}

}
