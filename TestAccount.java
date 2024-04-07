package assignment1;

public class TestAccount {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1001, 5.0);
        savingsAccount.deposit(5000);
        savingsAccount.calculateInterest();
        savingsAccount.printAccountDetails();

        System.out.println();

        HousingLoan housingLoan = new HousingLoan(2001, 1000000, 8.5, 15);
        housingLoan.deposit(50000);
        housingLoan.payEMI(20000);
        housingLoan.printLoanDetails();

	}

}
