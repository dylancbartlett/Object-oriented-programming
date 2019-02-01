/*
Author: Dylan Bartlett
Date: 1/30/19
Description: This Program creates polygons.

RegularPolygon UML diagram
----------------------------------------------
+n: int
+side: double
+x: double
+y: double
----------------------------------------------
+getPerimeter()
+getArea()
----------------------------------------------
*/
import java.lang.Math;

class RegularPolygon {
	
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon() {
	}
	public RegularPolygon(int num, double sideLength) {
		n = num;
		side = sideLength;
	}
	public RegularPolygon(int num, double sideLength, double x, double y) {
		n = num;
		side = sideLength;
		x = this.x;
		y = this.y;
	}
	public int getNum() {
		return this.n;
	}
	public double getSideLength() {
		return this.side;
	}
	public double getX() {
		return this.x;
	}
	public double gety() {
		return this.y;
	}
	public void setNum(int num) {
		n = num;
	}
	public void setSideLength(double sideLength) {
		side = sideLength;
	}
	public void setX() {
		this.x = x;
	}
	public void setY() {
		this.y = y;
	}
	public double getPerimeter() {
		return n * side;
	}
	public double getArea() {
		return ((n * (side * side)) / (4 * Math.tan(Math.PI / n)));
	}
}