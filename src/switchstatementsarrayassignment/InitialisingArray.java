package switchstatementsarrayassignment;

import java.util.Arrays;
import java.util.Scanner;

public class InitialisingArray {

	public static void main(String[] args) {
		int[] ages = new int[3];// In this case the int array is declared and initialised with length of array.
								// The values will be initialised with default values of datatype int so value
								// will be 0.//
		System.out.println(Arrays.toString(ages));
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ages.length; i++) {
			System.out.println("Enter the age:");
			ages[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(ages));
		int[] age = { 45, 23, 12, 20 };// array can be initialised with exact values while its being
										// declared using initialisation block//
		System.out.println(Arrays.toString(age));
		sc.close();
	}

}
