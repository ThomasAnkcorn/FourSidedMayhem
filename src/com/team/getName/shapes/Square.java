package com.team.getName.shapes;

import com.team.getName.exception.ShapeException;

public class Square extends Rectangle{
	Point p1;
	Point p2;
	Point p3;
	Point p4;
	

	public Square(Point p1, Point p2, Point p3, Point p4){
		super(p1, p2, p3, p4);
		
	}
	
	@Override
	public double getArea(){
		return getL1().getLength() * getL2().getLength();
	}
	
	public static boolean isSquare(Quadrilateral quad) throws ShapeException{
		
		if (quad.getL1() == quad.getL3() && quad.getL2() == quad.getL4()){
			return true;
			
		} else{
			
			throw new ShapeException();
		}
		
		
	}

}
