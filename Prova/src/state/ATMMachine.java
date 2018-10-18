package state;

public class ATMMachine {
	
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	ATMState atmState ;
	
	int cashInMachine = 2000;
	boolean correctPin = false;
	
	public ATMMachine() {
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		
		atmState = noCard;
		
		if(cashInMachine < 0) {
			atmState = atmOutOfMoney;
		}
	}
	
	void setATMState(ATMState atmState) {
		this.atmState = atmState;
	}
	
	public void setCashInMachine(int cash) {
		cashInMachine = cash;
	}
	
	public void inserCard() {
		atmState.insertCard();
	}
	
	public void ejectCard() {
		atmState.ejectCard();
	}
	
	public void requestCash(int cash) {
		atmState.requestCash(cash);
	}
	
	public void insertPin(int pin) {
		atmState.insertPin(pin);
	}
	
	public ATMState getYesCardState() {
		return hasCard;
	}
	
	public ATMState getNoCardState() {
		return noCard;
	}
	
	public ATMState getHasPin() {
		return hasCorrectPin;
	}
	
	public ATMState getNoCashState() {
		return atmOutOfMoney;
	}
}
