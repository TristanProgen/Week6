package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	

	// Builds a standard deck of 52 card objects with 4 suits and 4 types of face cards in each suit 
	Deck () {
		
		
		 String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
		 String [] faceCards = {"Jack", "Queen", "King", "Ace"};
		
		
		System.out.println("\n" + "\n" + "********************************************************" + "\n" + "\t" +
		"Building a new Deck " + "\n" + "********************************************************"  );
		
		
		
		// for each card suit (Hearts, Clubs, Spades, Diamonds) add all the numbered cards (2-10) to the deck 
		for(String suit : suits ) {
			

			for(int i = 2; i < 11; i ++) {
				String title = String.valueOf(i);
				String cardNameString = title + " of " + suit;
				cards.add(new Card(cardNameString, i));
				
				
			}
			// add the face cards to the deck for each suit (Hearts, Clubs, Spades, Diamonds) 
			for(int i = 11; i <=14; i ++) {
				 String faceName = faceCards[i - 11] + " of " + suit;
				cards.add(new Card(faceName, i));
				
			}
			
			
			
		
		}
	
		// print the new deck to console after it is built 
		Deck.this.describe();
		
	}
// Prints out the deck, randomizes the order of the cards, and then prints out the deck again to prove it was shuffled 
public void shuffleDeck() {
	System.out.println("********************************************************" + "\n" + "\t" +
			"Shuffeling the Deck " + '\n' + "********************************************************"  );
	
	System.out.println( "\n" + "********************************************************" + "\n" + "\t" +
			"Original Order " + '\n' + "********************************************************" + '\n' );
	
	// Prints out just the name of each card in the deck 
	for (Card card : this.cards) {
		System.out.println(card.getName() );	
		
	}
	// Randomizes the order of the cards in the deck 
	Collections.shuffle(this.cards);
	
	
	System.out.println("\n" + "********************************************************" + "\n" + "\t" +
			"After Shuffle " + '\n' + "********************************************************" + '\n' );
	
	// Prints the new order to prove the deck was shuffled 
	for (Card card : this.cards) {
		System.out.println(card.getName() );	
		
		}
	
	
	}

// Calls the describe method for each card in the deck 
public void describe() {
	for(Card card : this.cards) {
		card.describe();
		
	}
}
// Returns top card of the deck and removes it from the deck 
public  Card draw() {
	Card returnCard = this.cards.remove(0);
	
	return returnCard;
}
	
	
}
	

