package flyWeight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRobot humanoidRobot1 = RobotFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1,2);


        IRobot humanoidRobot2 = RobotFactory.createRobot("HUMANOID");
        humanoidRobot2.display(10,30);

        IRobot roboDog1 = RobotFactory.createRobot("ROBOTICDOG");
        roboDog1.display(2,9);

        IRobot roboDog2 = RobotFactory.createRobot("ROBOTICDOG");
        roboDog2.display(11,19);

	}

}
