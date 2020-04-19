import java.util.Scanner;

public class Medium_AI extends Player {

	protected Medium_AI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isHitting(Scanner s) {
		if(getHandValue() < 16 && isBusted==false) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isSpliting(Scanner s) {
		for(int i = 0; i < 2; i++) {
			Card c = findCard(i);
			if(c.getValue() == 8 || c.getValue() == 11) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isDoublingDown(Scanner s) {
		if(getHandValue() == 11) {
			return true;
		}
		else {
			return false;
		}
	}

}
