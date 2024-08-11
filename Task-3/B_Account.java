package Task3;

public class B_Account {

	private int balance;

	public B_Account(int balance) {
		super();
		this.balance = balance;
	}
	
	
	//method to deposit money in account
	public void deposite(int amount) {
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("Successfully deposited.."+amount);
		}
		else
		{
			System.out.println ("Invalid amount..");
		}
	}
	
	//method to withdraw
	public void withdraw(int amount)
	{
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("Successfully withdraw.!!"+amount);
			
		}else if(amount>balance)
		{
			System.out.println("Insufficient balance for withdrawal..");
		}
		else {
			System.out.println("Invalid withdrawal amount..");
		}
	}//method to check balance
	
	public int checkbalance() {
		return balance;
	}
}
