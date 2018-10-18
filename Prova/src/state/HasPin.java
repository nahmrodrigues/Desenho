package state;

public class HasPin implements ATMState {

	ATMMachine atmMachine;
	
	public HasPin(ATMMachine atmMachine) {
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
		System.out.println("Pin already entered.");
	}

	@Override
	public void requestCash(int cash) {
		if(cash > atmMachine.cashInMachine) {
			System.out.println("Don't have that cash.");
			System.out.println("Card ejected.");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
		else {
			System.out.println(cash + " is provided by the machine.");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cash);
			
			System.out.println("Card ejected.");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
			if(atmMachine.cashInMachine <= 0) {
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
		}
	}

}
