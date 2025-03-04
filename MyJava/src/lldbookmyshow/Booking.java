package lldbookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Booking {
	Show show;
	List<Seat> bookedLists=new ArrayList<>();
	Payment payment;
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	public List<Seat> getBookedLists() {
		return bookedLists;
	}
	public void setBookedLists(List<Seat> bookedLists) {
		this.bookedLists = bookedLists;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
