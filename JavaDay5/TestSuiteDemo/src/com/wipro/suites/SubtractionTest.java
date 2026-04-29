package com.wipro.suites;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("Production")
public class SubtractionTest {
	
			@Tag("t1")
			@Test
			public void testSub() {
				
				
				Calculator cal = new Calculator();
				
			int actual =	cal.sub(10, 5) ;
				
			assertTrue( actual > 0);
				
			}
	
			
			@Tag("t2")
			@Test
			public void testSub2() {
				
				
				Calculator cal = new Calculator();
				
			int actual =	cal.sub(100, 50) ;
				
			assertTrue( actual > 0);
				
			}
	

}
