package classandmethod;

import java.util.Scanner;

public class person {

	public static void main(String[] args) {
		AmusementParkRide person1=new AmusementParkRide();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of person in cm:");
		person1.height=sc.nextDouble();
		System.out.println("Enter the weight of the person in kg:");
		person1.weight=sc.nextDouble();
	
	boolean isPersonAllowed=person1.eligibleToRide();
		System.out.println("The person is allowed to ride: "+ isPersonAllowed);

	}

}
