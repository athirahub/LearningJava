package classprograms;

public class LaptopTypes {

	public static void main(String[] args) {
		
		Laptop ideapad=new Laptop();
		ideapad.laptopName="Lenovo";
		ideapad.ramSize=8;
		ideapad.processorType="IntelCorei7";
		
		Laptop stream14=new Laptop();
		stream14.initialise("Hp", 4, "IntelCorei5");
		Laptop zenbook=new Laptop("Asus",8,"IntelCorei5");
	}

}
