package classprograms;

public class LaptopTypes {

	public static void main(String[] args) {
		
		Laptop ideapad=new Laptop();
		ideapad.laptopName="Lenovo";
		ideapad.ramSize=8;
		ideapad.processorType="3050e";
		
		Laptop stream14=new Laptop();
		stream14.initialise("Hp", 4, "3020e");
		Laptop fhd=new Laptop("Asus",8,"3700U");
	}

}
