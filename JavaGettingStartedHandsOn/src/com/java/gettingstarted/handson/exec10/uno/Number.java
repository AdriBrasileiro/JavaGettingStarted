package com.java.gettingstarted.handson.exec10.uno;

enum Number {
	/* */
	ZERO("Zero", "0", 0),
	/* */
	ONE("One", "1", 1),
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
	NINE("Nine", "9", 9);

	private String alias;
	private String symbol;
	private int value;

	private Number(String alias, String symbol, int value) {
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