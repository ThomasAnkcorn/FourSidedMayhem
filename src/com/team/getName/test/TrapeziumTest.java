package com.team.getName.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.team.getName.shapes.Point;
import com.team.getName.shapes.Trapezium;

public class TrapeziumTest {

	@Test
	public void getAreaTest() {
		Trapezium t = new Trapezium(new Point(0,0), new Point(10,0), new Point(8,5), new Point(3.3, 5));
		
		double expected = 36.75;
		double actual = t.getArea();
		
		assertEquals(expected, actual, 0.01);
		
	}
	
	@Test
	public void isTrapeziumTest() {
		Trapezium t = new Trapezium(new Point(0,0), new Point(10,0), new Point(8,5), new Point(3.3, 5));
		
		boolean expected = true;
		boolean actual = t.isTrapezium(t);
		
		assertTrue(actual);
	}

}
