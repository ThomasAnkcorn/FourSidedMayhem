package com.team.getName.shapes;

import java.util.ArrayList;
import java.util.List;

public class Trapezium extends Quadrilateral {
	private double longBase;
	private double shortBase;
	private double slantingSide1;
	private double slantingSide2;
	
	public Trapezium(Point point1, Point point2, Point point3, Point point4) {
		super(point1, point2, point3, point4);
		
	/*	double slopes[] = { 
				slopes.add(quad.getL1().getSlope()); } 
		slopes.add(quad.getL2().getSlope());
		slopes.add(quad.getL3().getSlope());
		slopes.add(quad.getL4().getSlope());*/
		
		/*for () {
			
		}
		switch() {
			case: 0 {
				
				break;
			}
		}*/
		//if (quad.getL1().getSlope() == 0) {
			
	//	}
		
		/*if (isTrapezium(quad) == true ) {
			this.longBase = quad.getL1().getLength();
			this.shortBase = quad.getL2().getLength();
			this.slantingSide1 = quad.getL3().getLength();
			this.slantingSide2 = quad.getL4().getLength();
		}*/
	}
	
	public static boolean isTrapezium(Quadrilateral quad) {
		
		return false;
	}
	
	private void calculate4Sides() {
		
	}
	
	public double getArea() {
		double area = 0;
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
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
