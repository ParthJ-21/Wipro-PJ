package com.wipro.oop;

public class Citi implements BankOps {
	public String accNumber;
    public double balance;

    public Citi(String accNumber) {
        this.accNumber = accNumber;
        this.balance = 100; // Initial ₹100 cashback on account creation
    }

	@Override
	public void deposit(double amount, String accNumber) {
		 if (this.accNumber.equals(accNumber)) {
	            double bonus = amount * 0.01;
	            balance += amount + bonus;
	            System.out.println("Citi: ₹" + amount + " deposited with ₹" + bonus + " bonus.");
	        } else {
	            System.out.println("Citi: Invalid account number.");
	        }
	}

	@Override
	public double depositAndReturnBalance(double amount, String accNumber) {
		 deposit(amount, accNumber);
	        return balance;
	}

}
