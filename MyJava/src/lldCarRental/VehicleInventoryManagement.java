package lldCarRental;

import java.util.List;

import lldCarRental.Products.Vehicle;

public class VehicleInventoryManagement {
	List<Vehicle> vehicles;
	VehicleInventoryManagement(List<Vehicle> vehicles){
		this.vehicles=vehicles;
	}
	public List<Vehicle> getVehicles(){
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles=vehicles;
	}
}
