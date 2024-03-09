package week05;

public class Card {

	public String name;
	public String suit;
	public int value;

	public Card() {}

	public Card(String name, String suit, int value ) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

	public void describe() {
		System.out.println(name);
		System.out.println("Suit: " + suit);
		System.out.println("Value: " + value);	
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	

}
