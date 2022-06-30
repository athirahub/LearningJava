package atmCashWithdrawal;

import java.util.Scanner;



public class MainClass {

	public static void main(String[] args) {
		String[] account = { "chequing", "savings" };
		Person person1 = new Person("Himallal", "scotiabank", 456789078943L, 3300, account, 2356, 300, 3000, 500);// creating&initialising
																													// person1
																													// obj//
		Atm atmbranch = new Atm();
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int pin;
		int selection;
		double withdrawAmount;
		double depositAmount;
		boolean isPinOk=false;

		// prompt to enter pin is repeated till entered pin matches with users pin or
		// user has tried incorrectly 3 times,if count>=3 line no 36 executed and
		// program stops//
//if pin matches line no 38 will be executed//again prompt to select whether withdrawal/deposit repeated until valid entry of 1/2 3 times//
		do {
			System.out.println("Enter the pin");
			pin = sc.nextInt();

			if (atmbranch.validatingPin(person1, pin)) {
				isPinOk = true;

				break;
			} else {
				count++;
				if (count < 3) {
					System.out.println("Incorrect pin try again");
				}
				}
		} while (!atmbranch.validatingPin(person1, pin) && count < 3);

		if (count >= 3) {
			System.out.println("Account is locked,visit branch");
		}
		if (isPinOk) {// method validating pin returns true ie,if pin matches//

			System.out.println("Please enter 1.withdrawal,2.deposit");
			selection = sc.nextInt();
			switch (selection) {
			case 1: {// if user select withdrawal then will execute//

				System.out.println("Enter amount to be withdrawn:$");
				withdrawAmount = sc.nextDouble();
				if (withdrawAmount > 0) {// if amount entered greater than 0 then method to withdraw cash is
											// invoked//
					if (atmbranch.isWithinDailyLimit(person1, withdrawAmount)) {
						atmbranch.withdrawCash(withdrawAmount, person1);
					} else {
						System.out.println("Daily limit exceeded unable to make transaction");
					}
				}

						if (withdrawAmount <= 0) {
							System.out.println("Invalid entry try again");
						}
						break;
					}
			case 2: {// if user select 2 or saving then will be executed//

				System.out.println("Enter amount to be deposited");
				depositAmount = sc.nextDouble();
				if (depositAmount > 0) {// only if valid amt of above 0 entered method to deposit cash will be
										// invoked,with that amt as argument//
					atmbranch.depositCash(depositAmount, person1);
				}

				else {// if invalid amt entered  then will be executed//
					System.out.println("Invalid entry  try again");
				}
				break;
			}

			default: {
				System.out.println("Invalid entry try again");
				break;
			}

			}
		}
	}
}

				
		
			