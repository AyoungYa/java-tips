package refactor.ch01.price;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/17.</p>
 */
public abstract class Price {
	public abstract int getPriceCode();
	
	public abstract double getCharge(int rentedDays);
	
	public int getFrequentRenterPoint(int rentedDays){
		return 1;
	}
}
