package lldbookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lldbookmyshow.Enum.City;

public class TheatreController {
	Map<City,List<Theatre>>cityVsTheatre;
	List<Theatre> allTheatres;
	TheatreController(){
		cityVsTheatre = new HashMap<>();
		allTheatres=new ArrayList<>();
	}
	void addTheatre(City city, Theatre theatre) {
		allTheatres.add(theatre);
		List<Theatre> theatres=cityVsTheatre.getOrDefault(city, new ArrayList<>());
		theatres.add(theatre);
		cityVsTheatre.put(city, theatres);
	}
	Map<Theatre,List<Show>> getAllShow(Movie movie, City city){
		Map<Theatre,List<Show>> listShows= new HashMap<>();
		List<Theatre> listOfTheatres=cityVsTheatre.get(city);
		for(Theatre theatre:listOfTheatres) {
			List<Show> giveMovieShows=new ArrayList<>();
			List<Show> shows=theatre.getNoOfShows();
			for(Show show:shows) {
				if(show.movie.movieId==movie.getMovieId()) {
					giveMovieShows.add(show);
				}
			}
			if(!giveMovieShows.isEmpty()) {
				listShows.put(theatre, giveMovieShows);
			}
		}
		return listShows;
	}
}
