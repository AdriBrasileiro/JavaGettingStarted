package com.java.gettingstarted.handson.exec10.uno;

public class UnoColoredCard extends UnoCard implements Comparable<UnoColoredCard> {

	Number number;
	Color color;

	UnoColoredCard(Number number, Color color) {
		super(color.alias() + " " + number.alias() + " card");
		this.number = number;
		this.color = color;
	}

	public String color() {
		return this.color.alias();
	}

	public String alias() {
		return this.number.alias();
	}

	public String symbol() {
		return this.number.symbol();
	}

	public int value() {
		return this.number.value();
	}

	public int order() {
		return this.number.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		UnoColoredCard other = (UnoColoredCard) obj;
		if (number != other.number)
			return false;
		if (color != other.color)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UnoNumberedCard [number=" + number + ", color=" + color + "]";
	}

	@Override
	public int compareTo(UnoColoredCard otherCard) {
		if (this.number.value() != otherCard.number.value()) {
			return Integer.valueOf(this.number.value()).compareTo(otherCard.number.value());
		}

		return 0;
	}
}
