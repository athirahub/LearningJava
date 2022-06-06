package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ListOfDays {

	public static void main(String[] args) {

		String[] daysInAWeek = { "5", "2", "3", "4", "5", "6", "7", "5" };

		System.out.println("Days in a week " + Arrays.toString(daysInAWeek));

		System.out.println("Length of Array =" + daysInAWeek.length);

		int counter = 0;
		int index = 0;

		for (int i = 0; i < daysInAWeek.length; i++) {

			if (daysInAWeek[i].equals("5")) {
				index = i;
				counter++;
				System.out.println("Index at which 5 is stored : " + index);
			}
		}
		System.out.println("5 exists in array this no of times " + counter);

		System.out.println("Enter index values already printed above :");
		Scanner sc = new Scanner(System.in);
		int indexValue = 0;
		int[] indexArray = new int[counter];
		for (int i = 0; i < counter; i++) {

			indexValue = sc.nextInt();
			indexArray[i] = indexValue;
		}
		System.out.println("5 exists at indexs " + Arrays.toString(indexArray));
		sc.close();
	}
}
