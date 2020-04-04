package com.java.gettingstarted.handson.exec06;

public class ExerciceDemo {

	public static void main(String[] args) {
		System.out.println("-- Running for loop Demo\n");

		String[] suit = { "Hearts", "Spades", "Clubs", "Diamonds" };
		String[] card = { "Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2" };

		for (int i = 0; i < suit.length; i++) {
			System.out.println("* Listing " + suit[i] + " deck: ");
			for (int j = 0; j < card.length; j++) {
				System.out.println("*** Card: " + card[j] + " of " + suit[i]);
			}
			System.out.println("");
		}
	}
}
