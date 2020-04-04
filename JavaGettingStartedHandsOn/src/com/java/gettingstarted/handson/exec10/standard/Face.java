package com.java.gettingstarted.handson.exec10.standard;

enum Face {
	/* */
	JOKER("Jocker", "*", 0),
	/* */
	ACE("Ace", "A", 1),
	/* */
	TWO("Two", "2", 2),
	/* */
	TRHEE("Three", "3", 3),
	/* */
	FOUR("Four", "4", 4),
	/* */
	FIVE("Five", "5", 5),
	/* */
	SIX("Six", "6", 6),
	/* */
	SEVEN("Seven", "7", 7),
	/* */
	EIGHT("Eight", "8", 8),
	/* */
	NINE("Nine", "9", 9),
	/* */
	TEN("Ten", "10", 10),
	/* */
	JACK("Jack", "J", 11),
	/* */
	QUEEN("Queen", "Q", 12),
	/* */
	KING("King", "K", 13);

	private String alias;
	private String symbol;
	private int value;

	private Face(String alias, String symbol, int value) {
		this.alias = alias;
		this.symbol = symbol;
		this.value = value;
	}

	public String alias() {
		return this.alias;
	}

	public String symbol() {
		return this.symbol;
	}
	
	public int value() {
		return this.value;
	}

}