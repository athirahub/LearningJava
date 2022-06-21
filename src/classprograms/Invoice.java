package classprograms;

public class Invoice {
	void generateInvoice(Product item,int quantity) {
		System.out.println("Item"+"     "+"quantity");
		System.out.println(item.name+"       "+quantity);
		System.out.println("Total amount $"+item.pricePerUnit*quantity);
		
	}

}
