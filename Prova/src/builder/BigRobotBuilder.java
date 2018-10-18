package builder;

public class BigRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public BigRobotBuilder() {
		this.robot = new Robot();
	}
	
	public void buildHead() {
		robot.setHead("Big Head");
	}

	public void builTorso() {
		robot.setTorso("Big Torso");		
	}

	public void buildArms() {
		robot.setArms("Big Arms");
	}

	public void buildLegs() {
		robot.setLegs("Big Legs");		
	}
	
	public Robot getRobot() {
		return this.robot;
	}
	

}
