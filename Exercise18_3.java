/*
Author: Dylan Bartlett
Date: April 29, 2019
*/
import java.util.Scanner;

class Exercise18_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter M: ");
		int m = input.nextInt();
		System.out.println();
		System.out.print("Enter N: ");
		int n = input.nextInt();
		System.out.println();
		
		System.out.println(gcd(m, n));
		
	}
		
	public static int gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		}
		else {
			return gcd(n, m%n);
		}
		
	}
	
}