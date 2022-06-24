package classprograms;

import java.util.Arrays;

public class FinalInvoice {

	public static void main(String[] args) {

		Product milk = new Product("milk", 4, "milk3%",4);
		Product bread = new Product("bread", 3, "wheatbread",1);
		Product chicken = new Product("chicken", 13, "whole",1);
		Product egg = new Product("egg", 4, "brown",2);
		Product banana = new Product("banana", 0.7, "ripened",5);
		Product orange = new Product("orange", 3, "african",2);
		Product cheese = new Product("cheese", 5, "shredded",6);
		Product curd = new Product("curd", 3, "plain",3);
		Product cream = new Product("cream", 2, "whipped",1);
		Product rice = new Product("rice", 20, "brown",3);

		Product[] productList = { milk, bread, chicken, egg, banana, orange, cheese, curd, cream, rice };
		// Product[]productList=new Product[10];//
		// productList[0]=new Product("milk",4,"milk3%);//
		

		//productList[4].showvalue();//

		Invoice newinvoice = new Invoice();
		
		newinvoice.generateInvoice(productList);
		//newinvoice.calculateTax();//

	}

}
