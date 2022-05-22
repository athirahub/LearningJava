package comparisonOperators;

public class authorizeBank {

	public static void main(String[] args) {
		String nameProvided = "shiny";
		String nameOnFile = "bobby";
		boolean areNamesMatching = nameProvided.equals(nameOnFile);
		double accountBalanceTold = 200;
		double accountBalanceReal = 230;
		boolean isAnswerCorrect = accountBalanceTold == accountBalanceReal;
		boolean isSecurityQuestionCorrect = true;

		if (areNamesMatching && isAnswerCorrect) {
			System.out.println("Authorized:");

		} else if (areNamesMatching && isSecurityQuestionCorrect) {
			System.out.println(" Authorized");
		} else if (isAnswerCorrect && isSecurityQuestionCorrect) {
			System.out.println("Authorized");
		} else {
			System.out.println("Sorry Not Authorized");
		}

	}
}
