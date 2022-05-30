import java.util.*;

/*output:

	StarWars 8.7 1977
	Empire Strikes Back 8.8 1980
	Return of the Jedi 8.4 1983

	Empire Strikes Back 8.8 1980
	StarWars 8.7 1977
	Return of the Jedi 8.4 1983
*/

class Movie implements Comparable<Movie>{

	int year;
	double rating;
	String name;

	Movie(){
		year = 0;
		rating = 0;
		name = "Unknown";
	}

	Movie(String name, double rating, int year){
		this.year = year;
		this.rating = rating;
		this.name = name;
	}

	public int compareTo(Movie movie){
		return (this.year - movie.year);
	}

	public String toString(){
		return this.name + " "+this.rating + " " + this.year;
	}
}

class CompareRating implements Comparator<Movie>{

	public int compare(Movie m1, Movie m2){
		if(m1.rating == m2. rating)
			return 0;
		else
			return (m1.rating < m2.rating? 1: -1);
	}
}

public class Compare{
	public static void main(String[] args){

		ArrayList<Movie> movies = new ArrayList<Movie>();

		movies.add(new Movie("StarWars", 8.7, 1977));
		movies.add(new Movie("Return of the Jedi", 8.4, 1983));
		movies.add(new Movie("Empire Strikes Back", 8.8, 1980));

		Collections.sort(movies);

		for(Movie movie: movies)
			System.out.println(movie.toString());

		System.out.println();

		Collections.sort(movies, new CompareRating());

		for(Movie movie: movies)
			System.out.println(movie.toString());
	}
}