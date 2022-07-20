package missionMoon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Simulation {
	String[] readLine;
	String[] itemname = new String[15];
	int[] weight = new int[15];
	int i = 0;
	boolean canAdd;

	public ArrayList loadItems() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:/Users/my pc/Desktop/ItemList.txt"));
		while (sc.hasNext()) {

			readLine = sc.nextLine().split("=");
			itemname[i] = readLine[0];
			weight[i] = Integer.valueOf(readLine[1]);
			i++;
		}
		ArrayList<Item> itemlist = new ArrayList<Item>();
		for (int k = 0; k < itemname.length; k++) {
			itemlist.add(new Item(itemname[k], weight[k]));
		}

		return itemlist;
	}

	public ArrayList loadU1(ArrayList itemList) {
		ArrayList<R1> listR1 = new ArrayList<R1>();
		int i = 0;
		int k = 0;
		do {
			listR1.add(new R1());
			do {

				listR1.get(k).carry((Item) itemList.get(i));
				i++;
				if (i >= 15) {
					break;
				}

			} while (listR1.get(k).canCarry((Item) itemList.get(i)));
			k++;
		} while (i < 15);
		return listR1;

	}

	public ArrayList loadU2(ArrayList itemList) {
		ArrayList<R2> listR2 = new ArrayList<R2>();
		int i = 0;
		int k = 0;

		do {
			listR2.add(new R2());
			do {

				listR2.get(k).carry((Item) itemList.get(i));
				i++;
				if (i >= 15) {
					break;
				}

			} while (listR2.get(k).canCarry((Item) itemList.get(i)));
			k++;
		} while (i < 15);

		return listR2;
	}

	public void runSimulation(ArrayList list) {
		int totalBudget = 0;
		int i = 0;
		Rocket rockets;
		do {
			do {
				rockets = (Rocket) list.get(i);
				totalBudget = rockets.costInMillion + totalBudget;

			} while (!(rockets.launch() && rockets.land()));
			i++;
		} while (i < list.size());
		if (list.get(0) instanceof R1) {
			System.out.println("Total cost of  in R1 fleet, phase 1:${" + totalBudget + "}");
		} else {
			System.out.println("Total cost of  in R2 fleet, phase 1:${" + totalBudget + "}");
		}
	}
}
