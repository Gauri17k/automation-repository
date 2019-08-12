package abstaction.Interface;

public class Sbi implements  RBI{

	public void savingAccount() {
		System.out.println("saving acct in Sbi bank");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("current acct in Sbi bank");
		
	}

	@Override
	public void debitCard() {
		System.out.println("debit acct in Sbi bank");
		
	}

	@Override
	public void creditCard() {
		System.out.println("credit acct in Sbi bank");
		
}}
