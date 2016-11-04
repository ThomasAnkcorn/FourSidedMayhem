package com.team.getName.shapes;

public class Line {

	Point p1;
	Point p2;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public double getLength() {

		double length = p1.distanceTo(p2);
		return length;

	}

	public double getSlope() {

		double diffX = p1.getXpos() - p2.getXpos();
		double diffY = p1.getYpos() - p2.getYpos();

		if (p1.getXpos() == p2.getXpos()) {
			return Double.POSITIVE_INFINITY;
		} else {

			double slope = diffY / diffX;
			return slope;
		}

	}

}
