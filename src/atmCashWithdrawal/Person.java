package atmCashWithdrawal;

public class Person {
	String name;
	String bankname;
	private long accountNumber;
	private double totalFunds;
	private String[] typesOfAccount;
	private int pin;
	private double chequingFund;
	private double savingFund;
	 double limit;

	 Person(String name, String bankname, long accountNumber, double totalFunds, String[] typesOfAccount, int pin,
			double chequingFund, double savingFund,double limit) {

		this.name = name;
		this.bankname = bankname;
		this.accountNumber = accountNumber;
		this.totalFunds = totalFunds;
		this.typesOfAccount = typesOfAccount;
		this.pin = pin;
		this.chequingFund = chequingFund;
		this.savingFund = savingFund;
		this.limit=limit;
	}

	int usePin() {//to check if pin matches//
		return pin;
	}

	boolean isChequingWithdrawable(double money) {//returns true if money< or equal to amt in chequing acc//

		if (money <= chequingFund) {
			return true;
		} else {
			return false;
		}
	}

	boolean isSavingsWithdrawable(double money) {//true if amt entered is less than or equal to amt in savings acc/
		if (money <= savingFund) {
			return true;
		} else {
			return false;
		}

	}

	double totalFundsAfterWithdrawal(double money, String name) {//when withdrawn totalfund and the fund in acc from which withdrawn updated//
		totalFunds = totalFunds - money;
		if (name.equals("chequing")) {
			chequingFund = chequingFund - money;
			
		}
		if (name.equals("savings")) {
			savingFund = savingFund - money;
		}
		return totalFunds;

	}

	double totalFundsAfterDeposit(double amount, String account) {//when deposited totalfunds and amt in deposited acc updated//
		totalFunds = totalFunds + amount;
		if (account.equals("chequing")) {
			chequingFund = chequingFund + amount;
		}
		if (account.equals("savings")) {
			savingFund = savingFund + amount;
		}
		return totalFunds;
	}

}

		
			
