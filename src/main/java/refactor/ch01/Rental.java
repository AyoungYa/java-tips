package refactor.ch01;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/17.</p>
 */
public class Rental {
	private Movie movie;
	private int daysRented;
	
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public int getDaysRented() {
		return daysRented;
	}
	
	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}
	
	double getCharge(){
		return movie.getCharge(daysRented);
	}
	
	int getFrequentRenterPoints(){
		return movie.getFrequentRenterPoints(daysRented);
	}
}
