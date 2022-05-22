package assignment3;

public class SalaryPrint {

	public static void main(String[] args) {
		int perHourRate$ = 14;
		int hoursPerDay = 8;
		int daysWorkedPerWeek = 5;
		int weeklySalary = perHourRate$ * hoursPerDay * daysWorkedPerWeek;
		System.out.println("WeeklySalary is $" + weeklySalary);
		double takeHomeWeeklySalary = weeklySalary - (weeklySalary * (0.1));// tax deducted 10%//
		System.out.println("TakeHomeWeeklySalary is $" + takeHomeWeeklySalary);

	}

}
