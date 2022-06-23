package classprograms;

import java.util.Arrays;

public class FinalInvoice {

	public static void main(String[] args) {

		Product milk = new Product("milk", 4, "milk2%");
		Product bread = new Product("bread", 3, "wheatbread");
		Product chicken = new Product("chicken", 13, "whole");
		Product egg = new Product("egg", 4, "brown");
		Product banana = new Product("banana", 0.7, "ripened");
		Product orange = new Product("orange", 3, "african");
		Product cheese = new Product("cheese", 5, "shredded");
		Product curd = new Product("curd", 3, "plain");
		Product cream = new Product("cream", 2, "whipped");
		Product rice = new Product("rice", 20, "brown");
		
		
		Product[]productList= {milk,bread,chicken,egg,banana,orange,cheese,curd,cream,rice};
		
		
		Invoice newinvoice = new Invoice();
		double []quantity= {5,4,3,2};
		newinvoice.generateInvoice(productList, quantity);

	}

}
