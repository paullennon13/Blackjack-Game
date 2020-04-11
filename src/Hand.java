
public class Hand extends CardCollection {
	
	public Hand() {
		super(10);
	}
	
	public int getHandValue() {
		int value = 0;
		for(int i = 0; i < cards.size(); i++) {
			if(cards.get(i).isFlipped()) {
				continue;
			}
			else {
				value += cards.get(i).getValue();
			}
		}
		return value;
	}
	
	public String toString() {
		String output = "";
		for(int i = 0; i < cards.size(); i++) {
			output += cards.get(i);
		}
		output += String.format("%nShowing: (%d)", getHandValue());
		return output;
	}
	
}
