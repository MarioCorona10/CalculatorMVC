package com.mario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mario.service.Service;

class OperationsTest {

	@Test
	void testDivideService() {
		
		Service div1 = new Service();
		float result = div1.divide(12, 3);
		assertEquals(4, result);
	}
	
	@Test
	void testAddService() {
		
		Service add1 = new Service();
		float result = add1.add(2, 5);
		assertEquals(7, result);
	}
	
	@Test
	void testMultiplyService() {
		
		Service multi1 = new Service();
		float result = multi1.multiply(8, 3);
		assertNotEquals(20, result);
	}
	
	@Test
	void testSubstractService() {
		
		Service sub1 = new Service();
		float result = sub1.divide(20, 15);
		assertNotEquals(4, result);
	}

}
