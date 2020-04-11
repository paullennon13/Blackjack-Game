public class Card {

	private String name;
	private int value;
	private boolean isFlipped=false;
	private boolean isAce = false;
	//isFlipped true is face down false is face up
	
	public Card( String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void changeAce() {
		if(value == 11) {
			value = 1;
		}
	}
	
	public void flip() {
		isFlipped =! isFlipped;
	}
	
	public boolean isFlipped() {
		return isFlipped;
	}
	
	public String toString() {
		String s;
		
		if(isFlipped == false) {
			s = String.format("%s", name);
		}
		else {
			s = String.format("XX");
		}
		
		return s;
	}
	
	public boolean isAce() {
		if(name.equals("Ah") || name.equals("As") || name.equals("Ac") || name.equals("Ad")) {
			isAce = true;
			return isAce;
		}
		
		return isAce;
	}
	
}
