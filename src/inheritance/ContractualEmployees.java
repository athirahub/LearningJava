package inheritance;

public class ContractualEmployees extends Employee {
	private double[] hours;//hours added as array as the biweekly salary has to be calculated//
	private double hourlyRate;

	public ContractualEmployees(String firstName, String lastName, String sinNumber, double salary, double[] hours,
			double hourlyRate) {
		super(firstName, lastName, sinNumber, salary);
		if (hourlyRate >= 0) {
			this.hourlyRate = hourlyRate;
		} else {
			System.out.println("hourly rate cant be negative ");
		}
		if (hours[0] >= 0 && hours[1] >= 0) {
			this.hours = hours;
		
		}else {
			System.out.println("Hours worked cant be negative");
		}
	}

	@Override
	public double calculatePay() {
		double biweeklySalary;
		double addHours = 0;

		for (int i = 0; i < hours.length; i++) {
			if (hours[i] > 40) {// hours of each week compared to see if greater than 40//
				addHours = addHours + (hours[i] - 40);
				hours[i] = 40;// if has worked more than 40 then extrahours stored as addhours//
			}
		}

		if (addHours == 0) {// if hasnt worked any add hours//
			biweeklySalary = (hours[0] + hours[1]) * hourlyRate;

		} else {
			biweeklySalary = addHours * 1.5 * hourlyRate + (hours[0] + hours[1]) * hourlyRate;
		}
		return salaryAfterTax(biweeklySalary);//invoking method salaryaftertax in parent class and returning biweeklysalary after tax//
	}

}
