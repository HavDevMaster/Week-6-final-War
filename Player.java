package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
		Deck hand = new Deck();
		Integer score = 0;
		String name = "";
		int i = 0;
		
		
public List<Card> Hand(List<Card> player1Deck) {
	   List<Card> newDeck = new ArrayList<Card>();
	   Integer half = 26;
	   Integer counter = 0;
	   for(Card cardIndex:player1Deck) {
		   if(counter < half) {
			   newDeck.add(cardIndex);
			   counter++;
		   }
	   }
	return newDeck;


}
public List<Card> Hand2(List<Card> player1Deck) {
	   List<Card> newDeck2 = new ArrayList<Card>();
	   Integer full = 51;
	   Integer counter = 0;
	   
	   for(Card cardIndex:player1Deck) {
		   if (counter >= 26) {
			   newDeck2.add(cardIndex);
		   }
		   counter++;
	   }
	   
	   
	   
	   
	
	return newDeck2;


}
}

