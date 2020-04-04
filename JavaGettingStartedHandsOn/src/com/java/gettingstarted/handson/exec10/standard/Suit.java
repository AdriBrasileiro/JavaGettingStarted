package com.java.gettingstarted.handson.exec10.standard;

enum Suit {

	/* */
	JOKER("Joker","\u1F0CF"),
	/* */
	DIAMONDS("Diamonds","\u2666"),
	/* */
	SPADES("Spades","\u2660"),
	/* */
	HEARTS("Hearts","\u2665"),
	/* */
	CLUBS("Clubs","\u2663");

	private String alias;
	private String symbol;

	private Suit(String alias, String symbol) {
		this.alias = alias;
		this.symbol = symbol;
	}

	public String alias() {
		return this.alias;
	}
	
	public String symbol() {
		return this.symbol;
	}
}