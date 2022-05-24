package assignmentathira;

public class ShopCount {

	public static void main(String[] args) {
		int peopleWithin = 20;
		int maxPeopleAllowed = 50;
		int peopleWaiting = 5;
		int peopleLeft = 2;

		int peopleCanEnter = maxPeopleAllowed - peopleWithin + peopleLeft;
		while ((peopleWithin + peopleWaiting - peopleLeft) <= 50) {
			peopleWithin = peopleWithin - peopleLeft +peopleWaiting;
			peopleCanEnter = maxPeopleAllowed - peopleWithin;
			System.out.println("People within:" + peopleWithin + ",People can enter:" + peopleCanEnter);
		}
		if (peopleCanEnter <= peopleWaiting) {
			peopleWithin = peopleWithin + peopleCanEnter;
			System.out.println("people within is :" + peopleWithin + " Maximum Capacity Reached");
		}

	}
}
