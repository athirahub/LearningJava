
public class IncrementOperators {

	public static void main(String[] args) {
		double perHourRate = 13.56;
		int hoursWorkedPerYear = 40 * 52;// 52 weeks per year,40 h per week(8h per day//
		double annualSalary = perHourRate * hoursWorkedPerYear;
		System.out.println("Annual Salary for 2021 is $" + annualSalary);
		perHourRate++;
		annualSalary = perHourRate * hoursWorkedPerYear;
		System.out.println("Annual Salary for 2022 is $" + annualSalary);
		perHourRate += 5;
		annualSalary = perHourRate * hoursWorkedPerYear;
		System.out.println("Annual Salary for 2023 is $" + annualSalary);
		perHourRate *= 5;
		annualSalary = perHourRate * hoursWorkedPerYear;
		System.out.println("Annual Salary for 2024 is $" + annualSalary);

	}

}
