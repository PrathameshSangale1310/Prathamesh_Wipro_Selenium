package Assignment4;

interface Banks {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class Account implements Banks {
    protected String accountNumber;
    protected double balance;

    Account(String accNo, double initialBalance) {
        this.accountNumber = accNo;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited:" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew:" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private final double minimumBalance = 500.0;

    SavingsAccount(String accNo, double initialBalance) {
        super(accNo, initialBalance);
    }

    public void withdraw(double amount) {
        if ((balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrew from Savings:" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    private final double overdraftLimit = 1000.0;

    CurrentAccount(String accNo, double initialBalance) {
        super(accNo, initialBalance);
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew from Current:" + amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

public class Combinedq2 {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("SA101", 2000);
        CurrentAccount ca = new CurrentAccount("CA101", 1000);

        System.out.println("***** Savings Account *****");
        sa.deposit(500);
        sa.withdraw(1800);
        sa.withdraw(1000);
        System.out.println("Savings Balance:" + sa.getBalance());

        System.out.println("\n***** Current Account *****");
        ca.withdraw(1800);
        ca.deposit(1000);
        ca.withdraw(500);
        System.out.println("Current Balance:" + ca.getBalance());

	}

}
