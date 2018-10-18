package adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot enemyRobot) {
		this.theRobot = enemyRobot;
	}
	
	@Override
	public void fireWeapon() {
		theRobot.samashWithHands();
	}

	@Override
	public void driveForward() {
		theRobot.walkForward();		
	}

	@Override
	public void assignDriver(String driverName) {
		theRobot.reactToHuman(driverName);
	}
	
	

}
