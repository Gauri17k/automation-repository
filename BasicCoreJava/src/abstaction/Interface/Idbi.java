package abstaction.Interface;

public class Idbi implements  RBI{

	
	public void savingAccount() {
		System.out.println("saving acct in Idbi bank");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("current acct in Idbi bank");
		
	}

	@Override
	public void debitCard() {
		System.out.println("debit acct in Idbi bank");
		
	}

	@Override
	public void creditCard() {
		System.out.println("credit acct in Idbi bank");
		
}
}
