package guessgame;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) throws FileNotFoundException {
		Game movies = new Game();
		Scanner sc = new Scanner(System.in);
		movies.displaymovienames();
		movies.displaytitle();
		int counter = 0;
		do {
			System.out.println("\n" + "Guess a letter:");
			String Selectedletter = sc.next();
			Selectedletter = Selectedletter.toLowerCase();

			if (Selectedletter.length() == 1 && !(Selectedletter.chars().allMatch(Character::isDigit))) {
				counter = movies.guessgameplay(Selectedletter);
				if (movies.hasGuessedRight()) {
					break;
				}
			} else {
				System.out.println("Invalid entry ,Valid input 1 letter at a time ");

			}

		} while (counter < 10 && !(movies.hasGuessedRight()));

		if (!movies.hasGuessedRight()) {
			System.out.println("Ooops! you lost.");
		} else {
			System.out.println("You win!");
			System.out.println(" You have guessed " + movies.getSelectmovie() + " correctly");

			System.out.println("asamak :GuessTheMovie asser$");
		}
	}
}
