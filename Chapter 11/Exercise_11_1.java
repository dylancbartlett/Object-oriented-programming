/*
Author: Dylan Bartlett
Date: 2/11/19
*/
import java.util.Scanner;
class Exercise_11_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double s1 = 0.0;
		double s2 = 0.0;
		double s3 = 0.0;
		String color = "";
		boolean filled = false;
		boolean fill = false;
		
		System.out.print("Enter length of side1: ");
		s1 = input.nextDouble();
		System.out.print("Enter length of side2: ");
		s2 = input.nextDouble();
		System.out.print("Enter length of side3: ");
		s3 = input.nextDouble();
		input.nextLine();
		System.out.print("Enter color: ");
		color = input.nextLine().trim();
		System.out.print("Is the Shape filled (true/false) ");
		filled = input.nextBoolean();
		
		Triangle t1 = new Triangle(s1, s2, s3);
		t1.setColor(color);
		t1.setFilled(filled);
		
		System.out.println(t1.toString());
	}
}