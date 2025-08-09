package com.wipro.oop;

public class HDFC implements BankOps {
	private String accNumber;
    private double balance;

    public HDFC(String accNumber) {
        this.accNumber = accNumber;
        this.balance = 0;
    }

	@Override
	public void deposit(double amount, String accNumber) {
		if (this.accNumber.equals(accNumber)) {
            balance += amount;
            System.out.println("HDFC: ₹" + amount + " deposited.");
        } else {
            System.out.println("HDFC: Invalid account number.");
        }
		
	}

	@Override
	public double depositAndReturnBalance(double amount, String accNumber) {
		deposit(amount, accNumber);
        return balance;
	}
}
