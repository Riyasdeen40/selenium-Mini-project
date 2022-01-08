package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("New Deposit(overridden): RS.3,50,000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab=new AxisBank();
		BankInfo bi=new BankInfo();
		ab.deposit();
		bi.deposit();

	}

}
