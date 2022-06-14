package classandmethod;

import java.util.Scanner;

public class person {

	public static void main(String[] args) {
		AmusementParkRide person1=new AmusementParkRide();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of person in cm:");
		double heightInputed=sc.nextDouble();
		System.out.println("Enter the weight of the person in kg:");
		double weightInputed=sc.nextDouble();
	
	boolean isPersonAllowed=person1.eligibleToRide(heightInputed,weightInputed);
		System.out.println("The person is allowed to ride: "+ isPersonAllowed);

	}

}
