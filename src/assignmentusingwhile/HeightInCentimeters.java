package assignmentusingwhile;

import java.util.Scanner;

public class HeightInCentimeters {

	public static void main(String[] args) {
		double heightInFeet = 0;// program where user input height in 2 parts:feet &inches and get result in
								// cm//
		double heightInInches = 0;
		System.out.println("Enter height of person in feet");
		System.out.println("Enter inches part of height of person");
		Scanner sc = new Scanner(System.in);
		heightInFeet = sc.nextDouble();
		heightInInches = sc.nextDouble();
		double heightInCm = 30.48 * heightInFeet + 2.54 * heightInInches;
		System.out.println("Height of person in centimeters is " + heightInCm);

	}

}
