package refactor.ch01.price;

import refactor.ch01.Movie;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/17.</p>
 */
public class NewReleasePrice extends Price {
	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	@Override
	public double getCharge(int rentedDays) {
		return rentedDays * 3;
	}
	
	@Override
	public int getFrequentRenterPoint(int rentedDays) {
		return rentedDays > 1 ? 2 : 1;
	}
}
