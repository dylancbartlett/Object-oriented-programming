/*
Author: Dylan Bartlett
Date: 4/8/19
*/

class testSquare {
	public static void main(String[] args) {
		
		AbstractGeometricObject[] list = new AbstractGeometricObject[5];
		list[0] = new Square(1);
		list[1] = new Square(3);
		list[2] = new Square(5);
		list[3] = new Square(7);
		list[4] = new Square(9);
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("Square " + (i + 1) + ": ");
			System.out.println("Area: " + list[i].getArea());
			System.out.println("Color: ");
			((Square)list[i]).howToColor();
			System.out.println();
		}
	}
}