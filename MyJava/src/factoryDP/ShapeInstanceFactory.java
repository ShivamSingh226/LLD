package factoryDP;

public class ShapeInstanceFactory {
	public Shape getShapeInstance(String value) {
		if(value.equals("Circle")) {
			return new Circle();
		}else if(value.equals("Square")) {
			return new Square();
		}
		return null;
	}
}
