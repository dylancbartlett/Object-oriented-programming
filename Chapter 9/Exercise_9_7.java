/*
Author: Dylan Bartlett
Date: 1/24/19 through 1/29/19
Description: This program is creating an account.
*/

class Exercise_9_7 {
	public static void main(String[] args) {
		Account a1 = new Account(1122, 20000.00);
		System.out.println("Account number 1122");
		System.out.println("Account created " + a1.getDateCreated());
		System.out.println("Your account had $" + a1.getBalance() + " Before any transactions.");
		a1.deposit(3000);
		System.out.println("you have deposited $3000 your new balance is $" + a1.getBalance());
		a1.withdraw(2500);
		System.out.println("you have withdrawn $2500 your new balance is $" + a1.getBalance());
		a1.setAnnualInterestRate(4.5);
		System.out.println("Monthly interest is $" + a1.getMonthlyInterest());
		System.out.println("Your new balance is $" + a1.getBalance() + " after all transactions.");
		
	}
}