import java.util.Random;

public class Deck extends CardCollection {
	Random rand = new Random();
	
	public Deck() {
		super(52);
		populateDeck();
	}

	public void draw(Hand h) {
		int r = rand.nextInt(cards.size());
		h.addCard(cards.get(r));
		cards.remove(r);
	}

	public void shuffle() {
		populateDeck();
	}
	
	private void populateDeck() {
		cards.clear();
		String[] suits = {"of diamonds ", "of clubs ", "of spades ", "of hearts "};
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		String[] cards = {"2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Jack ", "Queen ", "King ", "Ace "};
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				String s = cards[j] + suits[i];
				addCard(new Card(s, values[j]));
			}
		}
		
		}
	
}
