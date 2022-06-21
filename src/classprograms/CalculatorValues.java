package classprograms;

public class CalculatorValues {

	public static void main(String[] args) {
		Calculator input = new Calculator();

		System.out.println("The multiplication of numbers 40 & 65 is :" + input.multiplication(40, 65));

		System.out.println("The addition of numbers 23 & 13 is :" + input.addition(23, 13));

		System.out.println("The substraction of numbers 467 & 32 is :" + input.substraction(467, 32));

		System.out.println("The division of numbers 68 & 29 are :" + input.division(68, 29));

	}

}
