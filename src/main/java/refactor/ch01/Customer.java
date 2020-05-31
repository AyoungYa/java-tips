package refactor.ch01;

import java.util.Enumeration;
import java.util.Vector;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/17.</p>
 */
public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<>();
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void addRentals(Rental arg){
		rentals.add(arg);
	}
	
	public String getName(){
		return name;
	}
	
	public String statement(){
		Enumeration rentals = this.rentals.elements();
		String result = "Rental Record for " + name + "\n";
		
		while (rentals.hasMoreElements()){
			Rental each = (Rental) rentals.nextElement();
			result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
		}
		
		result += "Amount owed is " + getTotalAmount() + "\n";
		result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
		return result;
	}
	
	private double getTotalAmount(){
		double result = 0;
		Enumeration rentals = this.rentals.elements();
		while (rentals.hasMoreElements()){
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	private double getTotalFrequentRenterPoints(){
		double result = 0;
		Enumeration rentals = this.rentals.elements();
		while (rentals.hasMoreElements()){
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}
