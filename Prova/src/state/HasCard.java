package state;

public class HasCard implements ATMState {

	ATMMachine atmMachine;
	
	public HasCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("You can't enter more than one card.");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected.");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pin) {
		
		if(pin == 1234) {
			System.out.println("Correct Pin.");
			atmMachine.correctPin = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		}
		else {
			System.out.println("Wrong Pin.");
			atmMachine.correctPin = false;
			System.out.println("Card Ejected.");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
	}

	@Override
	public void requestCash(int cash) {
		System.out.println("Enter Pin first.");
	}

}
