package com.wipro.thread;

public class BankThread {
	String AccNo;
	double balance;
	
	Double Depost(double amt) {
		return balance = balance + amt;
	}
	Double Remaining(double amt) {
		return balance = balance - amt;
	}
	public BankThread(String accNo, double balance) {
		super();
		AccNo = accNo;
		this.balance = balance;
	}
	public String getAccNo() {
		return AccNo;
	}
	public void setAccNo(String accNo) {
		AccNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankThread [AccNo=" + AccNo + ", balance=" + balance + "]";
	}
	
}
