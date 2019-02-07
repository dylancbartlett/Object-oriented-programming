/*
Author: Dylan Bartlett
Date: 2/4/2019
*/

class Exercise_10_3 {
	public static void main(String[] args) {
		MyInteger abc = new MyInteger(7);
		
		System.out.println("Testing isEven functions:");
		System.out.println(MyInteger.isEven(6));
		System.out.println(MyInteger.isEven(new MyInteger(12)));
		System.out.println(abc.isEven());
		System.out.println(" ");
		
		System.out.println("Testing isOdd functions:");
		System.out.println(MyInteger.isOdd(12));
		System.out.println(MyInteger.isOdd(new MyInteger(15)));
		System.out.println(abc.isOdd());
		System.out.println(" ");
		
		System.out.println("Testing isPrime functions:");
		System.out.println(MyInteger.isPrime(11));
		System.out.println(MyInteger.isPrime(new MyInteger(22)));
		System.out.println(abc.isPrime());
		System.out.println(" ");
		
		System.out.println("Testing equals functions:");
		System.out.println(abc.equals(7));
		System.out.println(" ");
		
		char[] array = new char[] {'1', '4', '9'};
		
		System.out.println("Testing parseInt functions:");
		System.out.println(abc.parseInt("123"));
		System.out.println(abc.parseInt(array));
		System.out.println(" ");
	}
}
