package missionMoon;

import java.util.Random;

public class R1 extends Rocket {

	Random random = new Random();
	int randomfailpercent;

	public R1() {
		super(100, 10, 18, 0, 8);
	}

	public boolean launch() {

		randomfailpercent = random.nextInt(100);
		if (randomfailpercent > 5 * (cargocarried / cargolimit)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean land() {
		randomfailpercent = random.nextInt(100);
		if (randomfailpercent > 1 * (cargocarried / cargolimit)) {
			return true;
		} else {

			return false;
		}

	}

	@Override
	public String toString() {
		return "R1 [weightInTonnes=" + weightInTonnes + ", cargocarried=" + cargocarried + "]";
	}
}
