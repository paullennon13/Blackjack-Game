import java.util.Scanner;

public class Player extends GenericPlayer {
	
	protected Hand h;
	
	public Player(String name) {
		super(name);
	}
	
	public void win() {
		if(hasBlackJack) {
			System.out.printf("%s Wins $%.2f!%n",name, bet*1.5);
		}
		else {
			System.out.printf("%s Wins $%.2f!%n",name, bet);
		}
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
		System.out.printf("%s Loses %.2f%n",name, bet);
		}
		
		public void push() {
		System.out.printf("%s Pushed%n",name);
		stack += bet;
		}
		
		public boolean isHitting(Scanner s) {
			do{
				System.out.printf("%n%s: Do you want to hit (y/n)? ", name) ;
				String response = s.next();
				if(response.length() == 0) {
					continue;
				}
				if(response.charAt(0) == 'y') {
					return true;
				}
				else if(response.charAt(0) == 'n') {
					return false;
				}
				else {
					System.out.printf("Please Respond with y or n.%n") ;
				}
			} while (true);
		}

		@Override
		public boolean isSpliting(Scanner s) {
			do{
				System.out.printf("%n%s: Do you want to split (y/n)? ", name) ;
				String response = s.next();
				if(response.length() == 0) {
					continue;
				}
				if(response.charAt(0) == 'y') {
					stack -= bet;
					bet = bet*2;
					return true;
				}
				else if(response.charAt(0) == 'n') {
					return false;
				}
				else {
					System.out.printf("Please Respond with y or n.%n") ;
				}
			} while (true);
		}

		@Override
		public boolean isDoublingDown(Scanner s) {
			do{
				System.out.printf("%n%s: Do you want to double down (y/n)? ", name) ;
				String response = s.next();
				if(response.length() == 0) {
					continue;
				}
				if(response.charAt(0) == 'y') {
					stack -= bet;
					bet = bet*2;
					doubledDown = true;
					return true;
				}
				else if(response.charAt(0) == 'n') {
					return false;
				}
				else {
					System.out.printf("Please Respond with y or n.%n") ;
				}
			} while (true);
		}
	
}
