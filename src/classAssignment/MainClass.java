package classAssignment;

public class MainClass {

	public static void main(String[] args) {
		Employee employee = new Employee(89795,2000);
		CRA cra1=new CRA();
		Employee employee2=new Employee(3456,5000);
		
		System.out.println("Sin num :"+employee.getSinNumber());
		
		employee.setSinNumber(23456, cra1,6666);

		System.out.println("Sin num :"+employee.getSinNumber());
		
		employee.setSinNumber(342432,cra1,1234);
		
		System.out.println("Sin num :"+employee.getSinNumber());
		
		//only CRA can change the SIN Number
		
		employee.setSinNumber(23456, cra1,1234);

		System.out.println("Sin num :"+employee.getSinNumber());
		
		
	}

}
