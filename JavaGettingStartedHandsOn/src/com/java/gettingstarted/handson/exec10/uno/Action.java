package com.java.gettingstarted.handson.exec10.uno;

enum Action {
	/* */
	SKIP("Skip", "\u2205"),
	/* */
	REVERSE("Reverse", "\u21C4"),
	/* */
	DRAW_TWO("Draw Two", "D+2"),
	/* */
	WILD("Wild", "W"),
	/* */
	WILD_DRAW_FOUR("Wild Draw 4", "WD+4");

	private String alias;
	private String symbol;

	private Action(String alias, String symbol) {
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