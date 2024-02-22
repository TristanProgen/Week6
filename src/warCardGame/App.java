package warCardGame;

public class App {

	public static void main(String[] args) {
		
		System.out.println("**********************************************************************" + "\n" + "\t" +
		"Lets Play a Game of WAR " + "\n" +
		"**********************************************************************"	);
		
		// Build a game deck 
		Deck gameDeck = new Deck();
		
		System.out.println("\n"+ "\n" + "**********************************************************************" + "\n" + "\t" +
				"Adding Players " + "\n" +
				"**********************************************************************" + "\n" + "\n"	);
		
		// add 2 players 
		Player player1 = new Player("Tango");
		player1.describe();
		Player player2 = new Player("Cash");
		player2.describe();
		
		// shuffle the deck
		gameDeck.shuffleDeck();
		
		
		System.out.println("**********************************************************************" 
		+ "\n" + "\t" +"\n" + "\t" + " After the deck is shuffled the players draw their cards"  + "\n" +  "\n" +
		"**********************************************************************" +"\n" );
		
		
		// deal out the cards ( for WAR we split the deck between the 2 players so 26 cards each )
		for(int i = 1; i <= 52; i ++ ) {
			if (i % 2 == 0) {
				player2.draw(gameDeck);
				System.out.println("\t" +"\n" + player2.getName() + " draws a card and adds it to their hand " + "\n" + "\t" + "they now have " 
				+ player2.getHand().size() + " cards in their hand" );
				
			} else {
				player1.draw(gameDeck);
				System.out.println("\t" +"\n" + player1.getName() + " draws a card and adds it to their hand " + "\n" + "\t" + "they now have " 
						+ player1.getHand().size() + " cards in their hand" );
				
			}
			
			
		}
		// list each  player's  name , their score, and the cards in their hand 
		player1.describe();
		player2.describe();
		
		System.out.println("**********************************************************************" 
				+ "\n" + "\t" +"\n" + "\t" + " Lets Begin!"  + "\n" + "\n" +
				"**********************************************************************"  );
		
		
		// each player takes turns playing a card. Player with the highest value wins the hand and earns a point 
		
		for (int i = 0; i < 26; i ++) {
			
			
			
		
			
			System.out.println("\n" + "\n" + "**********************************************************************" + "\n" 
					+ "\n" + "\t" +  "\n" + "\t" + String.valueOf(i + 1)  + numSuffix(i + 1) + " Hand" + "\n"
					+ "\n" + "\t" + "1..."
					+ "\n" + "\t" + "2..." 
					+ "\n" + "\t" + "3..." 
					+ "\n" + "\t" + "FLIP!!!" 
					+ "\n" );
			
			
			
			// each player flips the top card in their hand
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			
			// we print out what card each player played using Card.describe() 
			System.out.println("\t" + player1.getName() + " Plays the... ");
			player1Card.describe();
			System.out.println("\n");
			
			System.out.println("\t" + player2.getName() + " Plays the... ");
			player2Card.describe();
			System.out.println("\n");
			
		
			
			// Player with the highest value wins and player.score is incremented 
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println("\n" + "\t" + player1.getName() + " Wins this hand! One Point awarded to " + player1.getName());
				System.out.println("\n" + "\t" + player1.getName() + "'s current score is ..." + "\t" + player1.getScore());
				System.out.println("\n" + "\t" + player2.getName() + "'s current score is ..." + "\t" + player2.getScore());
				
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
				System.out.println("\n" + "\t" + player2.getName() + " Wins this hand! One Point awarded to " + player2.getName());
				System.out.println("\n" + "\t" + player1.getName() + "'s current score is ..." + "\t" + player1.getScore());
				System.out.println("\n" + "\t" + player2.getName() + "'s current score is ..." +  "\t" + player2.getScore());
			
				
			// no points are awarded for a tie 	
			} else { System.out.println("\t" + "\n" + " Tie! No Points Awarded, No Winner This Hand! ");
				
			}		
			
			
			
		}
		
		// When the players run out of cards  to flip (the loop executes 26 times) the player with the highest score wins 
		if (player1.getScore() > player2.getScore()) {
			
			System.out.println("\n" + "**********************************************************************" + "\n" + "\n");
			
			// Player 1 wins
			System.out.println("\t" + "And the winner of the Game of WAR is..." + "\n" + "\n" +
			"\t" + "\n" + "\t" + "Player 1  : " + player1.getName());
			
			
			// Each player's final score is printed at the end of the game 
			System.out.println("\n" + "\n" + "\t" + player1.getName() + " : " + player1.getScore()  );
			System.out.println("\n" + "\n" + "\t" + player2.getName() + " : " + player2.getScore()  );
			System.out.println("\n" + "**********************************************************************" + "\n" + "\n");
			
			
		} else if (player1.getScore() < player2.getScore())	{
			
			System.out.println("\n" + "**********************************************************************" + "\n" + "\n");
			
			// Player 2 wins 
			System.out.println("\t" + "And the winner is..." + "\n" + "\n" +
			"\t" + "\n" +  "\t" + "Player 2  : " + player2.getName());
			
			// Each player's final score is printed at the end of the game 
			System.out.println("\n" + "\n" + "\t" + player1.getName() + " : " + player1.getScore()  );
			System.out.println("\n" + "\n" + "\t" + player2.getName() + " : " + player2.getScore()  );
			System.out.println("\n" + "**********************************************************************" + "\n" + "\n");
		
		
			// Its a tie no one wins 
		} else {
			System.out.println("\n" + "**********************************************************************" + "\n" + "\n");
			System.out.println("\t" + "And the winner is..." + "\n" + "\n" +
					"\t" + "\n"  + "\t" + "Draw" + "\n" + "\t"  + "No one wins it is a tie!");
			
			System.out.println("\n" + "\n" + "\t" + player1.getName() + " : " + player1.getScore()  );
			System.out.println("\n" + "\n" + "\t" + player2.getName() + " : " + player2.getScore()  );
			System.out.println("\n" + "**********************************************************************" + "\n" + "\n");
			
		}
		
		
				
	}
	

// helper method to add the correct  ending when printing out a count
	private static String  numSuffix(int num) {
		  
		
	           
	       if (num % 10 == 3 && num  !=13){
	    	  
	    	   return "rd";
	    	   
	       }  else if (num % 10 == 2 && num  != 12) {
	    	   
	    	   return "nd";
	    	   
	       }  else if (num % 10 == 1 && num  != 11) {
	    	   
	    	   return "st";
	       
	       } else {
	    	   
	    	   return "th"; 
	    	   
	       }
	                        
	         

		   
		}
	
	
	

}
