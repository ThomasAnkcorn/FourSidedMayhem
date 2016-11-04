package com.team.getName.shapes;

public class Parallelogram extends Trapezium {

	public Parallelogram(Point p1, Point p2, Point p3, Point p4) {

		super(p1, p2, p3, p4);

	}

	public static boolean isParallelogram(Quadrilateral quad) {

		if (quad.getL1().getLength() == quad.getL3().getLength() && quad.getL1().getSlope() == quad.getL3().getSlope()
				&& quad.getL1().getSlope() > 0 && quad.getL3().getSlope() > 0) {
			if (quad.getL2().getLength() == quad.getL4().getLength()
					&& quad.getL2().getSlope() == quad.getL4().getSlope()) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	}

	public double getArea() {

		double height = getP2().getXpos() - getP1().getXpos();
		System.out.println(height);
		double length = getL2().getLength();
		System.out.println(length);
		return height * length;
	}
}