package com.java.gettingstarted.handson.exec10.standard;

import java.util.Comparator;

public class TrucoCardComparator implements Comparator<StandardCard> {

	@Override
	public int compare(StandardCard card1, StandardCard card2) {
		if (card1.suitOrder() != card2.suitOrder()) {
			return Integer.valueOf(card1.suitOrder()).compareTo(card2.suitOrder());
		}

		if (card1.order() != card2.order()) {
			return Integer.valueOf(card1.order()).compareTo(card2.order());
		}

		return 0;
	}

}
