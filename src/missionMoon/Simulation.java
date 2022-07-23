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

	public ArrayList<Item> loadItems() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:/Users/my pc/Desktop/ItemList.txt"));
		ArrayList<Item> itemlist = new ArrayList<Item>();
		while (sc.hasNext()) {

			readLine = sc.nextLine().split("=");
			itemname[i] = readLine[0];
			weight[i] = Integer.valueOf(readLine[1]);
			itemlist.add(new Item(itemname[i], weight[i]));
			i++;
		}

		// System.out.println(itemlist);
		return itemlist;
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> itemList) {
		ArrayList<Rocket> listR1 = new ArrayList<Rocket>();
		int i = 0;
		int k = 0;
		do {
			listR1.add(new R1());
			do {

				listR1.get(k).carry(itemList.get(i));
				i++;
				if (i >= 15) {
					break;
				}

			} while (listR1.get(k).canCarry(itemList.get(i)));
			k++;
		} while (i < 15);
		return listR1;

	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> itemList) {
		ArrayList<Rocket> listR2 = new ArrayList<Rocket>();
		int i = 0;
		int k = 0;

		do {
			listR2.add(new R2());
			do {

				listR2.get(k).carry(itemList.get(i));
				i++;
				if (i >= 15) {
					break;
				}

			} while (listR2.get(k).canCarry(itemList.get(i)));
			k++;
		} while (i < 15);

		return listR2;
	}

	public void runSimulation(ArrayList<Rocket> list) {
		int totalBudget = 0;
		int i = 0;
		while(i<list.size()) {
			if(!(list.get(i).launch())) {
				totalBudget=list.get(i).costInMillion + totalBudget;
				list.get(i).launch();
			}else {
				totalBudget=list.get(i).costInMillion + totalBudget;
				if(!list.get(i).land()) {
					list.get(i).launch();
				}else {
					
					i++;
					if(i<list.size()) {
					list.get(i).launch();
				}
			}
		}
		}

//		do {
//			do {
//
//				totalBudget = list.get(i).costInMillion + totalBudget;
//
//			} while (!(list.get(i).launch() && list.get(i).land()));
//			i++;
//		} while (i < list.size());
		if (list.get(0) instanceof R1) {
			System.out.println("Total cost for R1 fleet, phase 1:${" + totalBudget + " million}");
		} else {
			System.out.println("Total cost for R2 fleet, phase 1:${" + totalBudget + " million}");
		}
	}
}
