package enumExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.Spring;

public class EnumLearning {

	public static void main(String[] args) {
		Seasons currentSeason=Seasons.Spring;
		
		if(currentSeason.equals(Seasons.Spring)) {
			System.out.println("Spring is here!!!Most beautiful season");
		}
		switch (currentSeason) {
		case Spring:{
			
		System.out.println("Flowers everywhere");
			
			break;
			}
		
		case Autumn:{
			System.out.println("Leaves falling");
			break;
		}
		case Summer:{
			System.out.println("Stay outside! Enjoy");
		break;
		}
		case Winter:{
			System.out.println("Cold and Dark");
		break;
		}

		default:{
			break;
		}
	}
		for(Seasons fun: Seasons.values() ) {
			System.out.println(fun);
		}
		HashMap<Seasons,String> seasonlist=new HashMap<Seasons,String>();
		seasonlist.put(Seasons.Autumn, "Autumn");
		seasonlist.put(Seasons.Spring, "Spring");
		seasonlist.put(Seasons.Summer, "Summer");
		seasonlist.put(Seasons.Winter, "Winter");
		


}
}
