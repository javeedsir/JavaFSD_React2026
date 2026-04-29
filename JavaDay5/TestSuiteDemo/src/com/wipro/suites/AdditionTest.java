package com.wipro.suites;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Development")
public class AdditionTest {
	
		@Tag("t1")
		@Test
	    public void testAdd() {
	    	
	    	Calculator  cal = new Calculator();
	    	
	    int actual =	cal.add(4, 5);
	    
	    		assertEquals(9, actual);
	    	
	    }
	    
		@Tag("t2")
		@Test
	    public void testAdd2() {
	    	
	    	Calculator  cal = new Calculator();
	    	
	    int actual =	cal.add(14, 5);
	    
	    		assertEquals(19, actual);
	    	
	    }
	
	
	

}
