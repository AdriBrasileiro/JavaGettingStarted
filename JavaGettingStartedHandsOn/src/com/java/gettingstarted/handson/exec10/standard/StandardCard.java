package com.java.gettingstarted.handson.exec10.standard;

import com.java.gettingstarted.handson.exec10.GameCard;

public class StandardCard extends GameCard implements Comparable<StandardCard> {

	private Face card;
	private Suit suit;

	StandardCard(Face card, Suit suit) {
		super(card.alias() + " of " + suit.alias());
		this.card = card;
		this.suit = suit;
	}

	public String suitAlias() {
		return this.suit.alias();
	}

	public String suitSymbol() {
		return this.suit.symbol();
	}

	public int suitOrder() {
		return this.suit.ordinal();
	}

	public String alias() {
		return this.card.alias();
	}

	public String symbol() {
		return this.card.symbol();
	}

	public int value() {
		return this.card.value();
	}

	public int order() {
		return this.card.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((card == null) ? 0 : card.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		StandardCard other = (StandardCard) obj;
		if (card != other.card)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StandardCard [card=" + card + ", suit=" + suit + "]";
	}

	@Override
	public int compareTo(StandardCard otherCard) {
		if (this.card.value() != otherCard.card.value()) {
			return Integer.valueOf(this.card.value()).compareTo(otherCard.card.value());
		}

		return 0;
	}

}
