package assignment4;

public class ShopEntry {

	public static void main(String[] args) {
		int peopleWithin = 20;
		int maxPeopleAllowed = 50;
		int peopleWaiting = 3;
		int peopleCanEnter = maxPeopleAllowed - peopleWithin;
		while (peopleWithin + peopleWaiting < maxPeopleAllowed) {
			peopleWithin = peopleWithin + peopleWaiting;
			peopleCanEnter = maxPeopleAllowed - peopleWithin;
			System.out.println("People within:" + peopleWithin + ",People can enter:" + peopleCanEnter);
		}
		if (peopleCanEnter <= peopleWaiting) {
			peopleWithin = peopleWithin + peopleCanEnter;
			System.out.println("people within is :" + peopleWithin + " Maximum Capacity Reached");
		}

	}
}
