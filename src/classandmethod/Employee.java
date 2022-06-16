package classandmethod;

public class Employee {
	String firstName;
	String lastName;
	double hourlyRate;

	void weeklySalaryCalculate(double workedHours) {
		double weeklySalary=0;
		
		
		if (workedHours < 0) {//to rule out invalid hour entry//
			System.out.println("Invalid entry");
			
		} else if (workedHours == 0) {
			System.out.println("Employee hasnt worked ,so no salary");
			
		} else if (workedHours > 44) {//overtime pay if employee worked more than 44h//
			
			double additionalHours = workedHours - 44;
			workedHours = 44;
			 weeklySalary = workedHours * hourlyRate + additionalHours * hourlyRate * 1.5;
			System.out.println("Weekly Salary of employee is :$ "+weeklySalary);
		}else {
		
		weeklySalary = workedHours * hourlyRate;
		System.out.println("Weekly Salary of employee is :$ "+weeklySalary);

	}
}
}
