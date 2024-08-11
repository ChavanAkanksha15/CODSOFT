package Task3;

import java.util.Scanner;

public class ATMInterface {
	
	public static void main(String[] args)
	{
		B_Account account=new B_Account(5000);
		
		Atm atm=new Atm(account);
		
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			atm.Menu();
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			
			int amount=0;
			if(choice==2 || choice==3) {
				System.out.println("Enter the amount: ");
				amount=sc.nextInt()	;	
			}
			atm.Choice(choice, amount);
			
		}while(choice !=4);
		
		sc.close();
	}
}
