/*
Author: Dylan Bartlett
Date: 1/24/19 through 1/29/19
Description: This program is creating an account.

Account UML Diagram:
-----------------------------------------
+id: int
+balance: double
+annualInterestRate: double
+dateCreated: Date
-----------------------------------------
+getMonthlyInterestRate()
+getMonthlyInterest()
+withdraw()
+Deposit()
-----------------------------------------
*/

class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	// this is a no args constructor
	public Account() {
		dateCreated = new java.util.Date();
	}
	public Account (int newID, double newBalance) {
		id = newID;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}
	//This.id is returning id from the beggining
	public int getID() {
		return this.id;
	}
	// use this.something when there is more than one of the variable.
	public double getBalance() {
		return this.balance;
	}
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		this.annualInterestRate = annualInterestRate;
		double interestRate = ((annualInterestRate / 100) / 12);
		return interestRate;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public void setID(int newID) {
		id = newID;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	public double getMonthlyInterest() {
		return balance * (annualInterestRate / 1200);
	}
	//void means no return
	public void deposit(double amount) {
		balance = balance + amount;
	}
	public void withdraw(double amount) {
		balance = balance - amount;
	}
}