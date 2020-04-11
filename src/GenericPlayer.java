import java.util.Scanner;

public abstract class GenericPlayer extends Hand {
	
	protected String name;
	protected boolean isBusted = false;
	protected int numOfWins = 0;
	protected int numOfLoses = 0;
	protected int numOfPushes = 0;
	protected boolean hasBlackJack = false;
	protected double stack = 1000;
	protected double bet = 0.0;
	protected boolean isSplitable = false;
	protected boolean doubledDown = false;
	
	protected GenericPlayer(String name) {
		super();
		this.name = name;
	}
	
	public abstract boolean isHitting(Scanner s);
	public abstract boolean isSpliting(Scanner s);
	public abstract boolean isDoublingDown(Scanner s);
	
	public boolean isBusted() {
		return isBusted;
	}
	
	public void busted() {
		 System.out.printf("%n%s Busted!%n",name);
		 isBusted = true;
		 }
	
	public String toString() {
		return String.format("%s: %s", name, super.toString());
		}
	
	public void win() {
		System.out.printf("%s Wins $%f!%n",name, bet);
		if(hasBlackJack) {
			bet = bet*2.5;
			stack += bet;
		}
		else {
			bet = bet*2;
			stack += bet;
		}
	}
		
		public void lose() {
		System.out.printf("%s Loses %f%n",name, bet);
		}
		
		public void push() {
		System.out.printf("%s Pushed%n",name);
		stack += bet;
		}
		
		public void score() {
			System.out.printf("Name: %s Wins: %d Loses: %d Pushes: %d%n", name, numOfWins, numOfLoses, numOfPushes);
		}
		
		public void addWin() {
			numOfWins += 1;
		}
		
		public void addLose() {
			numOfLoses += 1;
		}

		public void addPush() {
			numOfPushes += 1;
		}
		
		public void clearHand() {
			cards.clear();
		}
		
		public boolean hasBlackJack() {
			return hasBlackJack;
		}
		
		public void changeHasBlackJack() {
			hasBlackJack = true;
		}
		
		public String stackToString() {
			String s = String.format("$%.2f", stack);
			return s;
		}
		
		public void isBetting(double bet) {
		this.bet = bet;
		stack -= bet;
		}
		
		public void wasBusted() {
			isBusted = false;
		}
		
		public void isSplitable() {
			isSplitable = true;
		}
	
}
