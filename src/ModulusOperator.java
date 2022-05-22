
public class ModulusOperator {

	public static void main(String[] args) {
		double utilityHouse$ = 585;
		double utilityTenant = .2 * utilityHouse$/3;//20% of house utility by tenants//There are 3 tenants//
		System.out.println("utility bill payable by tenant is $" + utilityTenant);
		double monthlyRent$=1000;
		double totalRentByTenant=monthlyRent$+utilityTenant;
		double amountReceivedAsRental=totalRentByTenant*3;
		System.out.println("The Total Rent Paid By Each Tenant is $ "+ totalRentByTenant);
		System.out.println("The Amount Received By Landlord from tenants as rental is $ "+ amountReceivedAsRental);
		utilityTenant=(.2*utilityHouse$)%3;

		

	}

}
