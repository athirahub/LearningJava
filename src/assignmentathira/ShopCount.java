package assignmentathira;

public class ShopCount {

	public static void main(String[] args) {
		int peopleWithin = 40;//program to maintain count of people in shop to 50//
		int maxPeopleAllowed = 50;
		int peopleWaiting = 4;
		int peopleLeft = 2;
		while (peopleWithin - peopleLeft < maxPeopleAllowed && peopleWithin >= peopleLeft) {//added the condition peopleWithin>=peopleLeft to prevent infinite -ve values loop to appear//
			int peopleCanEnter = maxPeopleAllowed - peopleWithin + peopleLeft;//varible created to avoid overfilling of shop//
			if (peopleWaiting == peopleLeft) {//break needed otherwise infinite loop will appear//
				System.out.println("People Within Will Remain Constant:" + peopleWithin);
				break;
			} else if (peopleCanEnter >= peopleWaiting) {//if more people can enter than who are actually waiting all people waiting can be allowed//
				peopleWithin = peopleWithin - peopleLeft + peopleWaiting;
				System.out.println("People Within is :" + peopleWithin);
			} else if (peopleCanEnter < peopleWaiting) {//if people waiting is greater than people who can enter cant allow everyone to enter//
				peopleWithin = peopleWithin + peopleCanEnter - peopleLeft;
				System.out.println("People Within is :" + peopleWithin);
			} if (peopleWithin == maxPeopleAllowed) {//whenever people within has reached max capacity of 50 print max capacity reached//
				System.out.println("Maximum Capacity Reached");
				break;

			}
		}
		if (peopleWithin < peopleLeft) {
			System.out.println("Invalid input people leaving  cant be greater than people within the store");
		}
		if (peopleWithin - peopleLeft >= maxPeopleAllowed)//if the people within the shop has reached above its maxcapacity //
			System.out.println("Maximum Capacity Reached");
	}
}
//scenarios considered-1)if people within>50 & people entering=people leaving,2)people within>50 & people entering>people leaving,3)peoplewithin>50 & people entering<people leaving//
//1)people within=50 &people entering=people leaving,2)people within=50 & people entering>people leaving,3)people within=50& people entering<people leaving//
//1)people within<50 people entering=people leaving,people within<50 & people entering>people leaving,people within<50 & peopleentering<people leaving//