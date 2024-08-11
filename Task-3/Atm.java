package Task3;

public class Atm {

	private B_Account account;

	public Atm(B_Account account) {
		super();
		this.account = account;
	}
	
	//ATM options
	public void Menu() {
		System.out.println("Welcome to the ATM!!");
		System.out.println("1. Check balance..");
		System.out.println("2. Deposite..");
		System.out.println("3. Withdraw..");
		System.out.println("4. Exit");
	}
	
	public void Choice(int choice, int amount)
	{
		switch(choice) {
		case 1:
			System.out.println("Your balance is :"+account.checkbalance());
			break;
			
		case 2:
			account.deposite(amount);
			break;
		
		
		case 3:
			account.withdraw(amount);
			break;
		
		case 4:
			System.out.println("Thank you for using the ATM. Goodbye!");
            break;
            
		default:
            System.out.println("Invalid choice. Please try again.");
	}
 }
}
