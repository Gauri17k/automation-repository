package abstaction.Interface;

public class User {

	public static void main(String[] args) {

		RBI bank = null;

		String bankname;

		bankname = "City";

		if (bankname.equals("Sbi")) {
			bank = new Sbi();

		} else if (bankname.equals("Idbi")) {
			bank = new Idbi();

		} else if (bankname.equals("City")) {
			bank = new City();
		}

		bank.creditCard();
		bank.debitCard();
		bank.currentAccount();
		bank.savingAccount();

	}
}
