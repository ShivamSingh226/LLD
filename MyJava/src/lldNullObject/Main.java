package lldNullObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=VehicleFactory.getVehicleObject("Bike");
		printVehicleDetails(vehicle);

	}
	private static void printVehicleDetails(Vehicle vehicle) {
		System.out.println(vehicle.getTankCapacity());
		System.out.println(vehicle.getSeatingCapacity());
	}

}
