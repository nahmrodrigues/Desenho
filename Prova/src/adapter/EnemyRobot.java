package adapter;

import java.util.Random;

public class EnemyRobot {
	
	Random generator = new Random();
	
	public void samashWithHands() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Robot causes " + attackDamage + " damage with its hands.");
	}
	
	public void walkForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Robot walks forward " + movement + " spaces.");
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("Enemy Robot tramps on " + driverName);
	}

}
