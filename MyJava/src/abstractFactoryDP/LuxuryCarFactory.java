package abstractFactoryDP;

public class LuxuryCarFactory implements AbstractFactory {
	
	@Override
	public Car getInstance(int price) {
		if(price>=1000000 && price<=3000000) {
			return new LuxuryCar1();
		}else if(price>3000000) {
			return new LuxuryCar2();
		}
		return null;
	}
}
