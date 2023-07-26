class TicketBookingTester{
	public static void main(String args[]){
		TicketBooking booking = new TicketBooking();
		booking.setBookingId(20);
				
		TicketBooking booking1 = new TicketBooking();
		booking1.setNoOfSeats(60);
		
		TicketBooking booking2 = new TicketBooking();
		booking2.setSource("Mangalore");
				
		TicketBooking booking3 = new TicketBooking();
		booking3.setDestination("coorg");
				
		TicketBooking booking4 = new TicketBooking();
		booking4.setTimimgs("4AM");
		
		booking.setPrice(600);
		booking.setClassType("First class");
		booking.setTransportType("Railway");
		booking.setTransportName("RailRoad");
		System.out.println(booking.getBookingId() + " " + booking1.getNoOfSeats() + " " + booking2.getSource() + " " + booking3.getDestination() + " " + booking4.getTimimgs() + " " + booking.getPrice() + " " + booking.getClassType() + " " + booking.getTransportType() + " " + booking.getTransportName());
	}
}