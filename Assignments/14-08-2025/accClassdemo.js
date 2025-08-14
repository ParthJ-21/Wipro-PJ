class BankAccount {
    constructor(accNumber, balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    deposit(amount) {
        
            this.balance = this.balance+amount;
            console.log("Amount Deposited!Your balance is:"+this.balance);
    }

    withdraw(amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance =this.balance-amount;
            console.log("Amount withdrawn.Your balance is:"+this.balance);
        } else{
            console.log("Insufficient balance.");
        } 
    }
}

const account = new BankAccount("123",10000);
account.deposit(5000);
account.withdraw(14000);
account.withdraw(2000);