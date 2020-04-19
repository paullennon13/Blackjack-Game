import java.util.Scanner;

public class Hard_AI extends Player {

	protected Hard_AI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isHitting(Scanner s) {
		if(getHandValue() < 9) {
			return true;
		}
		if(getHandValue() > 16) {
			return false;
		}
		if(h.getHandValue() == 2) {
			if(getHandValue() == 9) {
				return true;
			}
			if(getHandValue() == 10) {
				return true;
			}
			if(getHandValue() == 11) {
				return true;
			}
			if(getHandValue() == 12) {
				return true;
			}
			if(getHandValue() == 13) {
				return false;
			}
			if(getHandValue() == 14) {
				return false;
			}	
			if(getHandValue() == 15) {
				return false;
			}
			if(getHandValue() == 16) {
				return false;
			}
		}
		else if(h.getHandValue() == 3) {
			if(getHandValue() == 9) {
				return true;
			}
			if(getHandValue() == 10) {
				return true;
			}
			if(getHandValue() == 11) {
				return true;
			}
			if(getHandValue() == 12) {
				return true;
			}
			if(getHandValue() == 13) {
				return false;
			}
			if(getHandValue() == 14) {
				return false;
			}	
			if(getHandValue() == 15) {
				return false;
			}
			if(getHandValue() == 16) {
				return false;
			}
		}
		else if(h.getHandValue() == 4) {
			if(getHandValue() == 9) {
				return true;
			}
			if(getHandValue() == 10) {
				return true;
			}
			if(getHandValue() == 11) {
				return true;
			}
			if(getHandValue() == 12) {
				return false;
			}
			if(getHandValue() == 13) {
				return false;
			}
			if(getHandValue() == 14) {
				return false;
			}	
			if(getHandValue() == 15) {
				return false;
			}
			if(getHandValue() == 16) {
				return false;
			}
		}
		else if(h.getHandValue() == 5) {
			if(getHandValue() == 9) {
				return true;
			}
			if(getHandValue() == 10) {
				return true;
			}
			if(getHandValue() == 11) {
				return true;
			}
			if(getHandValue() == 12) {
				return false;
			}
			if(getHandValue() == 13) {
				return false;
			}
			if(getHandValue() == 14) {
				return false;
			}	
			if(getHandValue() == 15) {
				return false;
			}
			if(getHandValue() == 16) {
				return false;
			}
		}
		else if(h.getHandValue() == 6) {
			if(getHandValue() == 9) {
				return true;
			}
			if(getHandValue() == 10) {
				return true;
			}
			if(getHandValue() == 11) {
				return true;
			}
			if(getHandValue() == 12) {
				return false;
			}
			if(getHandValue() == 13) {
				return false;
			}
			if(getHandValue() == 14) {
				return false;
			}	
			if(getHandValue() == 15) {
				return false;
			}
			if(getHandValue() == 16) {
				return false;
			}
		}
		else if(h.getHandValue() == 7) {
			if(getHandValue() == 9) {
				return true;
			}
			if(getHandValue() == 10) {
				return true;
			}
			if(getHandValue() == 11) {
				return true;
			}
			if(getHandValue() == 12) {
				return true;
			}
			if(getHandValue() == 13) {
				return true;
			}
			if(getHandValue() == 14) {
				return true;
			}	
			if(getHandValue() == 15) {
				return true;
			}
			if(getHandValue() == 16) {
				return true;
			}
		}
		else if(h.getHandValue() == 8) {
			if(getHandValue() == 9) {
				return true;
			}
			if(getHandValue() == 10) {
				return true;
			}
			if(getHandValue() == 11) {
				return true;
			}
			if(getHandValue() == 12) {
				return true;
			}
			if(getHandValue() == 13) {
				return true;
			}
			if(getHandValue() == 14) {
				return true;
			}	
			if(getHandValue() == 15) {
				return true;
			}
			if(getHandValue() == 16) {
				return true;
			}
		}
		else if(h.getHandValue() == 9) {
			if(getHandValue() == 9) {
				return true;
			}
			if(getHandValue() == 10) {
				return true;
			}
			if(getHandValue() == 11) {
				return true;
			}
			if(getHandValue() == 12) {
				return true;
			}
			if(getHandValue() == 13) {
				return true;
			}
			if(getHandValue() == 14) {
				return true;
			}	
			if(getHandValue() == 15) {
				return true;
			}
			if(getHandValue() == 16) {
				return true;
			}
		}
		else if(h.getHandValue() == 10) {
			if(getHandValue() == 9) {
				return true;
			}
			if(getHandValue() == 10) {
				return true;
			}
			if(getHandValue() == 11) {
				return true;
			}
			if(getHandValue() == 12) {
				return true;
			}
			if(getHandValue() == 13) {
				return true;
			}
			if(getHandValue() == 14) {
				return true;
			}	
			if(getHandValue() == 15) {
				return true;
			}
			if(getHandValue() == 16) {
				return true;
			}
		}	
		else if(h.getHandValue() == 11) {
			if(getHandValue() == 9) {
				return true;
			}
			if(getHandValue() == 10) {
				return true;
			}
			if(getHandValue() == 11) {
				return true;
			}
			if(getHandValue() == 12) {
				return true;
			}
			if(getHandValue() == 13) {
				return true;
			}
			if(getHandValue() == 14) {
				return true;
			}	
			if(getHandValue() == 15) {
				return true;
			}
			if(getHandValue() == 16) {
				return true;
			}
		}
			return false;
	}

	@Override
	public boolean isSpliting(Scanner s) {
		if(getHandValue() == 4) {
			if(h.getHandValue() < 8) {
				return true;
			}
		}
		if(getHandValue() == 6) {
			if(h.getHandValue() < 8) {
				return true;
			}
		}
		if(getHandValue() == 8) {
			if(h.getHandValue() < 7 && h.getHandValue() > 4) {
				return true;
			}
		}
		if(getHandValue() == 10) {
			return false;
		}
		if(getHandValue() == 12) {
			if(h.getHandValue() < 7) {
				return true;
			}
		}
		if(getHandValue() == 14) {
			if(h.getHandValue() < 8) {
				return true;
			}
		}
		if(getHandValue() == 16) {
			return true;
		}
		if(getHandValue() == 18) {
			if(h.getHandValue() == 7 || h.getHandValue() == 10 || h.getHandValue() == 11) {
				return false;
			}
			else {
				return true;
			}
		}
		if(getHandValue() == 20) {
			return false;
		}
		return false;
	}

	@Override
	public boolean isDoublingDown(Scanner s) {
		// TODO Auto-generated method stub
		return false;
	}

}
