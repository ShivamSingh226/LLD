package lldCarRental;

import java.util.List;

import lldCarRental.Products.Vehicle;
import lldCarRental.Products.VehicleType;

public class Store {
	int storeId;
	VehicleInventoryManagement vehicleInventoryManagement;
	Location location;
	List<Reservation> reservations;
	public List<Vehicle> getVehicles(VehicleType vehicleType){
		return vehicleInventoryManagement.getVehicles();
	}
	public void setVehicles(List<Vehicle> vehicles) {
		vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
	}
	public Reservation createReservations(Vehicle vehicle, User user) {
		Reservation reservation = new Reservation();
		reservation.createReserve(user, vehicle);
		reservations.add(reservation);
		return reservation;
	}
	public boolean completeReservation(int reservationId) {
		return true;
	}
}
