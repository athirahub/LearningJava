
public class IncrementVarible {

	public static void main(String[] args) {
		double heightM =1.60;
		double weightKg=60;
		heightM=heightM*heightM;
		double bodyMassIndex=weightKg/heightM;
		System.out.println("Body mass index is" + bodyMassIndex);
		boolean obese=false;
		obese=bodyMassIndex>25;
		System.out.println("The Person is obese according to BMI :"+obese);
		
		
		
		
		
		
		
	
	
			

	}

}
