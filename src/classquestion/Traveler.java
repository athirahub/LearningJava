package classquestion;

public class Traveler {
	String prestocardType;
	double fare=3.10;
	
	
	public Traveler travellertype() {
		if(prestocardType.equals("Youth")){
			return new Youth();
			
		}else {
			return new Adult();
		}
	}
	
	
	public Traveler() {
		super();
	}


	public Traveler(String prestocardType) {
		super();
		this.prestocardType = prestocardType;
	}


	public double calculateFare() {
		return fare;
	}

}
