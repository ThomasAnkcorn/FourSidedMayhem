package com.team.getName.shapes;

public class Square extends Rectangle{
	
	private boolean isSquare(){
		if(l1.getLength() == l3.getLength() == l2.getLenth() == l4.getLenth())return true;
		else return false;
	}
	
	public Square(){
		
	}
	
	@Override
	public double getArea(){
		return Math.pow(l1, 2);
	}

}
