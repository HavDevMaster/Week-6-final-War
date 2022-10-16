
package War;

import java.util.ArrayList;
import java.util.List;

public class App {


	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		//int playerTotalScore = player.p1Score();
		List<Card> newDeck = deck.getFreshDeck();
		newDeck = deck.shuffle(newDeck);
		
		List<Card> player1Hand = player1.Hand(newDeck);
		List<Card> player2Hand = player2.Hand2(newDeck);
		
	    
		for (int x = 0; x < 26; x++) {
			Card p1Card = deck.draw(player1Hand);
			Card p2Card = deck.draw2(player2Hand);
			if (p1Card.getValue() > p2Card.getValue()) {
				System.out.println("Player 1 wins the round!");
				player1.score += 1;
				System.out.println();
				System.out.println("Player Scores: ");
				System.out.println("Player 1: " + player1.score);
				System.out.println("Player 2: " + player2.score);
				System.out.println();
			} else if (p1Card.getValue() < p2Card.getValue()) { 
				System.out.println("Player 2 wins the Round");
				player2.score += 1;
				System.out.println();
				System.out.println("Player Scores: ");
				System.out.println("Player 1: " + player1.score);
				System.out.println("Player 2: " + player2.score);
				System.out.println();
			} else {
				System.out.println("The round is a tie");
				System.out.println();
				System.out.println("Player Scores: ");
				System.out.println(player1.score);
				System.out.println(player2.score);
				System.out.println();
			}
			
		}
		
		if(player1.score > player2.score) {
			System.out.println("Player 1 Wins");
			System.out.println("Player 1: " + player1.score);
			System.out.println("Player 2: " + player2.score);

		} else if (player1.score < player2.score)  {
			System.out.println("Player 2 Wins");
			System.out.println("Player 1: " + player1.score);
			System.out.println("Player 2: " + player2.score);

		} else {
			System.out.println("It's a Draw");
			System.out.println("Player 1: " + player1.score);
			System.out.println("Player 2: " + player2.score);
		}
		
	}
}

