package com.team.getName.shapes;

public class Trapezium extends Quadrilateral {
	private double longBase;
	private double shortBase;
	private double slantingSide1;
	private double slantingSide2;
	
	public Trapezium() {
		
	}
	
	public Trapezium(Quadrilateral quad) {
		if (isTrapezium(quad) == true ) {
			this.longBase = quad.getL1().getLength();
			this.shortBase = quad.getL2().getLength();
			this.slantingSide1 = quad.getL3().getLength();
			this.slantingSide2 = quad.getL4().getLength();
		}
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
	
	
}
