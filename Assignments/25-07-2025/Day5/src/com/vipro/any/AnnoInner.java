package com.vipro.any;

public class AnnoInner {

	public static void main(String[] args) {
		BankOps savingsAccount = new BankOps() {

			@Override
			public void deposit(double amount) {
				System.out.println("saving deposit "+amount);
				
			}
			
		};
		BankOps currAccount = new BankOps() {

			@Override
			public void deposit(double amount) {
				System.out.println("current deposit "+amount);
				
			}
			
		};
		savingsAccount.deposit(3000);
		currAccount.deposit(3700);
		BankOps savings =(amount)->{System.out.println("saving deposit "+amount);};
		savings.deposit(3215);
	}

}
