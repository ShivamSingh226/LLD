package lldCarRental;

public class Bill {
	Reservation reservation;
	double totalAmount;
	boolean isBillPaid;
	Bill(Reservation reservation){
		this.reservation=reservation;
		this.totalAmount=computeBillAmount();
		isBillPaid=false;
	}
	private double computeBillAmount() {
		return 100.0;
	}
}
