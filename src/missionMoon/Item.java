package missionMoon;

public class Item {

	String name;
	int weight;

	public Item(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", weight=" + weight + "]";
	}

}
