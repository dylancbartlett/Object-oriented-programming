/*
Author: Dylan Bartlett
Date: 1/30/19
Description: This Program creates polygons.
*/

class Exercise_9_9 {
	public static void main(String[] args) {
		RegularPolygon poly1 = new RegularPolygon(6, 4);
		System.out.println("Poly1");
		System.out.println("The perimiter of the poly1 is " + poly1.getPerimeter());
		System.out.println("The area of the poly1 is " + poly1.getArea());
		System.out.println(" ");
		
		RegularPolygon poly2 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("Poly2");
		System.out.println("The perimiter of the poly2 is " + poly2.getPerimeter());
		System.out.println("The area of the poly2 is " + poly2.getArea());
	}
}