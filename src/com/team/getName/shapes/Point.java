package com.team.getName.shapes;

public class Point {

	private double xpos;
	private double ypos;
	
	Point(double xpos, double ypos){
		this.xpos = xpos;
		this.ypos = ypos;
	}
	public double getXpos() {
		return xpos;
	}
	
	
	public void distanceTo(){
		
	}
	
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}
	public double getYpos() {
		return ypos;
	}
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}
	
	
	public String toString(Point p){
		return "A Point with x = "+p.xpos+" and y = "+p.ypos+"!";
	}
	
	
}
