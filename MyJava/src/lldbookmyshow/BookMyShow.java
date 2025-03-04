package lldbookmyshow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lldbookmyshow.Enum.City;
import lldbookmyshow.Enum.SeatCategory;

public class BookMyShow {
	MovieController movieController;
	TheatreController theatreController;
	BookMyShow(){
		movieController=new MovieController();
		theatreController=new TheatreController();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookMyShow bookMyShow=new BookMyShow();
		bookMyShow.initialize();
		bookMyShow.createBooking(City.BLR, "BAAHUBALI");
		bookMyShow.createBooking(City.BLR, "BAAHUBALI");
		

	}
	private void createBooking(City city, String movieName) {
		List<Movie> movies=movieController.getMoviesByCity(city);
		Movie interestedMovie=null;
		for(Movie movie:movies) {
			if(movie.getMovieName().equals(movieName)) {
				interestedMovie=movie;
			}
		}
		Map<Theatre,List<Show>>getAllShows=theatreController.getAllShow(interestedMovie, city);
		Map.Entry<Theatre, List<Show>> entry=getAllShows.entrySet().iterator().next();
		List<Show> runningShows=entry.getValue();
		Show interestedShow=runningShows.get(0);
		
		int seatNumber=30;
		List<Integer> bookedSeats=interestedShow.getBookedSeats();
		if(!bookedSeats.contains(seatNumber)) {
			bookedSeats.add(seatNumber);
			Booking booking =new Booking();
			List<Seat> mybookedSeats=new ArrayList<>();
			for(Seat seat:interestedShow.getScreen().getSeats()) {
				if(seat.getSeatId()==seatNumber) {
					mybookedSeats.add(seat);
				}
			}
			booking.setBookedLists(mybookedSeats);
			booking.setShow(interestedShow);
		}else {
			System.out.println("Seat already booked");
			return;
		}
		System.out.println("Booking Successfull");
	}
	private void initialize() {
		createMovies();
		createTheatre();
		
	}
	private void createTheatre() {
		Movie avengerMovie=movieController.getMovieByName("AVENGERS");
		Movie baahubali=movieController.getMovieByName("BAAHUBALI");
		
		Theatre inoxTheatre=new Theatre();
		inoxTheatre.setTheatreId(1);
		inoxTheatre.setNoOfScreens(createScreen());
		inoxTheatre.setCity(City.BLR);
		List<Show> inoxShows=new ArrayList<>();
		Show inoxMorningShow=createShows(1, inoxTheatre.getNoOfScreens().get(0),avengerMovie,8);
		Show inoxEveningShow=createShows(2, inoxTheatre.getNoOfScreens().get(0),baahubali, 16);
		inoxShows.add(inoxMorningShow);
		inoxShows.add(inoxEveningShow);
		inoxTheatre.setNoOfShows(inoxShows);
		
		Theatre pvrTheatre=new Theatre();
		pvrTheatre.setTheatreId(1);
		pvrTheatre.setNoOfScreens(createScreen());
		pvrTheatre.setCity(City.BLR);
		List<Show> pvrShows=new ArrayList<>();
		Show pvrMorningShow=createShows(1, inoxTheatre.getNoOfScreens().get(0),avengerMovie,8);
		Show pvrEveningShow=createShows(2, inoxTheatre.getNoOfScreens().get(0),baahubali, 16);
		pvrShows.add(pvrMorningShow);
		pvrShows.add(pvrEveningShow);
		pvrTheatre.setNoOfShows(pvrShows);
		
		theatreController.addTheatre(City.BLR, pvrTheatre);
		theatreController.addTheatre(City.DLI, inoxTheatre);
	}
	private List<Screen> createScreen(){
		List<Screen> screens=new ArrayList<>();
		Screen screen1=new Screen();
		screen1.setScreenId(1);
		screen1.setSeats(createSeats());
		screens.add(screen1);
		return screens;
	}
	private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {
		Show show=new Show();
		show.setShowId(showId);
		show.setScreen(screen);
		show.setMovie(movie);
		show.setShowTime(showStartTime);
		return show;
	}
	private List<Seat> createSeats(){
		List<Seat> seats=new ArrayList<>();
		for(int i=0;i<40;i++) {
			Seat seat=new Seat();
			seat.setSeatId(i);
			seat.setSeatCategory(SeatCategory.SILVER);
			seats.add(seat);
		}
		for(int i=40;i<70;i++) {
			Seat seat=new Seat();
			seat.setSeatId(i);
			seat.setSeatCategory(SeatCategory.GOLD);
			seats.add(seat);
		}
		for(int i=70;i<100;i++) {
			Seat seat=new Seat();
			seat.setSeatId(i);
			seat.setSeatCategory(SeatCategory.PLATINUM);
			seats.add(seat);
		}
		return seats;
	}
	private void createMovies() {
		Movie avengers=new Movie();
		avengers.setMovieId(1);
		avengers.setMovieName("AVENGERS");
		avengers.setDurationInMinutes(128);
		Movie Baahubali=new Movie();
		Baahubali.setMovieId(2);
		Baahubali.setMovieName("BAAHUBALI");
		Baahubali.setDurationInMinutes(200);
		
		movieController.addMovie(City.BLR, Baahubali);
		movieController.addMovie(City.DLI,Baahubali);
		movieController.addMovie(City.DLI, avengers);
		movieController.addMovie(City.BLR, avengers);
		
	}

}
