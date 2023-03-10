package edu.monmouth.cs176.s1337039.mp0;

public class BankAccountTester {
	
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("Rich", 1000);
		BankAccount wifesAccount = new BankAccount("Katia", 2000);
		BankAccount sonsAccount = new BankAccount("Leo", 500);
		
		wifesAccount.withdrawMoney(150);
		wifesAccount.chargeFees();
		wifesAccount.payInterest();
		
		sonsAccount.withdrawMoney(200);
		sonsAccount.chargeFees();
		sonsAccount.payInterest();
		
		myAccount.depositMoney(500);
		myAccount.chargeFees();
		myAccount.payInterest();
	
		
		System.out.printf("%s has %.2f \n", myAccount.getOwner(), myAccount.getBalance());
		System.out.printf("%s has %.2f \n", wifesAccount.getOwner(), wifesAccount.getBalance());
		System.out.printf("%s has %.2f \n", sonsAccount.getOwner(), sonsAccount.getBalance());
	}

}
