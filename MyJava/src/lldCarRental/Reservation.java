package lldCarRental;

import java.util.Date;

import lldCarRental.Products.Vehicle;

public class Reservation {
	int reservationId;
	User user;
	Vehicle vehicle;
	Date bookingDate;
	Date bookedFrom;
	Date bookedTo;
	Long fromTimeStamp;
	Long toTimeStamp;
	Location pickUpLocation;
	Location dropLocation;
	ReservationType reservationType;
	ReservationStatus reservationStatus;
	Location location;
	public int createReserve(User user, Vehicle vehicle) {
		reservationId=12323;
		this.user=user;
		this.vehicle=vehicle;
		reservationType=ReservationType.DAILY;
		reservationStatus=ReservationStatus.SCHEDULED;
		return reservationId;
	}
}
