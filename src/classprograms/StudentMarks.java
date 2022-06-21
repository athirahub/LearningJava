package classprograms;

public class StudentMarks {

	public static void main(String[] args) {
		Student ram=new Student("Ram",40,56.5,67,58,89);
		
		
		System.out.println("Total percentage obtained by "+ram.name+ " is :"+ram.percentageCalculate()+"%");
		

	}

}
