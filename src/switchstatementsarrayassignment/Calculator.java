package switchstatementsarrayassignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double firstNumber = 0;
		double secondNumber = 0;
		String operationToBeDone = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  first number:");// declared 3 variables for 3 inputs and initialised with default
													// values//
		firstNumber = sc.nextDouble();
		System.out.println("Enter second number:");
		secondNumber = sc.nextDouble();
		System.out.println("Enter operation to be performed:Addition,Substraction,Multiplication,Division:");
		operationToBeDone = sc.next();// dynamically inputed values of 3 variables from console//
		double result = 0;
		switch (operationToBeDone) {// based on value of variable the corresponding case block will be executed if
									// value doesnt match any case default case will be executed//
		case "Addition": {
			result = firstNumber + secondNumber;
			System.out.println("The addition of inputed numbers gives result of: " + result);
			break;
		}
		case "Substraction": {
			result = firstNumber - secondNumber;
			System.out.println("The substraction of inputed numbers gives result of: " + result);
			break;
		}
		case "Multiplication": {
			result = firstNumber * secondNumber;
			System.out.println("The multiplication of inputed numbers gives result of: " + result);
			break;
		}
		case "Division": {
			result = firstNumber / secondNumber;
			System.out.println("The division of inputed numbers gives result of: " + result);
			break;
		}

		default: {
			System.out.println("Invalid entry");
		}
			sc.close();
		}

	}
}
