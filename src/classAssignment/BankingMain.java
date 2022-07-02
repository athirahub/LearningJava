package classAssignment;

public class BankingMain {

	public static void main(String[] args) {
		ChequingAccount chqAccount = new ChequingAccount();
		chqAccount.depositMoney(1000);
		
		SavingAccount svngAccount = new SavingAccount();
		
		TFSA tfsa = new TFSA();
		tfsa.depositMoney(5000);
		
		
		System.out.println("Balance in chequing : "+chqAccount.balance);
		
		System.out.println("Balance in Saving : "+svngAccount.balance);
		
		System.out.println("Balance in TFSA : "+tfsa.balance);
		System.out.println("Authorized:"+chqAccount.authorization(1234, "Chequing"));
		System.out.println("Authorized:"+svngAccount.authorization(3456, "Saving"));
		System.out.println("Authorized:"+tfsa.authorization(6666, "TFSA"));
	}
	}


