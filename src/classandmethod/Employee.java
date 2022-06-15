package classandmethod;

public class Employee {
	String firstName;
	String lastName;
	double hourlyRate;

	void weeklySalaryCalculate(double workedHours) {
		
		
		if (workedHours < 0) {//to rule out invalid hour entry//
			System.out.println("Invalid entry");
			
		} else if (workedHours == 0) {
			System.out.println("Employee hasnt worked ,so no salary");
			
		} else if (workedHours > 44) {//overtime pay if employee worked more than 44h//
			double hoursWorked = workedHours;
			double additionalHours = hoursWorked - 44;
			hoursWorked = 44;
			double weeklySalary = hoursWorked * hourlyRate + additionalHours * hourlyRate * 1.5;
			System.out.println("Weekly Salary of employee is :$ "+weeklySalary);
		}else {
		double hoursWorked = workedHours;
		double weeklySalary = hoursWorked * hourlyRate;
		System.out.println("Weekly Salary of employee is :$ "+weeklySalary);

	}
}
}
