package guessgame;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) throws FileNotFoundException {
		Game movies=new Game();
		Scanner sc=new Scanner(System.in);
		movies.displaymovienames();
		movies.displaytitle();
		int counter;
		do {
		System.out.println("\n"+"Guess a letter:");
		 counter=movies.guessgameplay(sc.next());
		 if(counter>=200) {
			 break;
		 }
		
		
	     }while(counter<10&&!(movies.hasGuessedRight()));
		
		if(counter<200) {
			System.out.println("Ooops! you lost.");
		}
}
}
