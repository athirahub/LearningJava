package missionMoon;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Simulation mission = new Simulation();
		ArrayList<Item>itemlist = new ArrayList<Item>();
		try {
			itemlist= mission.loadItems();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList<Rocket>R1fleet =mission.loadU1(itemlist);
		ArrayList<Rocket>R2fleet= mission.loadU2(itemlist);
		mission.runSimulation(R1fleet);
		mission.runSimulation(R2fleet);
	}

}
