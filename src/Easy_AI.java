import java.util.Random;
import java.util.Scanner;

public class Easy_AI extends Player {

	protected Easy_AI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isHitting(Scanner s) {
		Random r = new Random();
		int a = r.nextInt(2) + 1;
		if(a == 1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isSpliting(Scanner s) {
		Random r = new Random();
		int a = r.nextInt(2) + 1;
		if(a == 1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDoublingDown(Scanner s) {
		Random r = new Random();
		int a = r.nextInt(2) + 1;
		if(a == 1) {
			return true;
		}
		else {
			return false;
		}
	}

}
