package classprograms;

public class CalculatorValues {

	public static void main(String[] args) {
		Calculator input=new Calculator(20,45.5);
		
		input.multiplication();
		System.out.println("The multiplication of numbers 20 & 40.5 is :"+ input.multiplication());
		
		input.addition();
		System.out.println("The addition of numbers 20 & 40.5 is :"+ input.addition());
		
		input.substraction();
		System.out.println("The substraction of numbers 20 & 40.5 is :"+input.substraction());
		
		input.division();
		System.out.println("The division of numbers 20 & 40.5 are :"+input.division());

	}

}
