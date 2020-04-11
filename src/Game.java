import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		boolean playAgain = true;
		int gameCount = 1;
		Deck d = new Deck();
		
		System.out.printf("%nWelcome to BlackJack!%n%n");
			System.out.printf("How many players?%n");
			int numPlayers = input.nextInt();
			ArrayList <GenericPlayer> players = new ArrayList<>(numPlayers + 1);
		
			// Add each player to the ArrayList
			for (int i=0;i< numPlayers;i++) {
				System.out.printf ("Enter player #%d name: ", i + 1);
				String name = input.next();
				Player p = new Player(name);
				players.add(p);
			}
			House h = new House();
			players.add(h);
			
		while(playAgain) {
			boolean hasBet = false;
			while(hasBet == false) {
				for(int i = 0; i < numPlayers; i++) {
					GenericPlayer p = players.get(i);
					if(p instanceof House) {
						break;
					}
					System.out.printf("Stack size: %s%n%s enter your bet: ", p.stackToString(), p.name);
					if(input.hasNextDouble()) {
						double bet = input.nextDouble();
						p.isBetting(bet);
						hasBet = true;
					}
					else {
						System.out.printf("Minimum bet is $1.");
					}
					
				}
			}
		
			// Deal two cards to every player
			for (int i=0;i< players.size();i++) {
				GenericPlayer p = players.get(i);
				d.draw(p); // deal card 1
				d.draw(p); // deal card 2
				if(p.getHandValue() == 21) {
					p.changeHasBlackJack();
				}
				if(p.findCard(0).getValue() == p.findCard(1).getValue()) {
					p.isSplitable();
				}
				if(p instanceof House) {
				House house = (House) p;
				house.flipFirstCard();
				}
				System.out.printf("%s%n", p);
			}
		
			// Do the players want to hit?
			for (int i=0;i< players.size();i++) {
				GenericPlayer p = players.get(i);
				if(p instanceof House) {
					House house =( House ) p;
					house.flipFirstCard();
				}
				
				if(p instanceof Player) {
					Player player = (Player)p;
					if(player.isSplitable) {
						if(player.isSpliting(input)) {
						
						}
					}
				
					if(p.isDoublingDown(input)) {
						d.draw(p);
						if(p.getHandValue() > 21) {
							for(i = 0; i < p.getSize()-1; i++) {
								Card c = p.findCard(i);
								if(c.isAce()) {
									c.changeAce();
								}
							}
						}
						System.out.printf ("%s", p);
					} 
					else {
						continue;
					}
						
					// if the player busts
					if(p.getHandValue() >21) {
						p.busted();
					
					}
				}
				
				while (!p.isBusted() && p.doubledDown == false) {
		
					if(p.isHitting(input)) {
						d.draw(p);
						if(p.getHandValue() > 21) {
							for(i = 0; i < p.getSize()-1; i++) {
								Card c = p.findCard(i);
								if(c.isAce()) {
									c.changeAce();
								}
								if(p.getHandValue() < 21) {
									continue;
								}
							}
						}
						System.out.printf ("%s", p);
					} 
					else {
						break;
					}
				
					// if the player busts
					if(p.getHandValue() >21) {
						p.busted();
					}
				}
			}
		
			// Display final hands
			System.out.printf("%n%nFinal Hands:%n");
			for (int i=0;i< players.size();i++) {
				GenericPlayer p = players.get(i);
				System.out.printf("%s%n", p);
				if(p.hasBlackJack()) {
					if(p instanceof House) {
						System.out.printf("House has Blackjack!%n");
					}
					else {
						System.out.printf("%s has Blackjack!%n", p);
					}
				}
			}
			System.out.printf ("%n%n");
		
			// Determine results.
			int houseValue = h.getHandValue();
			for (int i=0;i< players.size();i++) {
				GenericPlayer p = players.get(i);
				if(p instanceof House) {
				continue;
				}
				// win condition checks
				if(p.hasBlackJack && h.hasBlackJack() == false) {
					p.win();
					p.addWin();
				}
				else if(p.hasBlackJack() && h.hasBlackJack()) {
					p.addPush();
					p.push();
				}
				else if(h.hasBlackJack() && p.hasBlackJack() == false) {
					p.lose();
					p.addLose();;
				}
				else if (!p.isBusted() && houseValue >21) {
					// player wins
					p.win();
					p.addWin();
				} 
				else if(p.getHandValue() == houseValue && !p.isBusted()) {
					// player pushed
					p.push();
					p.addPush();
				} 
				else if (!p.isBusted() && p.getHandValue() >houseValue) {
					// player wins
					p.win();
					p.addWin();
				} 
				else {
					// player lose
					p.lose();
					p.addLose();
				}
			}
			for(int i = 0; i < numPlayers; i++) {
				GenericPlayer p = players.get(i);
				p.score();
			}
			boolean answered= true;
			
			for(gameCount = 1; answered == true; gameCount++){
				System.out.printf("%nDo you want to play Again(y/n): ");
				String a = input.next();
			
				if(a.equals("y")){
					playAgain = true;
					answered = true;
					d.shuffle();
					h.clearHand();
					for(int i = 0; i < players.size(); i++) {
						players.get(i).clearHand();
						players.get(i).wasBusted();
						
					}
					break;
				}
				else if(a.equals("n")) {
					playAgain = false;
					answered = true;
					System.exit(0);
				}
				else {
					System.out.printf("Please Respond with y or n.%n");
				}
			}
		}
		input.close();
	}

}
