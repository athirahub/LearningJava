package atmCashWithdrawal;

import java.util.Scanner;



public class Atm {
String bank = "scotiabank";
	
	int counter = 0;
	int selection;

	Scanner sc = new Scanner(System.in);

	boolean validatingPin(Person person, int pin) {// returns true if user entered pin matches with pin in person class/

		if (person.usePin() == pin) {
			return true;
		} else {
			return false;
		}
	}

	void withdrawCash(double amount, Person person1) {
		 
		do {
			System.out.println("Select account 1.chequing,2.saving ");// if invalid selection made user will get three
																		// chances if invalid entry done thrice then
																		// default case will be executed//
			selection = sc.nextInt();

			if (selection == 1 || selection == 2) {
				break;
			} else {
				counter++;
				if (counter < 3) {
					System.out.println("Invalid selection try again");
				} else {
					break;
				}
			}
		} while (selection != 1 || selection != 2 && counter <= 3);
		switch (selection) {
		case 1: {// if user has selected 1/chequing then only will get executed//
			if (person1.isChequingWithdrawable(amount) && isWithinDailyLimit(person1, amount)) {
				// executed only when amt entered is less than daily limit as well as less
				// than/equal to amt already in chequing//
				counter = 0;
				do {

					System.out.println("Do you confirm the procedure:1.yes,2.no");
// prompt repeated thrice if user enters incorrect info,more than thrice line 79 will be executed//
					selection = sc.nextInt();
					if (selection == 1 || selection == 2) {
						break;
					} else {
						counter++;
						if (counter < 3) {
							System.out.println("Invalid selection try again");
						} else {
							break;
						}
					}
				} while (selection != 1 || selection != 2 && counter <= 3);
				switch (selection) {
				case 1: {// if user confirm procedure then only will execute//

					System.out.println("Transaction complete.Do u want a receipt:1.yes,2.no");
					selection = sc.nextInt();
					if (selection == 1) {// if need receipt then receipt and balance amt shown by invoking method in
						// person class/
	                 System.out.println(" print receipt .The balance is $"+ person1.totalFundsAfterWithdrawal(amount, "chequing"));
                   } else {
	                     System.out.println("The balance is :$ " + person1.totalFundsAfterWithdrawal(amount, "chequing"));
	// just balance shown if no receipt needed//
																									
                    }
                   break;
                    }
                 case 2: {
//if user select no to confirm procedure//
                    System.out.println("Transaction cancelled .The balance is:"+ person1.totalFundsAfterWithdrawal(0, "chequing"));
                    break;
                       }
                  default: {// if user hasnt entered proper ans for confirm procedure qn thrice//
                    System.out.println("Reinsert card and try again");
                     break;
                     }
                  }

                } else {// if amt entered>amt in chequing or amt>daily limit then will execute//
// amt exceeds amt in chequing//
                   System.out.println("Insufficient funds.Unable to make transaction");

                   }
			   break;
		         }
			
		
		case 2:// if user selected savings as account then will execute//

		{// 97 checks if amt entered<amt in savings and is within daily limit if yes
			// execute//
			if (person1.isSavingsWithdrawable(amount) && isWithinDailyLimit(person1, amount)) {
				counter = 0;
				do {// prompt to confirm repeated if incorrect thrice//
					System.out.println("Do you confirm the procedure:1.yes,2.no");
					selection = sc.nextInt();

					if (selection == 1 || selection == 2) {
						break;
					} else {
						counter++;
						if (counter < 3) {
							System.out.println("Invalid selection try again");
						} else {
							break;
						}
					}
				} while (selection != 1 || selection != 2 && counter < 3);
				switch (selection) {
				case 1: {// if user confirmed procedure//

					System.out.println("Transaction complete.Do u want a receipt:1.yes,2.no");
					selection = sc.nextInt();
					if (selection == 1) {// if user need receipt//
						System.out.println(" print receipt .The balance is $"
								+ person1.totalFundsAfterWithdrawal(amount, "savings"));
					} else {// hasnt selected receipt//
						System.out.println("The balance is :$ " + person1.totalFundsAfterWithdrawal(amount, "savings"));
					}
					break;
				}
				case 2: {// user select no to confirm procedure//

					System.out.println(
							"Transaction cancelled .The balance is:" + person1.totalFundsAfterWithdrawal(0, "savings"));
					break;
				}
				default: {// if user entered incorrect value thrice when asked to confirm//
					System.out.println("Reinsert card and try again");
					break;
				}
				}
			} else {// if amt>amt in savings or amt>daily limit//
				//if amt>amt in savings then will execute//
					System.out.println("Insufficient funds.Unable to make transaction");
				
				}
			
			break;
		}
		default: {// if user doesnt select chequing/savings by 3 tries//
			System.out.println("Reinsert card and try again");
			break;
		}
		}

	}

