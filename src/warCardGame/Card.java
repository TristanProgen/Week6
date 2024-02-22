package warCardGame;

public class Card {
	
	final int value;
	final String name;
	
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
		
		
	}
	
	// getter method for card value 
	
	public int getValue() {
		return value;
	}


// value only set in deck constructor 
	
//	public void setValue(int value) {
//		this.value = value;
//	}



	public String getName() {
		return name;
	}


// value only set in deck constructor 
//	public void setName(String name) {
//		this.name = name;
//	}



	public void describe() {
		System.out.println('\t' + this.name +  "\t" + "  :  " + "\t"   + "Game Value of " + this.value);
	}

}
