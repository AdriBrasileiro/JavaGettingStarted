package com.java.gettingstarted.handson.exec10.uno;

public class UnoColoredAction extends UnoCard {

	Action action;
	Color color;

	UnoColoredAction(Action action, Color color) {
		super(action.alias() + " card");
		this.action = action;
	}

	public String color() {
		return this.color.alias();
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
		UnoColoredAction other = (UnoColoredAction) obj;
		if (action != other.action)
			return false;
		if (color != other.color)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UnoNumberedCard [action=" + action + ", color=" + color + "]";
	}

}
