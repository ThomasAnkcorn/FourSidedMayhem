package com.team.getName.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.team.getName.shapes.Parallelogram;
import com.team.getName.shapes.Point;

public class ParallelogramTest {

	@Test
	public void testArea() {

		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(1.0, 2.0);
		Point p3 = new Point(1.0, 5.0);
		Point p4 = new Point(0.0, 3.0);

		double expected = 3;

		Parallelogram p = new Parallelogram(p1, p2, p3, p4);
		double actual = p.getArea();

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testIsParallelogram() {
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(1.0, 2.0);
		Point p3 = new Point(1.0, 5.0);
		Point p4 = new Point(0.0, 3.0);

		boolean expected = true;

		Parallelogram p = new Parallelogram(p1, p2, p3, p4);
		boolean actual = Parallelogram.isParallelogram(p);

		assertEquals(expected, actual);
	}

	@Test
	public void testIsParallelogramFalse() {
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(0.0, 1.0);
		Point p3 = new Point(1.0, 1.0);
		Point p4 = new Point(0.0, 1.0);

		boolean expected = false;

		Parallelogram p = new Parallelogram(p1, p2, p3, p4);
		boolean actual = Parallelogram.isParallelogram(p);

		assertEquals(expected, actual);
	}

	@Test
	public void testIsParallelogramFalseChangePos() {
		Point p2 = new Point(0.0, 0.0);
		Point p3 = new Point(0.0, 1.0);
		Point p4 = new Point(1.0, 1.0);
		Point p1 = new Point(0.0, 1.0);

		boolean expected = false;

		Parallelogram p = new Parallelogram(p1, p2, p3, p4);
		boolean actual = Parallelogram.isParallelogram(p);

		assertEquals(expected, actual);
	}
}
