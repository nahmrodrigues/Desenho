package factoryMethod;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String newShipType) {
		EnemyShip newShip = null;
		
		if(newShipType.equals("UFO")) {
			newShip = new UFOEnemyShip();
		}
		else if(newShipType.equals("Rocket")) {
			newShip = new RocketEnemyShip();
		}
		
		return newShip;
	}
	

}
