package missionMoon;

public class Rocket implements SpaceShip {
	int costInMillion;
	int weightInTonnes;
	int maxWeightInTonnes;
	int cargocarried = 0;
	int cargolimit;

	public Rocket(int costInMillion, int weightInTonnes, int maxWeightInTonnes, int cargocarried, int cargolimit) {
		super();
		this.costInMillion = costInMillion;
		this.weightInTonnes = weightInTonnes;
		this.maxWeightInTonnes = maxWeightInTonnes;
		this.cargocarried = cargocarried;
		this.cargolimit = cargolimit;
	}

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		if (maxWeightInTonnes >= item.weight / 1000 + weightInTonnes) {

			return true;
		} else {
			return false;
		}
	}

	@Override
	public void carry(Item item) {
		weightInTonnes = item.weight / 1000 + weightInTonnes;
		cargocarried = cargocarried + item.weight / 1000;

	}

}
