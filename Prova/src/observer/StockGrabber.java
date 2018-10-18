package observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {
		observers.add(o);		
	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);		
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observers) {
			o.update(ibmPrice, aaplPrice, googPrice);
		}	
	}
	
	public void setIBMPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}
	
	public void setApplePrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}
	
	public void setGooglePrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}
	

}
