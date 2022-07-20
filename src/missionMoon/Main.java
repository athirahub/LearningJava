package missionMoon;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Simulation mission = new Simulation();
		ArrayList listOfItems = null;
		try {
			listOfItems = mission.loadItems();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList R1fleet = mission.loadU1(listOfItems);
		ArrayList R2fleet = mission.loadU2(listOfItems);
		mission.runSimulation(R1fleet);
		mission.runSimulation(R2fleet);
	}

}
