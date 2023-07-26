class TicketBooking{
	private int bookingId;
	private int noOfSeats;
	private String source;
	private String destination;
	private String timings;
	private int price;
	private String classType;
	private String transportType;
	private String transportName;
	
	public void setBookingId(int bookingId){
		this.bookingId = bookingId;
	}
	public int getBookingId(){
		return bookingId;
	}
	
	public void setNoOfSeats(int noOfSeats){
		this.noOfSeats = noOfSeats;
	}
	public int getNoOfSeats(){
		return noOfSeats;
	}
	
	public void setSource(String source){
		this.source = source;
	}
	public String getSource(){
		return source;
	}
	
	public void setDestination(String destination){
		this.destination = destination;
	}
	public String getDestination(){
		return destination;
	}
	
	public void setTimimgs(String timings){
		this.timings = timings;
	}
	public String getTimimgs(){
		return timings;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setClassType(String classType){
		this.classType = classType;
	}
	public String getClassType(){
		return classType;
	}
	
	public void setTransportType(String transportType){
		this.transportType = transportType;
	}
	public String getTransportType(){
		return transportType;
	}
	
	public void setTransportName(String transportName){
		this.transportName = transportName;
	}
	public String getTransportName(){
		return transportName;
	}
}