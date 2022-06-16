package classandmethod;

public class Rectangle {
	double length;
	double breadth;

	double calculateArea(double actualLength, double actualBreadth) {
		if (actualLength <= 0 || actualBreadth <= 0) {// added to avoid invalid entry//
			System.out.println("Invalid entry");
			return 0.0;
		}

		
		double area = actualLength * actualBreadth;
		return area;
	}

}
