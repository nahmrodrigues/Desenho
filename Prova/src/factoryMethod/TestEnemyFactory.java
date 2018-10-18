package factoryMethod;

public class TestEnemyFactory {
	
	public static void main(String[] args) {
		EnemyShipFactory factory = new EnemyShipFactory();
		
		String ufoEnemy = "UFO";
		String rocketEnemy = "Rocket";
		
		EnemyShip ufoEnemyShip = factory.makeEnemyShip(ufoEnemy);
		EnemyShip rocketEnemyShip = factory.makeEnemyShip(rocketEnemy);
		
		ufoEnemyShip.displayEnemyShip();
		ufoEnemyShip.followHeroShip();
		ufoEnemyShip.enemyShipShoots();
		
		rocketEnemyShip.displayEnemyShip();
		rocketEnemyShip.followHeroShip();
		rocketEnemyShip.enemyShipShoots();
		
	}

}
