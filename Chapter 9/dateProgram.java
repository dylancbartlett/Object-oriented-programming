/*
By: Dylan Bartlett
Date: 1/22/19
Description: Date class

Date
----------------------------------
+toString() : String
+getTime(): long
----------------------------------
+Date()
+Date(elapseTime: long)
+setTime(elapseTime: long): void
----------------------------------

*/
class dateProgram {
	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		
		for (long i = 10000l; i < 1000000000000l;i = i * 10) {
			date.setTime(i);
			System.out.println("after " + i + " milliseconts the date is " + date.toString());
		}
	}
}