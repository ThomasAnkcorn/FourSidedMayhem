package com.team.getName.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.team.getName.shapes.Point;
import com.team.getName.shapes.Rectangle;

public class RectangleTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIsRectangle(){
		Point p1 = new Point(1,1);
		Point p2 = new Point(3,1);
		Point p3 = new Point(3,3);
		Point p4 = new Point(1,3);
		Rectangle rec = new Rectangle(p1,p2,p3,p4);
		boolean expected = true;
		boolean actual = Rectangle.isRectangle(rec);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetArea(){
		Point p1 = new Point(1,1);
		Point p2 = new Point(3,1);
		Point p3 = new Point(3,3);
		Point p4 = new Point(1,3);
		Rectangle rec = new Rectangle(p1,p2,p3,p4);
		double expected = 4;
		double actual = rec.getArea();
		assertEquals("The area test",expected, actual,0.1);
	}
	
}
