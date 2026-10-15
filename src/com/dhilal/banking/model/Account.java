package com.dhilal.banking.model;

public abstract class Account {
	 private String accountNumber;
	 private String accountHolderName;
	 protected double balance;
	 
	 public Account(String accountNumber, String accountHolderName,double balance) {
		 this.accountNumber = accountNumber;
	     this.accountHolderName = accountHolderName;
	     this.balance = balance;
	 }
	 
	 public String getaccountNumber() {
		 return accountNumber;
	 }
	 
	 
	 public String  getaccountHolderName() {
		 return accountHolderName;
	 }
	
	 public double getbalance() {
		 return balance;
	 }
	 
	 
	 public abstract boolean withdraw(double amount);
	 
	 
	 public void deposit(double amount) {
		if (amount >= 0) {
			balance += amount;
		    System.out.println("Deposit successful. New Balance: &" + balance);
		 } 
		else {
			System.out.println("Invalid amount.");
		}
	 }

}
