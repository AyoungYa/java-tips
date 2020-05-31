package refactor.ch01;

import refactor.ch01.price.ChildrenPrice;
import refactor.ch01.price.NewReleasePrice;
import refactor.ch01.price.Price;
import refactor.ch01.price.RegularPrice;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/17.</p>
 */
public class Movie {
	public static final int CHILDREN    = 2;
	public static final int REGULAR     = 0;
	public static final int NEW_RELEASE = 1;
	
	private String title;
	private Price price;
	
	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}
	
	String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPriceCode() {
		return price.getPriceCode();
	}
	
	public void setPriceCode(int priceCode) {
		switch (priceCode){
			case REGULAR:
				this.price = new RegularPrice();
				break;
			case NEW_RELEASE:
				this.price = new NewReleasePrice();
				break;
			case CHILDREN:
				this.price = new ChildrenPrice();
				break;
			default:
				throw new IllegalArgumentException("Incorrect Price code");
		}
	}
	
	double getCharge(int rentedDays){
		return price.getCharge(rentedDays);
	}
	
	int getFrequentRenterPoints(int rentedDays){
		return price.getFrequentRenterPoint(rentedDays);
	}
}
