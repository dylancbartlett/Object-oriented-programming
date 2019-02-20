/*
Author: Dylan Bartlett
Date: 2/12/19

Remove Duplicates
*/

import java.util.Scanner;
import java.util.ArrayList;
class Exercise_11_13 {
	public static void main(String[] args) {
		System.out.print("Enter ten integers: ");
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int place = input.nextInt();
			duplicates.add(place);
		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 0; i < duplicates.size(); i++) {
			if (!temp.contains(duplicates.get(i))) {
				temp.add(duplicates.get(i));
			}
		}
		duplicates.clear();
		for(int i = 0; i < temp.size(); i++) {
			duplicates.add(temp.get(i));
		}

		System.out.print("distinct integers: ");
		
		for (int i = 0; i < duplicates.size(); i++) {
			System.out.print(duplicates.get(i) + " ");
		}
	}
}