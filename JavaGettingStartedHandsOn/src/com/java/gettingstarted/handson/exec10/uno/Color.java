package com.java.gettingstarted.handson.exec10.uno;

enum Color {

	/* */
	BlUE("Blue"),
	/* */
	GREEN("Green"),
	/* */
	YELLOW("Yellow"),
	/* */
	RED("Red");

	private String alias;

	private Color(String alias) {
		this.alias = alias;
	}

	public String alias() {
		return this.alias;
	}
}