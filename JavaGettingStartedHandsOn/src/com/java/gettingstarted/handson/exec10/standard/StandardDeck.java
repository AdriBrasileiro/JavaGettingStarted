package com.java.gettingstarted.handson.exec10.standard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck {

	private List<StandardCard> clubs;
	private List<StandardCard> diamonds;
	private List<StandardCard> hearts;
	private List<StandardCard> spades;
	private List<StandardCard> jokers;
	private int deckSize;

	public StandardDeck() {
		this.clubs = StandardDeck.initSuit(Suit.CLUBS);
		this.deckSize += this.clubs.size();

		this.diamonds = StandardDeck.initSuit(Suit.DIAMONDS);
		this.deckSize += this.diamonds.size();

		this.hearts = StandardDeck.initSuit(Suit.HEARTS);
		this.deckSize += this.hearts.size();

		this.spades = StandardDeck.initSuit(Suit.SPADES);
		this.deckSize += this.spades.size();

		this.jokers = StandardDeck.initJoker(2);
		this.deckSize += this.jokers.size();

	}

	public List<StandardCard> clubsCards() {
		return Collections.unmodifiableList(this.clubs);
	}

	public List<StandardCard> diamondsCards() {
		return Collections.unmodifiableList(this.diamonds);
	}

	public List<StandardCard> heartsCards() {
		return Collections.unmodifiableList(this.hearts);
	}

	public List<StandardCard> spadesCards() {
		return Collections.unmodifiableList(this.spades);
	}

	public List<StandardCard> jokers() {
		return Collections.unmodifiableList(this.jokers);
	}

	public List<StandardCard> allCards() {
		List<StandardCard> allCards = new ArrayList<>();
		allCards.addAll(this.clubs);
		allCards.addAll(this.diamonds);
		allCards.addAll(this.hearts);
		allCards.addAll(this.spades);
		allCards.addAll(this.jokers);
		return allCards;
	}

	public int size() {
		return this.deckSize;
	}

	private static List<StandardCard> initSuit(Suit suit) {
		List<StandardCard> list = new ArrayList<>();
		for (Face card : Face.values()) {
			if (card != Face.JOKER) {
				StandardCard stdCard = new StandardCard(card, suit);
				list.add(stdCard);
			}
		}
		return list;
	}

	private static List<StandardCard> initJoker(int amount) {
		List<StandardCard> list = new ArrayList<>();
		Face joker = Face.JOKER;
		Suit suit = Suit.JOKER;

		for (int i = 0; i < amount; i++) {
			StandardCard stdCard = new StandardCard(joker, suit);
			list.add(stdCard);
		}
		return list;
	}

}
