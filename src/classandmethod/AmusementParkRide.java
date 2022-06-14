package classandmethod;

public class AmusementParkRide {
	double height;
	double weight;

	boolean eligibleToRide(double actualHeight, double actualWeight) {
		height = actualHeight;
		weight = actualWeight;

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
