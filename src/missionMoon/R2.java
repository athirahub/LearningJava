package missionMoon;

import java.util.Random;

public class R2 extends Rocket {

	Random random = new Random();
	int randomfailpercent;

	public R2() {
		super(120, 18, 29, 0, 11);
	}

	@Override
	public String toString() {
		return "R2 [weightInTonnes=" + weightInTonnes + ", cargocarried=" + cargocarried + "]";
	}

	public boolean launch() {
		randomfailpercent = random.nextInt(100);
		if (randomfailpercent > 4 * (cargocarried / cargolimit)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean land() {
		randomfailpercent = random.nextInt(100);
		if (randomfailpercent > 8 * (cargocarried / cargolimit)) {
			return true;
		} else {

			return false;
		}

	}
}
