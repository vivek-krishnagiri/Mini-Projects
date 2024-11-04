import java.util.Scanner;


public class BankingApplication {

	public static void main (String[] args) {
		
		BankAccount account = new BankAccount ("Vivek Krishnagiri", "022504");
		account.getMenu();
	}
	
}

class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	BankAccount(String cName, String cID){
		customerName = cName;
		customerID = cID;
	}
	
	void deposit (int amount){
		if (balance != 0) {
			balance += amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw (int amount){
		if (balance != 0) {
			balance -= amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction(){
		if (previousTransaction > 0) {
			System.out.println("Deposited :" + previousTransaction);
		}
		else if (previousTransaction < 0) {
			System.out.println("Withdrawn :" + previousTransaction);
		}
		else {
			System.out.println("No transaction has occured");
		}
	}
	
	void getMenu() {
		char option = '\0';
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is " + customerID);
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("--------------------------------------------------------------");
			System.out.println("Enter an option.");
			System.out.println("--------------------------------------------------------------");
			option = scnr.next().charAt(0);
			System.out.println();
			
			switch (option) {
			
			case 'A':
				System.out.println("-------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("-------------------------------");
				System.out.println();
				break;
			
			case 'B':
				System.out.println("-------------------------------");
				System.out.println("Enter an amount to deposit.");
				System.out.println("-------------------------------");
				int amount = scnr.nextInt();
				deposit(amount);
				System.out.println();
				break;
				
			case 'C':
				System.out.println("-------------------------------");
				System.out.println("Enter an amount to withdraw.");
				System.out.println("-------------------------------");
				int amount2 = scnr.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
				
			case 'D':
				System.out.println("-------------------------------");
				getPreviousTransaction();
				System.out.println("-------------------------------");
				System.out.println();
				break;
				
			case 'E':
				System.out.println("**********************************************************");
				
			default:
				System.out.println("Invalid Option! Please select another choice.");
				break;
			
			}
		
		
		}
		
		while (option != 'E');
		
		System.out.println("Thank you for using our banking application.");
	}
	
}
