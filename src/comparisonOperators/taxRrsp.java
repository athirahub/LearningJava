package comparisonOperators;

public class taxRrsp {

	public static void main(String[] args) {
		double rrspAmount=11000;
		double rrspLimit=13000;
		boolean isContributeWithinLastDay=true;
		boolean hassubmittedReceipt=true;
		
		boolean isEligibleForReturn=rrspAmount<=rrspLimit && isContributeWithinLastDay && hassubmittedReceipt;
		System.out.println("Person Eligible For Tax Return:"+ isEligibleForReturn);
		

	}

}
