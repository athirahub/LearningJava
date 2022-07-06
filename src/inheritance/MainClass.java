package inheritance;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		double greatest=0;
		double smallest=0;
		String highestEarningEmployee="";
		String lowestEarningEmployee="";
		PermanantEmployees sunny=new PermanantEmployees("sachin","sunny","234564567",40000);
		PermanantEmployees vijay=new PermanantEmployees("ram","vijay","12345234",50000);
		PermanantEmployees ravi=new PermanantEmployees("kishore","ravi","45678903",70000);
		double[] hourbasi= {30,40};
		double[]hourmathew= {40,34};
		double[]hourvictor= {32,45};
		double[]hourKaur= {45,43};
		ContractualEmployees basi=new ContractualEmployees("siddharth", "basi", "23456789", 38000, hourbasi, 20);
		ContractualEmployees mathew=new ContractualEmployees("shalini","mathew",  "45673214", 1340000, hourmathew, 70);
		ContractualEmployees victor=new ContractualEmployees("sam", "victor", "56789345", 32640, hourvictor, 17);
		ContractualEmployees kaur=new ContractualEmployees("gauhar", "kaur", "89678903", 48000, hourKaur, 25);

		CommissionBasedEmployees xavier=new CommissionBasedEmployees("sandra", "xavier", "67890543",50000, 130);
		CommissionBasedEmployees baby=new CommissionBasedEmployees("jas", "baby", "90432386",70000, 11);
		CommissionBasedEmployees jacob=new CommissionBasedEmployees("arinze", "jacob", "32785415",40000, 500);
		
		
		Employee[] employeeArray= {sunny,vijay,ravi,basi,mathew,victor,kaur,xavier,baby,jacob};
		double[]salary=new double[10];
		smallest=sunny.calculatePay();
		for(int i=0;i<employeeArray.length;i++) {
			salary[i]=employeeArray[i].calculatePay();
			
			if(salary[i]>greatest) {
				greatest=salary[i];
				highestEarningEmployee=employeeArray[i].getFirstName();
			}if(salary[i]<smallest) {
				smallest=salary[i];
				lowestEarningEmployee=employeeArray[i].getFirstName();
			}
		}
		System.out.println("Employee with highest salary:"+highestEarningEmployee);
		System.out.println(Arrays.toString(salary));
		System.out.println("Employee with least salary:"+lowestEarningEmployee);
	}

}
