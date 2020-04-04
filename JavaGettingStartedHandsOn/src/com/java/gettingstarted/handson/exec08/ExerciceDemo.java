package com.java.gettingstarted.handson.exec08;

public class ExerciceDemo {

	public static void main(String[] args) {
		System.out.println("-- Running nested while loops Demo\n");

		String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds" };
		String[] cards = { "King", "Queen", "Jack", "10", "Ace", "9", "8", "7", "6", "5", "4", "3", "2" };

		int i = 0;
		while (i < suits.length) {
			System.out.println("* Listing " + suits[i] + " deck: ");
			int j = 0;
			while (j < cards.length) {
				if (cards[j].equals("Ace")) {
					System.out.println("*** Card: " + cards[j] + " of " + suits[i++]); // increase suit index
					System.out.println("");
					break;
				}
				++j; // increase card index since Ace was not found
			}
		}
	}
}
