/*
Author: Dylan Bartlett
Date: 2/20/19

Description
This program counts the number of words in president Lincoln's Gettysburg adress.
*/
import java.util.Scanner;
class The_Counter {
	public static void main(String[] args) {
		System.out.print("Please enter a URL ");   
				String URLString = new Scanner(System.in).next();
					 
				try {
					int number = 0;
					java.net.URL url = new java.net.URL(URLString); 
					Scanner input = new Scanner(url.openStream());
					while (input.hasNext()) {
						String words = input.next();
						number ++;
					} 
					
					System.out.println("There is " + number + " Words in this section of the Gettysburg address.");
				}
				catch (java.net.MalformedURLException ex) {
					System.out.println("You need to enter a valic URL");
				}
				catch (java.io.IOException ex) {
					System.out.println("There is IO Errors.");
				}
	}
}