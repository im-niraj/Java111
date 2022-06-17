package question1;

public class AccountDemo {
	public static void main(String[] args) {
		Account a1 = new Account("101", 5000);
		a1.deposit(500);
		a1.deposit(1000);
		a1.withdraw(3000);
		a1.withdraw(4000);
		a1.deposit(2000);
		System.out.println("------------ Total Balance of Account no = "+a1.getAccountNumber()+" is "+a1.getBalance()+" ------------ \n\n ");
		
		
		
		Account a2 = new Account("102", 3000);
		a2.deposit(3500);
		a2.deposit(2000);
		a2.withdraw(1000);
		a2.withdraw(40000);
		a2.deposit(200);
		System.out.println("------------ Total Balance of Account no = "+a2.getAccountNumber()+" is "+a2.getBalance()+" ------------ \n\n");
	}

}
