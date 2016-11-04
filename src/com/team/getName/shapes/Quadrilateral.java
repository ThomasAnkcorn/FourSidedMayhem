package com.team.getName.shapes;

public abstract class Quadrilateral {

	//Attributes
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	private Line l1;
	private Line l2;
	private Line l3;
	private Line l4;
	
	//Interesting methods
	public abstract double getPerimeter();
	public abstract double getArea();

	@Override
	public String toString(){
		System.out.println("Point 1: " + p1);
		System.out.println("Point 2: " + p2);
		System.out.println("Point 3: " + p3);
		System.out.println("Point 4: " + p4);
		System.out.println("Line 1 length: " + l1.getLength());
		System.out.println("Line 1 length: " + l2.getLength());
		System.out.println("Line 1 length: " + l3.getLength());
		System.out.println("Line 1 length: " + l4.getLength());
		System.out.println("Area: " + getArea());
		System.out.println("Permieter: " + getPerimeter());
	}	
	
	//Getters and Setters
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

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	public Point getP4() {
		return p4;
	}

	public void setP4(Point p4) {
		this.p4 = p4;
	}

	public Line getL1() {
		return l1;
	}

	public void setL1(Line l1) {
		this.l1 = l1;
	}

	public Line getL2() {
		return l2;
	}

	public void setL2(Line l2) {
		this.l2 = l2;
	}

	public Line getL3() {
		return l3;
	}

	public void setL3(Line l3) {
		this.l3 = l3;
	}

	public Line getL4() {
		return l4;
	}

	public void setL4(Line l4) {
		this.l4 = l4;
	}

}
