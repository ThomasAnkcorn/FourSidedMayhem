package com.team.getName.shapes;

import com.team.getName.exception.ShapeException;

public class Rectangle extends Parallelogram {

	public Rectangle(Point point1, Point point2, Point point3, Point point4) {
		super(point1, point2, point3, point4);

	}

	public static boolean isRectangle(Quadrilateral rec) throws ShapeException {
		if (rec.getL1().getLength() == rec.getL3().getLength() && rec.getL2().getLength() == rec.getL4().getLength())
			return true;
		else
			throw new ShapeException();
	}

	@Override
	public double getArea() {
		return getL1().getLength() * getL2().getLength();
	}

}
