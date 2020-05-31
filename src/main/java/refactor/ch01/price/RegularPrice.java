package refactor.ch01.price;

import refactor.ch01.Movie;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/17.</p>
 */
public class RegularPrice extends Price {
	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}
	
	@Override
	public double getCharge(int rentedDays) {
		double result = 2;
		if(rentedDays > 2) {
			result += (rentedDays - 2) * 1.5;
		}
		return result;
	}
}
