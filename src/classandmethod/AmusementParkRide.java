package classandmethod;

public class AmusementParkRide {
	

	boolean eligibleToRide(double height,double weight) {
		

		if (height < 90 || height > 200) {
			System.out.println("Not allowed to ride");
			return false;
		} else if (weight < 15 || weight > 95) {
			System.out.println("Not allowed to ride");
			return false;
		}

		System.out.println("Allowed To Ride");
		return true;
	}

}
