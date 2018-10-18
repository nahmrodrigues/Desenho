package builder;

public class TestRobotBuilder {
	
	public static void main(String[] args) {
		RobotEngineer engineer = new RobotEngineer(new BigRobotBuilder());
		
		engineer.makeRobot();
		
		Robot bigRobot = engineer.getRobot();
		
		System.out.println("ROBOT BUILT.");
		
		System.out.println("Robot Head Type: " + bigRobot.getHead());
		System.out.println("Robot Torso Type: " + bigRobot.getTorso());
		System.out.println("obot Arms Type:" + bigRobot.getArms());
		System.out.println("obot Legs Type:" + bigRobot.getLegs());
		
	}

}
