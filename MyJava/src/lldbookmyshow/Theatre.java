package lldbookmyshow;

import java.util.ArrayList;
import java.util.List;

import lldbookmyshow.Enum.City;

public class Theatre {
	int theatreId;
	String address;
	City city;
	List<Screen> noOfScreens=new ArrayList<>();
	List<Show> noOfShows=new ArrayList<>();
	public int getTheatreId() {
		return theatreId;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Screen> getNoOfScreens() {
		return noOfScreens;
	}
	public void setNoOfScreens(List<Screen> noOfScreens) {
		this.noOfScreens = noOfScreens;
	}
	public List<Show> getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(List<Show> noOfShows) {
		this.noOfShows = noOfShows;
	}
	
}
