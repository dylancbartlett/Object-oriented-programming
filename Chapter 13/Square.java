/*
Author: Dylan Bartlett
Date: 4/8/19
*/

class Square extends AbstractGeometricObject implements Colorable, comparable {
	
	private double side = 1.0;
	
	public Square(double s) {
		this.side = s;
		
	}
	
	public double getSide() {
		return this.side;
	}
	
	public double getArea() {
		double area = side * side;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = side * 4;
		return perimeter;
	}

	public void howToColor(){
		System.out.println("Color all four sides.");
	}
	
	public void compareTo(){
		System.out.println("fix this later!!!!");
	}
}