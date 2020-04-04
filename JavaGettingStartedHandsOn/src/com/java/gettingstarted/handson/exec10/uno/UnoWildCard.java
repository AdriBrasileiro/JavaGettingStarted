package com.java.gettingstarted.handson.exec10.uno;

public class UnoWildCard extends UnoCard {

	Action action;

	UnoWildCard(Action action) {
		super(action.alias() + " card");
	}

	public String alias() {
		return this.action.alias();
	}

	public String symbol() {
		return this.action.symbol();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((action == null) ? 0 : action.hashCode());
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
		UnoWildCard other = (UnoWildCard) obj;
		if (action != other.action)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UnoActionCard [action=" + action + "]";
	}

}
