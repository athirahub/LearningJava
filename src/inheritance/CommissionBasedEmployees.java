package inheritance;

public class CommissionBasedEmployees extends Employee {
	double sales;
	
	public CommissionBasedEmployees(String firstName, String lastName, String sinNumber, double salary,double salesAmount) {
		super(firstName,lastName,sinNumber,salary);
		if(salesAmount>=0) {//only if salesamount positive sales variable will be initialised//
		this.sales=salesAmount;	
	}
	}
	@Override
	public double calculatePay() {
		double biweeklySalary = 0;
		if(sales>0) {
			 biweeklySalary=getSalary()/24+.15*sales;
		}if(sales==0) {
			biweeklySalary=getSalary()/24;
			
		}
		return salaryAfterTax(biweeklySalary) ;//biweeklysalary after tax is returned//
	}
}
