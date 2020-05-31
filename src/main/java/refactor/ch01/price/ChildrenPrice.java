package refactor.ch01.price;

import refactor.ch01.Movie;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/17.</p>
 */
public class ChildrenPrice extends Price {
	@Override
	public int getPriceCode() {
		return Movie.CHILDREN;
	}
	
	@Override
	public double getCharge(int rentedDays) {
		double result = 1.5;
		if(rentedDays > 3){
			result += (rentedDays - 3) * 1.5;
		}
		return result;
	}
}
