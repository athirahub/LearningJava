package guessgame;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) throws FileNotFoundException {
		Game movies=new Game();
		Scanner sc=new Scanner(System.in);
		movies.displaymovienames();
		movies.displaytitle();
		int counter=0;
		do {
		System.out.println("\n"+"Guess a letter:");
		String Selectedletter=sc.next();
		if(Selectedletter.length()==1) {
		 counter=movies.guessgameplay(Selectedletter);
		 if(counter>=200) {
			 break;
		 }
		}else {
			System.out.println("Invalid entry ,Only can enter 1 letter at a time ");
			
		}
		
		
	     }while(counter<10&&!(movies.hasGuessedRight()));
		
		if(counter<200) {
			System.out.println("Ooops! you lost.");
		}
}
}
