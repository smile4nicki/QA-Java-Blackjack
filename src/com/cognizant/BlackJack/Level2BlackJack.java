package com.cognizant.BlackJack;

public class Level2BlackJack {
public static void main(String[] args) {
	int card1 = 22;
	int card2 = 21;
	System.out.println(twentyOne(card1, card2));
}
public static int twentyOne(int card1, int card2) {
	int result = 0;
	if (card1 <= 21 && card2 < card1)  {
		result = card1;
	} else if (card2 <= 21 && card1 < card2) {
		result = card2;
	} else if (card1 <= 21 && card2 > 21) {
		result = card1;
	} else if (card1 > 21 && card2 <= 21) {
		result = card2;
	} else if (card1 > 21 && card2 > 21) {
		result = 0;
	}
	return result;
}
}

