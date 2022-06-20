package classprograms;

public class Student {
	String name;
	double marksMaths;
	double marksPhysics;
	double marksChemistry;
	double marksComputer;
	double marksEnglish;
	
	Student(){
		
	}
	
	
	Student(String person,double maths,double physics,double chemistry,double computer,double english){
		name=person;
		marksMaths=maths;
		marksPhysics=physics;
		marksChemistry=chemistry;
		marksComputer=computer;
		marksEnglish=english;
		}
	
	double percentageCalculate() {
		double totalpercentage=(marksMaths+marksChemistry+marksComputer+marksEnglish+marksPhysics)*0.2;
		return totalpercentage;
	}

}
