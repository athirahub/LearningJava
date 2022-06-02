package assignmentusingwhile;

import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		double num = 0;// num is the number user wants to enter//
		double count = 0;// it is the count of numbers entered, initially will be 0//
		boolean isUserEntering = true;// variable to check whether user wants to continue entering numbers//
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the number ");
			System.out.println("Does user wants to continue entering number:True or False");
			num = sc.nextDouble();
			isUserEntering = sc.nextBoolean();// reassigning value with input obtained from console//
			count = count + 1;

		} while (isUserEntering);

		System.out.println("The count of numbers entered is :" + count);

	}
}