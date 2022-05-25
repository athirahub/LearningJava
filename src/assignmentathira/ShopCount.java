package assignmentathira;

public class ShopCount {

	public static void main(String[] args) {
		int peopleWithin = 40;
		int maxPeopleAllowed = 50;
		int peopleWaiting = 19;
		int peopleLeft = 2;
		while (peopleWithin < maxPeopleAllowed) {
			int peopleCanEnter = maxPeopleAllowed - peopleWithin + peopleLeft;
			if (peopleCanEnter >= peopleWaiting) {
				peopleWithin = peopleWithin - peopleLeft + peopleWaiting;
				System.out.println("People Within is :" + peopleWithin);
			} else {
				peopleWithin = peopleWithin + peopleCanEnter - peopleLeft;
				System.out.println("People Within is :" + peopleWithin);
			}

		}
		System.out.println("Maximum Capacity Reached");
	}

}
		