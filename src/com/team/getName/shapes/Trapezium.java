package com.team.getName.shapes;

import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.Theories;

public class Trapezium extends Quadrilateral {
	private double longBase;
	private double shortBase;
	private double slantingSide1;
	private double slantingSide2;

	public Trapezium(Point point1, Point point2, Point point3, Point point4) {
		super(point1, point2, point3, point4);

		if (getL1().getSlope() == getL3().getSlope()) {
			if (getL1().getLength() > getL3().getLength()) {
				this.longBase = getL1().getLength();
				this.shortBase = getL3().getLength();
			} else {
				this.longBase = getL3().getLength();
				this.shortBase = getL1().getLength();
			}
			this.slantingSide1 = getL2().getLength();
			this.slantingSide2 = getL4().getLength();
		} else {
			if (getL2().getLength() > getL4().getLength()) {
				this.longBase = getL2().getLength();
				this.shortBase = getL4().getLength();
			} else {
				this.longBase = getL4().getLength();
				this.shortBase = getL2().getLength();
			}
			this.slantingSide1 = getL1().getLength();
			this.slantingSide2 = getL3().getLength();
		}

	}

	public static boolean isTrapezium(Quadrilateral quad) {
		if (quad.getL1().getSlope() == quad.getL3().getSlope()
				&& quad.getL1().getLength() != quad.getL3().getLength()) {
			return true;
		} else if (quad.getL2().getSlope() == quad.getL4().getSlope()
				&& quad.getL2().getLength() != quad.getL4().getLength()) {
			return true;
		} else {
			return false;
		}
	}

	private void calculate4Sides() {

	}

	public double getArea() {
		double height;
		double area;

		height = this.getP1().getYpos() - this.getP3().getYpos();
		if (height < 0) {
			height = this.getP3().getYpos() - this.getP1().getYpos();
		}

		area = ((shortBase + longBase) / 2) * height;
		System.out.println("shortbase = " + shortBase + " longbase = " + longBase + "height = " + height);
		return area;
	}

	@Override
	public double getPerimeter() {
		double d = getL1().getLength() + getL2().getLength() + getL3().getLength() +getL4().getLength();

		return d;
	}

	public double getLongBase() {
		return longBase;
	}

	public void setLongBase(double longBase) {
		this.longBase = longBase;
	}

	public double getShortBase() {
		return shortBase;
	}

	public void setShortBase(double shortBase) {
		this.shortBase = shortBase;
	}

	public double getSlantingSide1() {
		return slantingSide1;
	}

	public void setSlantingSide1(double slantingSide1) {
		this.slantingSide1 = slantingSide1;
	}

	public double getSlantingSide2() {
		return slantingSide2;
	}

	public void setSlantingSide2(double slantingSide2) {
		this.slantingSide2 = slantingSide2;
	}

}
