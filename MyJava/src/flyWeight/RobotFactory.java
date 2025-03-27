package flyWeight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
	private static Map<String,IRobot> roboticObjectCache=new HashMap<>();
	public static IRobot createRobot(String robotType) {
		if(roboticObjectCache.containsKey(robotType)) {
			return roboticObjectCache.get(robotType);
		}else {
			if(robotType=="HUMANOID") {
				Sprites humanoidSprite=new Sprites();
				IRobot humanoidObj=new HumanoidRobot(robotType,humanoidSprite);
				roboticObjectCache.put(robotType, humanoidObj);
				return humanoidObj;
			}else if(robotType=="ROBOTICDOG") {
				Sprites roboticDogSprite=new Sprites();
				IRobot roboticDogObj=new RoboticDog(robotType,roboticDogSprite);
				roboticObjectCache.put(robotType, roboticDogObj);
				return roboticDogObj;
			}
		}
		return null;
	}
}
