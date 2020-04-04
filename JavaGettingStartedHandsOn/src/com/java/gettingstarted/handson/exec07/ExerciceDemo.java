package com.java.gettingstarted.handson.exec07;

public class ExerciceDemo {

	public static void main(String[] args) {
		System.out.println("-- Running enhanced for loop Demo\n");

		String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds" };
		String[] cards = { "Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2" };

		for (String suit : suits) {
			System.out.println("* Listing " + suit + " deck: ");
			for (String card : cards) {
				System.out.println("*** Card: " + card + " of " + suit);
			}
			System.out.println("");
		}
	}
}
