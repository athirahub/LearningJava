package comparisonOperators;

public class houseEligibility {

	public static void main(String[] args) {
		boolean isJobEligible = false;
		double downAmountAvailable = 100000;
		double downAmountRequired = 20000;
		boolean isRich = true;
		if (isJobEligible && (downAmountAvailable >= downAmountRequired)) {
			System.out.println("Eligible To Buy House");
		} else if (isRich && (downAmountAvailable >= downAmountRequired)) {
			System.out.println("Eligible To Buy House");
		} else {
			System.out.println("Ineligible To Buy House");
		}
	}

}
