package inheritance;

public class Employee {
	private String firstName;
	private String lastName;
	private String sinNumber;
	private double salary;//basesalary (annual)//
	public Employee() {
		
	}
	public Employee(String firstName, String lastName, String sinNumber, double salary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNumber = sinNumber;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>=0) {
		this.salary = salary;
	}
	}
	public String getSinNumber() {
		return sinNumber;
	}
	public void setSinNumber(String sinNumber) {
		this.sinNumber = sinNumber;
	}
	public double calculatePay() {
		double biweeklySalary=salary/24;
		return salaryAfterTax(biweeklySalary);//returns the biweeklySalary after tax//
		
	}
	public double salaryAfterTax(double salary) {
		return salary-salary*.13;
		
	}

}
