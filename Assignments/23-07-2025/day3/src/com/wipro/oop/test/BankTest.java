package com.wipro.oop.test;
import com.wipro.oop.HDFC;
import com.wipro.oop.Citi;
import com.wipro.oop.BankOps;
public class BankTest {

	public static void main(String[] args) {
		BankOps hdfcAcc = new HDFC("HDFC123");
        BankOps citiAcc = new Citi("CITI123");
        System.out.println("\n--- HDFC Bank ---");
        hdfcAcc.deposit(1000, "HDFC123");
        hdfcAcc.deposit(500, "HDFC123");
        
        System.out.println("\n--- Citi Bank ---");
        citiAcc.deposit(1000, "CITI123");
        citiAcc.deposit(500, "CITI123");
	}

}
