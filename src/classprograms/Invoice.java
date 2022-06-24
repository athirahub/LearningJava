package classprograms;

public class Invoice {
	double result=0;

	void generateInvoice(Product[] item) {
		System.out.println("Item\tquantity\tprice");
		for (int i = 0; i < item.length; i++) {
			System.out.println(item[i].name + "\t\t" + item[i].quantity + "\t\t" + item[i].pricePerUnit * item[i].quantity);
			result = result + item[i].pricePerUnit * item[i].quantity;
		}

		System.out.println("          Subtotal:          $" + result);
		result = result + result * 0.13;
		System.out.println("          Total Amount:     $" + result);
	}
	//void calculateTax() {//commented it out as generateinvoice method itself is printing totalamt after tax .Added for if line no 14 and 15 are commented out//
		//result=result+result*0.13;//
		//System.out.println("Total Amount :"+result);//
	}

