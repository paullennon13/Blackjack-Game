import java.util.Scanner;

public class House extends GenericPlayer {
	
	public House() {
		super("House");
	}
	
	public boolean isHitting(Scanner s) {
		if(getHandValue() < 16 && isBusted==false) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void flipFirstCard() {
		cards.get(0).flip();
	}

	@Override
	public boolean isSpliting(Scanner s) {
		return false;
	}

	@Override
	public boolean isDoublingDown(Scanner s) {
		doubledDown = false;
		return false;
	}

	public boolean isStanding() {
		if(getHandValue() > 16 && isBusted==false) {
			return true;
		}
		return false;
	}
	
}
