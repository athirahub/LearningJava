package classquestion;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Traveler person1=new Traveler("Youth");
		Traveler object=person1.travellertype();//depenting on prestocard type the persons fare is calculated//
		System.out.println(object.calculateFare());//
		
		
		
		
	}

}
