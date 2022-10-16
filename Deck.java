package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	   // Getter
	   public List<Card> getFreshDeck() {
		   List<Card> cardDeck = new ArrayList<Card>();
			cardDeck.add(new Card() .setCard("Ace of Diamonds", 14));
			cardDeck.add(new Card() .setCard("Ace of Hearts ", 14));
			cardDeck.add(new Card() .setCard("Ace of Clubs", 14));
			cardDeck.add(new Card() .setCard("Ace of Spades", 14));
			cardDeck.add(new Card() .setCard("King of Diamonds", 13));
			cardDeck.add(new Card() .setCard("King of Hearts ", 13));
			cardDeck.add(new Card() .setCard("King of Clubs", 13));
			cardDeck.add(new Card() .setCard("King of Spades", 13));
			cardDeck.add(new Card() .setCard("Queen of Diamonds", 12));
			cardDeck.add(new Card() .setCard("Queen of Hearts ", 12));
			cardDeck.add(new Card() .setCard("Queen of Clubs", 12));
			cardDeck.add(new Card() .setCard("Queen of Spades", 12));
			cardDeck.add(new Card() .setCard("Jack of Diamonds", 11));
			cardDeck.add(new Card() .setCard("Jack of Hearts ", 11));
			cardDeck.add(new Card() .setCard("Jack of Clubs", 11));
			cardDeck.add(new Card() .setCard("Jack of Spades", 11));
			cardDeck.add(new Card() .setCard("10 of Diamonds", 10));
			cardDeck.add(new Card() .setCard("10 of Hearts ", 10));
			cardDeck.add(new Card() .setCard("10 of Clubs", 10));
			cardDeck.add(new Card() .setCard("10 of Spades", 10));
			cardDeck.add(new Card() .setCard("9 of Diamonds", 9));
			cardDeck.add(new Card() .setCard("9 of Hearts ", 9));
			cardDeck.add(new Card() .setCard("9 of Clubs", 9));
			cardDeck.add(new Card() .setCard("9 of Spades", 9));
			cardDeck.add(new Card() .setCard("8 of Diamonds", 8));
			cardDeck.add(new Card() .setCard("8 of Hearts ", 8));
			cardDeck.add(new Card() .setCard("8 of Clubs", 8));
			cardDeck.add(new Card() .setCard("8 of Spades", 8));
			cardDeck.add(new Card() .setCard("7 of Diamonds",7));
			cardDeck.add(new Card() .setCard("7 of Hearts ", 7));
			cardDeck.add(new Card() .setCard("7 Ace of Clubs", 7));
			cardDeck.add(new Card() .setCard("7 of Spades", 7));
			cardDeck.add(new Card() .setCard("6 of Diamonds", 6));
			cardDeck.add(new Card() .setCard("6 of Hearts ", 6));
			cardDeck.add(new Card() .setCard("6 of Clubs", 6));
			cardDeck.add(new Card() .setCard("6 of Spades", 6));
			cardDeck.add(new Card() .setCard("5 of Diamonds", 5));
			cardDeck.add(new Card() .setCard("5 of Hearts ", 5));
			cardDeck.add(new Card() .setCard("5 of Clubs", 5));
			cardDeck.add(new Card() .setCard("5 of Spades", 5));
			cardDeck.add(new Card() .setCard("4 of Diamonds", 4));
			cardDeck.add(new Card() .setCard("4 of Hearts ", 4));
			cardDeck.add(new Card() .setCard("4 of Clubs", 4));
			cardDeck.add(new Card() .setCard("4 of Spades", 4));
			cardDeck.add(new Card() .setCard("3 of Diamonds", 3));
			cardDeck.add(new Card() .setCard("3 of Hearts ", 3));
			cardDeck.add(new Card() .setCard("3 of Clubs", 3));
			cardDeck.add(new Card() .setCard("3 of Spades", 3));;
			cardDeck.add(new Card() .setCard("2 of Diamonds", 2));
			cardDeck.add(new Card() .setCard("2 of Hearts ", 2));
			cardDeck.add(new Card() .setCard("2 of Clubs", 2));
			cardDeck.add(new Card() .setCard("2 of Spades", 2));
			return cardDeck;
	   }
	   
	public List<Card> shuffle(List<Card> cardDeck) {
		Collections.shuffle(cardDeck);
		return cardDeck;
	}
	public Card draw(List<Card> cardDeck) {
		int i = 0;
		Card drawCard = cardDeck.get(i);
		System.out.println("player 1 draws " + drawCard.getName());
		cardDeck.remove(i);
		i++;
		return drawCard;
		
	}
	public Card draw2(List<Card> cardDeck) {
		int i = 0;
		Card drawCard2 = cardDeck.get(i);
		System.out.println("player 2 draws " + drawCard2.getName());
		cardDeck.remove(i);
		i++;
		return drawCard2;
		
	}
	}
		

	

