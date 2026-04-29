package com.wipro.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Testing")
class CalculatorTest {

	static Calculator c;

	@BeforeAll
	public static void beforeAll() {

		c = new Calculator();

			System.out.println("BeforeAll");
		
	}
	
	
	@AfterAll
	public static  void afterAll() {
		
		// post construction
		
		System.out.println("AfterAll");
		
	}
	
	@BeforeEach
	public void m1() {
		
		System.out.println("BeforeEach executed");
		
	}
	
	@AfterEach
	public void m2() {
		
		System.out.println("AfterEach executed");
	}
	

	
	@DisplayName("AddTest")
	@RepeatedTest(2)
	void testAdd() {

		int actual = c.add(4, 5);

		assertEquals(9, actual);

		assertTrue(actual > 0);
		
		
		System.out.println("testAdd() tested");

	}

	@Test
	void testSub() {

		int actual = c.sub(5, 3);

		assertEquals(2, actual);

		assertNotEquals(7, actual);
		
		System.out.println("testSub() tested");
		

	}

	@Test
	@Disabled
	void testMul() {

			System.out.println("testMul() tested");
		
	}

	@Test
	@Disabled
	void testDiv() {
		
		System.out.println("testDiv() tested");

	}
	
	
	

@ParameterizedTest
@ValueSource(strings = { "javeed", "narayana", "pushpalatha", "himanshu", "tommy" })
	void test(String name) {

		System.out.println(name + "name tested");
		assertTrue(name.length() > 5);

	}

	
	
	
	
	
	
	
	

}
