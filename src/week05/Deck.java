package week05;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	String [] suits = {"Hearts" , "Diamonds", "Spades", "Clubs"};
		
	
		for (String suit : suits) {
			for (int i=2; i<=14; i++) {
			
				StringBuilder name = new StringBuilder();
			
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
						name.append(String.valueOf(i) + " of " + suit);
						break;
					case 11:
						name.append("Jack of " + suit);
						break;
					case 12:
						name.append("Queen of " + suit);
						break;
					case 13:
						name.append("King of " + suit);
						break;
					case 14:
						name.append("Ace of " + suit);
						break;
					
					cards.add(new Card (name.toString(), suit, i));
					
			}
		}
	}
	
	
	
	
}

}