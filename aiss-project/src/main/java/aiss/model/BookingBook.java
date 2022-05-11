package aiss.model;

import java.util.ArrayList;
import java.util.List;

public class BookingBook {
	
	private List<Booking> bookings;
	
	
	public BookingBook() {	
	}
	
	protected void setBooking(List<Booking> b) {
		bookings = b;
	}
	
	public List<Booking> getBooking() {
		return bookings;
	}
	
	public Booking getBooking(String id) {
		if (bookings==null)
			return null;
		
		Booking booking =null;
		for(Booking b: bookings)
			if (b.getId().equals(id))
			{
				booking=b;
				break;
			}
		
		return booking;
	}
	
	public void addBooking(Booking b) {
		if (bookings==null)
			bookings = new ArrayList<Booking>();
		bookings.add(b);
	}
	
	public void deleteSong(Booking b) {
		bookings.remove(b);
	}
	
	public void deleteBooking(String id) {
		Booking b = getBooking(id);
		if (b!=null)
			bookings.remove(b);
	}

}
