package com.wipro.oop;

public interface BankOps {
	void deposit(double amount, String accNumber);
    double depositAndReturnBalance(double amount, String accNumber);
}
