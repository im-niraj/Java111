package question1;

public class Account {
	String accountNumber;
	double Balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		Balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	public void deposit(int depositAmount) {
		Balance +=depositAmount;
		
		
		System.out.println("Amount deposited new Balance: "+Balance);
	}
	
	public void withdraw(int WithdrawAmount) {
		if(WithdrawAmount > Balance) {
			try {
				throw new InsufficientFundsException();
			} catch (InsufficientFundsException e) {
				e.printStackTrace();
			}
		}
		else {			
			Balance -=WithdrawAmount;
			System.out.println("Amount Withdraw new Balance: "+Balance);
		}
		
	}

}
