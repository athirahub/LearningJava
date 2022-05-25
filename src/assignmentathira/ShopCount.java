package assignmentathira;

public class ShopCount {

	public static void main(String[] args) {
		int peopleWithin = 1;
		int maxPeopleAllowed = 50;
		int peopleWaiting = 42;
		int peopleLeft = 1;
		while (peopleWithin - peopleLeft < maxPeopleAllowed && peopleWithin >= peopleLeft) {
			int peopleCanEnter = maxPeopleAllowed - peopleWithin + peopleLeft;
			if (peopleWithin==maxPeopleAllowed) {
				System.out.println("Maximum Capacity Reached");
				break;
			} else if (peopleCanEnter >= peopleWaiting) {
				peopleWithin = peopleWithin - peopleLeft + peopleWaiting;
				System.out.println("People Within is :" + peopleWithin);
			} else {
				peopleWithin = peopleWithin + peopleCanEnter - peopleLeft;
				System.out.println("People Within is :" + peopleWithin);
			}
		}

		if (peopleWithin - peopleLeft >= maxPeopleAllowed)
			System.out.println("Maximum Capacity Reached");
	}
}
