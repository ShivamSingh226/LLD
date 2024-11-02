package factoryDP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeInstanceFactory shapeInstance=new ShapeInstanceFactory();
		Shape circleObj=shapeInstance.getShapeInstance("Circle");
		circleObj.computeArea();
	}

}
