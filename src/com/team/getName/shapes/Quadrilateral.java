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
	
	//Constructor
	public Quadrilateral(Point p1, Point p2, Point p3, Point p4){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.l1 = new Line(p1, p2);
		this.l2 = new Line(p2, p3);
		this.l3 = new Line(p3, p4);
		this.l4 = new Line(p4, p1);
	}
	
	//Interesting methods
	public abstract double getArea();
	public double getPerimeter(){
		double d = l1.getLength() + l2.getLength() + l3.getLength() + l4.getLength();
		return d;
	}

	//Override toString method to show requested information about the shape
	@Override
	public String toString(){
		String s = "Point 1: " + p1.toString()+ "\n";
		s+= "Point 2: " + p2.toString() + "\n";
		s+= "Point 3: " + p3.toString() + "\n";
		s+= "Point 4: " + p4.toString() + "\n";

		s+= "Line 1 length: " + l1.getLength() + "\n";
		s+= "Line 2 length: " + l2.getLength() + "\n";
		s+= "Line 3 length: " + l3.getLength() + "\n";
		s+= "Line 4 length: " + l4.getLength() + "\n";
		
		s+= "Area: " + getArea() + "\n";
		s+= "Permieter: " + getPerimeter();
		
		return s;
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
