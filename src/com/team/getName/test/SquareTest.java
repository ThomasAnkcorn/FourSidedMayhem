package com.team.getName.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.team.getName.exception.ShapeException;
import com.team.getName.shapes.Point;
import com.team.getName.shapes.Quadrilateral;
import com.team.getName.shapes.Square;

public class SquareTest {

	@Test
	public void isSquareTest() {
		
		Point p1 = new Point(10,10);
		Point p2 = new Point(10,10);
		Point p3 = new Point(10,10);
		Point p4 = new Point(10,10);
		
		Square quad = new Square(p1, p2, p3, p4);
		
		boolean expected = true;
		boolean actual = false;
		
		try {
			actual =  Square.isSquare(quad);
		} catch (ShapeException e) {
			e.printStackTrace();
		}
		
		assertEquals("", expected, actual);
		
		
		
	}

}