	void depositCash(double amount, Person person) {
		
		counter = 0;
		do {
//prompt to select chequing/saving repeated thrice if invalid no entered//
			System.out.println("Select account 1.chequing,2.saving ");
			selection = sc.nextInt();
			counter++;
			if (selection == 1 || selection == 2) {
				break;
			} else {
				if (counter < 3) {
					System.out.println("Invalid selection try again");
				} else {
					break;
				}
			}
		} while (selection != 1 || selection != 2 && counter <= 3);
		if (selection != 1 && selection != 2) {// if hasnt selected chequing/savings in 3 tries//
			System.out.println("Reinsert card and try again");
		}
		if (selection == 1 || selection == 2) {// if either chequing/saving selected//
			counter = 0;
			int confirm;
			do {// user gets 3 chance to enter yes/no to confirm qn//
				System.out.println("Do you confirm the procedure:1.yes,2.no");
				confirm = sc.nextInt();
				if (confirm == 1 || confirm == 2) {
					break;
				} else {
					counter++;
				}
				if (counter < 3) {
					System.out.println("Invalid selection try again");
				} else {
					break;
				}
			} while (confirm != 1 || confirm != 2 && counter < 3);
			switch (confirm) {
			case 1: {// if user confirm transaction//
				System.out.println("Transaction complete.Do you need a receipt:1.yes,2.no");
				int select = sc.nextInt();// select 1 means user need receipt,2 no receipt//
				if (selection == 1 && select == 1) {// if user has selected chequing acc and receipt//
					
					System.out.println("Print a receipt.Your balance is: $" + person.totalFundsAfterDeposit(amount, "chequing"));
				} else if (selection == 2 && select == 1) {// user savings acc and receipt//
					
					System.out.println("Print a receipt.Your balance is: $" + person.totalFundsAfterDeposit(amount, "savings"));
				} else {// if no receipt//
					if (selection == 1) {// if selected chequing& no receipt//
						
						System.out.println("Your balance is:$ " + person.totalFundsAfterDeposit(amount, "chequing"));
					}
					if (selection == 2) {// if selected savings and no receipt//
						
						System.out.println("Your balance is:$ " + person.totalFundsAfterDeposit(amount, "savings"));
					}
				}

				break;
			}
			case 2: {// if user hasnt confirmed transaction//
				System.out.println("Transaction cancelled");
				if (selection == 1) {// if chequing acc was selected//
					
					System.out.println("Your balance is:" +person.totalFundsAfterDeposit(0, "chequing") );
				}
				if (selection == 2) {// if saving acc was selected//
					
					System.out.println("Your balance is:" + person.totalFundsAfterDeposit(0, "savings"));
				}
				break;

			}
			default: {// when asked to confirm hasnt entered valid entry by three times//
				System.out.println("Reinsert card and try again");
				break;
			}
			}
		}

	}

	 boolean isWithinDailyLimit(Person person, double cash) {
		if (cash <= person.limit) {//return true only if entered amt less than persons daily limit//
			person.limit=person.limit-cash;
			return true;
		} else {
			return false;

		}
	}

}


