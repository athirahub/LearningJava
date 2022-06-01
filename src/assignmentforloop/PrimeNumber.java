package assignmentforloop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 0;
		System.out.println("Enter number user wants to check");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int result = 0;
		if (number == 1) {
			System.out.println("Not A Prime Number");
		}
		if (number == 2) {
			System.out.println("Is a Prime Number");
		}

		for (int i = 2; i <= number - 1; i++) {// number is prime when it cant be divided by any number other than1 &
												// the number itself//so excluded 1 & number and used all numbers
												// between to divide number//
			result = number % i;// remainder of division is stored in variable result//

			if (result == 0) {// whenever the variable gives 0 ,then number is completely divisible and not
								// prime so will break out of loop//
				System.out.println("Not a prime number");
				break;
			}
		}
		if (result != 0)// result here is number%number-1//
			System.out.println(number + " Is A Prime Number");

	}

}
