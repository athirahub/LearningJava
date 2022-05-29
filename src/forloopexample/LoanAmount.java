package forloopexample;

import java.util.Scanner;

public class LoanAmount {

	public static void main(String[] args) {

		double loanAmount = 0;
		System.out.println("Enter Loan Amount");
		Scanner sc = new Scanner(System.in);
		loanAmount = sc.nextDouble();
		for (int i = 1; i <= 3; i++) {

			double payment = .1 * loanAmount;
			loanAmount = loanAmount - payment;
			System.out.println("Remaining amount after month " + i + " is $" + loanAmount);

		}
		sc.close();
	}
}
