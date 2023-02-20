package edu.monmouth.cs176.s1337039.mp0;

public class BankAccount {
	private double balance;
	private String owner;
	
	public BankAccount(String owner){
		balance = 0.0;
		owner = "";
		this.owner = owner;
	}
	
	public BankAccount(String owner, double startingAmt) {
		balance = startingAmt;
		this.owner = owner;
	}
	
	public void depositMoney(double amt) {
		balance += amt;
	}
	
	public void withdrawMoney(double amt) {
		balance -= amt;
		
		
	}
	public double getBalance(){
		return balance;
	}
	public String getOwner() {
		return owner;
	}
	


}
