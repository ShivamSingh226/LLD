package lldbookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lldbookmyshow.Enum.City;

public class MovieController {
	Map<City,List<Movie>> cityVsMovie;
	List<Movie> allMovie;
	
	MovieController(){
		cityVsMovie= new HashMap<>();
		allMovie= new ArrayList<>();
	}
	void addMovie(City city,Movie movie) {
		allMovie.add(movie);
		List<Movie> movies=cityVsMovie.getOrDefault(city, new ArrayList<>());
		movies.add(movie);
		cityVsMovie.put(city, movies);
	}
	Movie getMovieByName(String movieName) {
		for(Movie movie:allMovie) {
			if(movie.movieName==movieName) {
				return movie;
			}
		}
		return null;
	}
	   List<Movie> getMoviesByCity(City city) {
	        return cityVsMovie.get(city);
	    }

}
