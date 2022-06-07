package switchstatementsarrayassignment;

import java.util.Arrays;
import java.util.Scanner;

public class ProductSelection {

	public static void main(String[] args) {
		String brandName = "";
		System.out.println("Enter phone brand name:Samsung,Google or Apple");
		Scanner sc = new Scanner(System.in);
		brandName = sc.next();
		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] google = { "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" };
		String[] apple = { "Iphone12", "Iphone12mini", "Iphone11", "Iphone11" };
		String selectedProduct = "";// variable selectedProduct is for user to select phone from list//
		int counter = 0;
		switch (brandName) {
		case "Samsung": {

			System.out.println("Available products under Samsung are: " + Arrays.toString(samsung));
			System.out.println("Enter the selected product from list:");
			selectedProduct = sc.next();// value of selectedProduct dynamically inputed//
			for (int i = 0; i < samsung.length; i++) {// for comparing the user selected product with elements of
														// samsung array //

				if (selectedProduct.equals(samsung[i])) {// each elements of array are compared with variable selected
															// product//
					System.out.println("Product Selected is:" + samsung[i]);// if condition satisfied printing out
																			// selected product//
					counter++;
					break;
				}
			}
			if (counter == 0) {// counter will be 0 if "if block" hasnt been executed even once,i.e if user
								// inputed product is not from list//
				System.out.println("Please select a product from the list");// error message displayed//
			}
			break;// break statement used to prevent execution of other cases//
		}
		case "Google": {

			System.out.println("Available products under Google are: " + Arrays.toString(google));
			System.out.println("Enter the selected product from list:");
			selectedProduct = sc.next();
			for (int j = 0; j < google.length; j++) {
				if (selectedProduct.equals(google[j])) {
					System.out.println("Product selected is: " + google[j]);
					counter++;
					break;
				}
			}
			if (counter == 0) {
				System.out.println("Please select a product from the list");
			}
			break;
		}
		case "Apple": {

			System.out.println("Available products under Apple are: " + Arrays.toString(apple));

			System.out.println("Enter the selected product from list:");
			selectedProduct = sc.next();
			for (int k = 0; k < apple.length; k++) {
				if (selectedProduct.equals(apple[k])) {
					System.out.println("Product selected is :" + apple[k]);
					counter++;
					break;
				}
			}
			if (counter == 0) {
				System.out.println("Please select a product from the list");
			}
			break;
		}
		default: {
			System.out.println("Invalid Entry");
		}
			sc.close();
		}
	}
}
