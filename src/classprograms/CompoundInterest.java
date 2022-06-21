package classprograms;

public class CompoundInterest {

	void calculateInterest(double principle, double rate, double duration) {
		double result = 1;
		for (int i = 1; i <= duration * 12; i++) {
			result = result * (1 + rate / 12);
		}
		double compoundInterest = principle * result;
		System.out.println("Investment balance after 10 years : $ " + compoundInterest);
	}

}
