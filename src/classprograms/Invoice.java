package classprograms;

public class Invoice {
	void generateInvoice(Product[] item,double[] quantity) {
		System.out.println("Item"+"       "+"quantity"+"     "+"price");
		System.out.println(item[4].name+"         "+quantity[0]+"       "+item[4].pricePerUnit*quantity[0]);
		System.out.println(item[3].name+"            "+quantity[1]+"       "+item[3].pricePerUnit*quantity[1]);
		System.out.println(item[6].name+"         "+quantity[2]+"       "+item[6].pricePerUnit*quantity[2]);
		System.out.println(item[9].name+"           "+quantity[3]+"       "+item[9].pricePerUnit*quantity[3]);
		
		
		double result=item[4].pricePerUnit*quantity[0]+item[3].pricePerUnit*quantity[1];
		result=result+item[6].pricePerUnit*quantity[2]+item[9].pricePerUnit*quantity[3];
		
		System.out.println("          Subtotal:          $"+result);
		result=result+result*0.13;
		System.out.println("          Total Amount:     $"+result);
	}
		
}
