package classandmethod;

public class Park {

	public static void main(String[] args) {
		AmusementParkRide rollerCoaster=new AmusementParkRide();
		Person amaya=new Person();
		amaya.height=90;
		amaya.weight=40;
		
		rollerCoaster.eligibleToRide(amaya.height,amaya.weight);

	}

}
