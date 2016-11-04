package com.team.getName.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.team.getName.shapes.Point;

public class PointTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testDistanceTo(){
		Point uno = new Point(1,1);
		Point dos = new Point(5,5);
		
		double expected = Math.sqrt(32);
		double actual = uno.distanceTo(dos);
		
		assertEquals("distance to method test",expected,actual,0.2);
		
	}
	@Test
	public void testPosX(){
		Point test = new Point(2,2);
		
		double expected = 2;
		double actual = test.getXpos();
		assertEquals("Does the constructor work for x?",expected,actual, 0.1);
	
	}
	
	@Test
	public void testPosY(){
		Point test = new Point(2,2);
		
		double expected = 2;
		double actual = test.getYpos();
		assertEquals("Does the constructor work for y?",expected,actual, 0.1);
	}
	
	
	
}
