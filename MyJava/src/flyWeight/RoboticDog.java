package flyWeight;

public class RoboticDog implements IRobot{
	private String robotType;
	private Sprites body;
	public RoboticDog(String robotType, Sprites body) {
		this.robotType = robotType;
		this.body = body;
	}
	public String getRobotType() {
		return robotType;
	}
	public Sprites getBody() {
		return body;
	}
	@Override
	public void display(int x, int y) {
		
	}
	
	
}
