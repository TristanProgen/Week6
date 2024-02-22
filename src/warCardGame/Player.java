package warCardGame;

import java.util.List;
import java.util.*;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	final String name;
	
	public Player (String name){
		this.name = name;
		this.score = 0;
		
		
	}
	// Describes info about player --> Name, Score, and lists all the cards in player's hand
	public void describe() {
		System.out.println( "\n" +  "\n" + "***************************************************" + "\n" + "\n" + "\t" 
	+ "Player Name :" + "\t" + this.name + "\n"
	+ "\t" + "Player Score :" + "\t" + this.score + "\n"
	+ "\t" + "**********************" + "\n" + "\t"  + "Cards in Player's Hand" 
	+ "\n" );
		for (Card card : this.hand) {
			card.describe();
			
		}
	}
	// Takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field 
	public void draw(Deck gameDeck) {
		Card cardDrawn = gameDeck.draw();
		this.hand.add(cardDrawn);
	}
	//Removes and returns the top card of the Hand and removes it from the players hand
	public Card flip() {
		Card playedCard = this.hand.remove(0);
		return playedCard;
		
	}
	// Used to increment the player score when they win a hand
	public void incrementScore() {
		this.score += 1;
		
	}
	// returns a list of the cards in the player's hand 
	public List<Card> getHand() {
		return this.hand;
	}
	
	// returns the player's current score 
	public int getScore() {
		return this.score;
	}
	// Only way we want to set the name is in the constructor 
	public String getName() {
		return this.name;
	}
	
	

}
