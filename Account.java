package assignment1;

class Account {
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest calculated and added to the account.");
    }
}

class LoanAccount extends Account {
    protected double loanAmount;
    protected double interestRate;

    public LoanAccount(int accountNumber, double loanAmount, double interestRate) {
        super(accountNumber);
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public void payEMI(double emiAmount) {
        if (balance >= emiAmount) {
            balance -= emiAmount;
            System.out.println("EMI paid successfully.");
        } else {
            System.out.println("Insufficient balance to pay EMI.");
        }
    }
}

class HousingLoan extends LoanAccount {
    private int tenure;

    public HousingLoan(int accountNumber, double loanAmount, double interestRate, int tenure) {
        super(accountNumber, loanAmount, interestRate);
        this.tenure = tenure;
    }

    public void printLoanDetails() {
        System.out.println("Loan Account Number: " + accountNumber);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Tenure: " + tenure + " years");
        System.out.println("Balance: " + balance);
    }



}