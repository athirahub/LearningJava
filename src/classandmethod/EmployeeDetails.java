package classandmethod;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee person1 = new Employee();
		person1.firstName = "Himallal";
		person1.lastName = "Theyyil";
		person1.hourlyRate = 15.5;
		System.out.println("First Name of employee: " + person1.firstName);
		System.out.println("Last Name of employee is :" + person1.lastName);
		System.out.println("Hourly salary rate of employee is: $ " + person1.hourlyRate);
		System.out.println("Enter the no of hours worked by employee in a week:");
		Scanner sc = new Scanner(System.in);
		double hours = sc.nextDouble();
		double salaryWeekly = person1.weeklySalaryCalculate(hours);
		if (hours> 0) {
			System.out.println("Weekly Salary of employee is $ " + salaryWeekly);
		
			
		}

	}
}
