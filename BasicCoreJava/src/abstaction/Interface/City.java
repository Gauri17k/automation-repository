package abstaction.Interface;

public class City implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("saving acct in city bank");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("current acct in city bank");
		
	}

	@Override
	public void debitCard() {
		System.out.println("debit acct in city bank");
		
	}

	@Override
	public void creditCard() {
		System.out.println("credit acct in city bank");
		
	}

}
