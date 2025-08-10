package Assignment5;

public class Encapsulationq3 {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    private String[] transactions = new String[100];
    private int transactionCount = 0;

    public Encapsulationq3(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = Math.max(initialBalance, 0);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("Deposit of " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction("Withdraw of " + amount);
            return true;
        } else {
            System.out.println("Invalid or insufficient balance.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        String maskedAcc = "****" + accountNumber.substring(accountNumber.length() - 4);
        return "Account Holder: " + accountHolder + ", Account Number: " + maskedAcc + ", Balance:" + balance;
    }

    private void addTransaction(String details) {
        if (transactionCount < transactions.length) {
            transactions[transactionCount++] = details;
        }
    }

    public String getLastTransaction() {
        if (transactionCount == 0) {
            return "No transactions yet.";
        } else {
            return transactions[transactionCount - 1];
        }
    }
    

	public static void main(String[] args) {
		Encapsulationq3 acc = new Encapsulationq3("123456789012", "Prathamesh", 5000);

        System.out.println(acc);
        acc.deposit(1000);
        acc.withdraw(600);
        acc.withdraw(6000);
        acc.deposit(-200);

        System.out.println(acc);
        System.out.println("Last Transaction: " + acc.getLastTransaction());
        System.out.println("Balance:" + acc.getBalance());

	}

}
