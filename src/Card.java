public class Card {
	private char value;
	private boolean guessed = false;
	
	
	public Card(char value) {
		super();
		this.value = value;
	}


	public char getValue() {
		return value;
	}


	public void setValue(char value) {
		this.value = value;
	}


	public boolean isGuessed() {
		return guessed;
	}


	public void setGuess(boolean guess) {
		this.guessed = guess;
	}
}

