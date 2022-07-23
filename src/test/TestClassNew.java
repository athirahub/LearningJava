package test;

public class TestClassNew {

	public static void main(String[] args) {
		double perHourRate=20;//print annual and take home salary between years 2021-2030,if per hour rate less than 50 and employee is full time it increases by twice //
		//if employee part time  per hour rate  will increase by 1,if perhour rate <=50 it will increase by 1 irrespective of employment status//
		int year=2021;
		String statusOfEmployment="Full Time";
		String employmentStatus1="Part Time";
		String employmentStatus2="Full Time";
		boolean hasEmployeeQuit=false;
		if(hasEmployeeQuit) {
			System.out.println("Person Has Quit");
		}

		double annualSalary=perHourRate*40*52;
		double takeHomeSalary=annualSalary-.13*annualSalary;
		System.out.println("Annual Salary for "+ year +" is: $ "+annualSalary);
		System.out.println("Take Home Salary for "+ year+" is: $ "+takeHomeSalary);
		while (year<2030&& !hasEmployeeQuit) {
			
			if(perHourRate<50&& statusOfEmployment.equals(employmentStatus2)) {
			perHourRate*=2;
			year++;
			annualSalary=perHourRate*40*52;
			takeHomeSalary=annualSalary-.13*annualSalary;
			System.out.println("Annual Salary & Take Home Salary for "+ year +" is $ "+annualSalary +"& $" + takeHomeSalary);
			}else if(perHourRate>=50 &&perHourRate<70|| statusOfEmployment.equals(employmentStatus1)) {
				perHourRate++;
				year++;
				annualSalary=perHourRate*40*52;
				takeHomeSalary=annualSalary-.13*annualSalary;
				System.out.println("Annual Salary & Take Home Salary for "+ year +" is $"+ annualSalary+"& $"+ takeHomeSalary);
			}else {
				year++;
				System.out.println("Annual & Take Home Salary for " +year +" till 2030 will be :$ "+annualSalary +"& $"+takeHomeSalary);
				break;
				
			}
		}
	

	
	}

}