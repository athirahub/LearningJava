package switchstatementsarrayassignment;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneProducts {

	public static void main(String[] args) {
		String brandName = "";
		System.out.println("Enter phone brand name:SAMSUNG,GOOGLE or APPLE");
		Scanner sc = new Scanner(System.in);// variable brandName is declared and initialised to default value //
		brandName = sc.next();// value of brandName is dynamically inputed from console//
		switch (brandName) {// based on brandName corresponding cases will be executed//
		case "SAMSUNG": {
			String[] Samsung = { "S20", "S21", "Flip3", "Fold3" };
			System.out.println("Available products under Samsung are: " + Arrays.toString(Samsung));
			break;
		}
		case "GOOGLE": {
			String[] Google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
			System.out.println("Available products under Google are: " + Arrays.toString(Google));
			break;
		}
		case "APPLE": {
			String[] Apple = { "Iphone12", "Iphone12mini", "Iphone11", "Iphone11" };
			System.out.println("Available products under Apple are: " + Arrays.toString(Apple));
			break;
		}
		default: {
			System.out.println("Invalid Entry");
		}

		}
		sc.close();
	}

}
