/*
Author: Dylan Bartlett
Date: 2/8/2019

--------------------------------------------------
				GeometricObject
--------------------------------------------------
- color: String
- filled: boolean
- dateCreated: java.util.Date
--------------------------------------------------
+ GeometricObject()
+ GeometricObject(color: String, filled: boolean)
+ getColor(): String
+ setColor(color: String): void
+ isFilled(): boolean
+ setFilled(filled: boolean): void
+ getDateCreated(): java.util.Date
+ toString(): String
--------------------------------------------------

--------------------------------------------------
		Triangle extends geometricobject
--------------------------------------------------
- side1: double
- side2: double
- side3: double
--------------------------------------------------
+ Triangle()
+ Triangle(side1: double, side2: double, side3: double)
+ getSide1(): double
+ getSide2(): double
+ getSide3(): double
+ getArea(): double
+ getPerimeter(): double
+ toString(): String
--------------------------------------------------
*/

class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		super();
	}
	
	public Triangle(double s1, double s2, double s3) {
		super();
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public double getSide3() {
		return this.side3;
	}
	
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3) / 2;
		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
		return area;
	}
	
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public String toString() {
		return "Triangle:\n\t side1 = " + side1 + " \n\tside2 = " + side2 + "\n\tside3 = " + side3 + "\n\tArea = " + this.getArea() + "\n\tperimeter: " + this.getPerimeter() + "\n" + super.toString();
	}
}