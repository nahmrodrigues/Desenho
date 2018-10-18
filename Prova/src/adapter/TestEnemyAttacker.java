package adapter;

public class TestEnemyAttacker {
	
	public static void main(String[] args) {
		
		EnemyTank tank = new EnemyTank();
		EnemyRobot robot = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
		
		System.out.println("The Robot");
		
		robot.reactToHuman("Paul");
		robot.walkForward();
		robot.samashWithHands();
		
		System.out.println("The Enemy Tank");
		
		tank.assignDriver("Frank");
		tank.driveForward();
		tank.fireWeapon();
		
		System.out.println("The Robot with Adapter");
		
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
		
	}

}
