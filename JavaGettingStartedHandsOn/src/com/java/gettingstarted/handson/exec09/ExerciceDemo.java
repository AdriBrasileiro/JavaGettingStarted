package com.java.gettingstarted.handson.exec09;

public class ExerciceDemo {

	public static void main(String[] args) {
		System.out.println("-- Running nested do-while loop Demo\n");

		String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds" };
		String[] cards = { "King", "Queen", "Jack", "10", "Ace", "9", "8", "7", "6", "5", "4", "3", "2" };

		int i = 0;
		while (i < suits.length) {
			System.out.println("* Listing " + suits[i] + " deck: ");
			int j = 0;
			do {
				if (cards[j].equals("Ace")) {
					System.out.println("*** Card: " + cards[j] + " of " + suits[i++]); // increase suit index
					System.out.println("");
					j = cards.length; // cards index must be restarted for the next suit
				}
			} while (j++ < cards.length);
		}
	}
}
