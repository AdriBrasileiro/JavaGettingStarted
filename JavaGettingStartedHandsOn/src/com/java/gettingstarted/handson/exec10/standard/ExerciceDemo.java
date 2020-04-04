package com.java.gettingstarted.handson.exec10.standard;

public class ExerciceDemo {

	public static void main(String[] args) {
		System.out.println("-- Running cards Demo\n");

		StandardDeck deck = new StandardDeck();
		for (StandardCard standardCard : deck.allCards()) {
			System.out.println("Card :: " + standardCard.toString());
		}
	}
}
