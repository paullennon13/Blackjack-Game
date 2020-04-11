import java.util.ArrayList;

public abstract class CardCollection {

	protected ArrayList<Card> cards;
	private int size;
	
	protected CardCollection (int size) {
		 this.cards = new ArrayList<>(size);
		 this.size = size;
		 }
	
	public Card findCard(int i) {
		return cards.get(i);
	}
	
	public void addCard(Card c) {
		cards.add(c);
	}
	
	public void removeCard(Card c) {
		cards.remove(c);
	}
	
	public int getSize() {
		return size;
	}
	
	
}
