package guessgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

	Random random = new Random();
	int randomInt;
	String[] moviename = new String[25];
	String selectmovie;
	int lettermatch = 0;
	int noTries = 0;
	char[] characters;
	String[] value;
	char[] enteredletter = new char[10];// to store incorrectly enterd letters//
	boolean hasalreadyentered;

	public Game() {
		super();
	}

	public void displaymovienames() throws FileNotFoundException {
		// creating obj file of File class,passing location of file as argument//
		// scanner reading from file as string and populating moviename array//
		File file = new File("C:/Users/my pc/Desktop/gamemovies.txt");
		Scanner scan = new Scanner(file);
		for (int i = 0; i < 25; i++) {
			moviename[i] = scan.nextLine();
		}
	}

	public void displaytitle() {

		randomInt = random.nextInt(moviename.length);
		selectmovie = moviename[randomInt];
		// selecting a random movie ,splitting to string array when encounterd space//

		String[] mystring = selectmovie.split(" ");

		// converting the string array to string//
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < mystring.length; i++) {
			sb.append(mystring[i]);
		}
		selectmovie = sb.toString();

		// converting string to char array and printing_ for every character//populating
		// value array with underscores//
		characters = selectmovie.toCharArray();
		value = new String[selectmovie.length()];

		for (int k = 0; k < selectmovie.length(); k++) {
			value[k] = "_";
		}

		System.out.println("\n" + "asamak :GuessTheMovie asser$ Java GuessTheMovie");
		System.out.print("You are guessing:");
		System.out.print(Arrays.toString(value).replace("[", "").replace("]", "").replace(",", " "));

		System.out.println("\nYou have guessed 0 incorrect letters:");

	}

	public int guessgameplay(String ch) {

		// checking character array to see if there is an element with value of
		// ch(converting ch to char//
		// if matched replace underscore in that index position of value array with ch//
		//  checking whether entered letter has already been replaced
		// before if then it will be considered wrong ans//
		hasalreadyentered = false;
		if (Arrays.toString(value).contains(ch)) {
			hasalreadyentered = true;
		}
		
		

		for (int k = 0; k < selectmovie.length(); k++) {
			if ((characters[k] != ch.charAt(0))) {

			} else {
				if (!hasalreadyentered) {
					value[k] = ch;
					lettermatch++;
				}
			}
		}

		// checking if user has guessed movie completely,if true,return to main class//

		// if the letter guessed is wrong that ch stored as entered letter and noTries
		// incremented//
		boolean isrepeat = false;
		if (lettermatch == 0) {
			if (Arrays.toString(enteredletter).contains(ch)) {
				isrepeat = true;
			}

			if (!isrepeat) {
				enteredletter[noTries] = ch.charAt(0);
				noTries++;
			}
		}

		// if user hasnt completed 10 incorrect tries then value array will be
		// printed,no of wrong letters enterd and their list shown //
		if (noTries < 10 && !hasGuessedRight()) {

			System.out.println("\n" + Arrays.toString(value).replace("[", "").replace("]", "").replace(",", " "));
			System.out.print("\nYou have guessed (" + noTries + ") wrong letters: ");
			if (noTries != 0) {
				System.out.print(Arrays.toString(enteredletter).replace("[", "").replace("]", "").replace(",", " ")
						.replace("null", " ").trim());

			}
		}
		lettermatch = 0;
		return noTries;
	}

	public boolean hasGuessedRight() {
//returns true only if value array has been completely populated with characters instead of underscores/all letters guessed right//
		if (Arrays.toString(value).contains("_")) {
			return false;
		} else {
			return true;
		}
	}

	public String getSelectmovie() {
		return selectmovie;
	}

}
