package abstractFactoryDP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactoryProducer afp=new AbstractFactoryProducer();
		AbstractFactory AbF=afp.getFactoryInstance("Premium");
		Car car=AbF.getInstance(5000000);
		System.out.println(car.getTopSpeed());
	}

}
