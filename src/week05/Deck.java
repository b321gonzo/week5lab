package week05;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<Card>(52);
	
	
	String [] suits = {"Hearts" , "Diamonds", "Spades", "Clubs"};
	
	int c = 0;
	for (String s : suits) {
		for (int i=2; i<=14; i++) {
			
			cards.get(c).setSuit(s);
			
			cards.get(c).setValue(i);
			
			switch (i) {
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					cards.get(c).setName(String.valueOf(i) + " of " + s);
				break;
				case 11:
					cards.get(c).setName("Jack of " + s);
				break;
				case 12:
					cards.get(c).setName("Queen of " + s);
				break;
				case 13:
					cards.get(c).setName("King of " + s);
					break;
				case 14:
					cards.get(c).setName("Ace of " + s);
					break;
			}
			c++;
		}
	}
	
}

