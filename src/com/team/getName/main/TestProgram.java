package com.team.getName.main;

import com.team.getName.shapes.Parallelogram;
import com.team.getName.shapes.Point;
import com.team.getName.shapes.Rectangle;
import com.team.getName.shapes.Square;
import com.team.getName.shapes.Trapezium;

public class TestProgram {

	public static void main(String[] args) {
		System.out.println("TRAPEZIUM");
		Trapezium t = new Trapezium(new Point(0, 0), new Point(10, 0), new Point(8, 5), new Point(3.3, 5));
		System.out.println(t);

		// Parallelogram
		System.out.println("PARALLELOGRAM");
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(1.0, 2.0);
		Point p3 = new Point(1.0, 5.0);
		Point p4 = new Point(0.0, 3.0);
		Parallelogram p = new Parallelogram(p1, p2, p3, p4);
		System.out.println(p);

		// Rectangle
		System.out.println("RECTANGLE");
		Point p5 = new Point(1, 1);
		Point p6 = new Point(3, 1);
		Point p7 = new Point(3, 3);
		Point p8 = new Point(1, 3);
		Rectangle rec = new Rectangle(p5, p6, p7, p8);
		System.out.println(rec);

		// Square
		System.out.println("SQUARE");
		Point p9 = new Point(5, 5);
		Point p10 = new Point(5, 10);
		Point p11 = new Point(10, 10);
		Point p12 = new Point(10, 5);

		Square quad = new Square(p9, p10, p11, p12);
		System.out.println(quad);

	}

}
