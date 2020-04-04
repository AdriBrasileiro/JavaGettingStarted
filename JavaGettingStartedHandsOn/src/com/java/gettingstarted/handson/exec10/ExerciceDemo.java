package com.java.gettingstarted.handson.exec10;

import com.java.gettingstarted.handson.exec10.standard.StandardCard;
import com.java.gettingstarted.handson.exec10.standard.StandardDeck;

public class ExerciceDemo {

	public static void main(String[] args) {
		System.out.println("-- Running cards Demo\n");

		StandardDeck deck = new StandardDeck();
		System.out.println("Deck size = " + deck.size() + " cards");
		for (StandardCard standardCard : deck.allCards()) {
			System.out.println("Card :: " + standardCard.toString());
		}

	}
}
