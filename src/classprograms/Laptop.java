package classprograms;

public class Laptop {
	String laptopName;
	int ramSize;
	String processorType;
	
	Laptop(){
	
	}
	
	void initialise(String name,int ram,String processor) {
		laptopName=name;
		ramSize=ram;
		processorType=processor;
	}
		
		Laptop(String laptopBrand,int sizeRam,String type){
			laptopName=laptopBrand;
			ramSize=sizeRam;
			processorType=type;
		}
		
	}


