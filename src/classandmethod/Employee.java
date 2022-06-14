package classandmethod;

public class Employee {
	String firstName;
	String lastName;
	double hourlyRate;

	double weeklySalaryCalculate(double workedHours) {
		
		
		if (workedHours < 0) {//to rule out invalid hour entry//
			System.out.println("Invalid entry");
			return workedHours;
		} else if (workedHours == 0) {
			System.out.println("Employee hasnt worked ,so no salary");
			return workedHours;
		} else if (workedHours > 44) {//overtime pay if employee worked more than 44h//
			double hoursWorked = workedHours;
			double additionalHours = hoursWorked - 44;
			hoursWorked = 44;
			double weeklySalary = hoursWorked * hourlyRate + additionalHours * hourlyRate * 1.5;
			return weeklySalary;
		}
		double hoursWorked = workedHours;
		double weeklySalary = hoursWorked * hourlyRate;
		return weeklySalary;

	}
}
