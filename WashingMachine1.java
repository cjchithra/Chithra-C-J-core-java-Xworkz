class WashingMachine1{
	static String name = "LG";					
	static int minTime ;
	static int maxTime= 30;
	static int currentTime = 15;
	static boolean isConnected ;
	
	public static boolean onOrOff(){
		
		System.out.println("Invoking onOrOff");
		System.out.println("Parameter" +0);
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Washing machine is turned on");
		} else if(isConnected == true){
			isConnected = false;
			System.out.println("The Washing machine is Turned off");
		}
		return isConnected;
		
	}
	public static void increaseTime(){
		System.out.println("start of increaseTime()");
		if(isConnected == true){
		if(currentTime < maxTime){
			currentTime = currentTime+ 1;
			System.out.println("The current Time is" + currentTime);
			
		}else{
			System.out.println("Max Time reached");
		}
		System.out.println("End of increaseTime");
		
		
	}else{
		System.out.println("Connect to Washing machine");
		
	}
	}
	public static void decreaseTime(){
		System.out.println("Invoking decreaseTime()");
		System.out.println("List of Paramter "+0);
		if(isConnected == true){
		if(currentTime > minTime){
			currentTime = currentTime - 1;
			System.out.println("The current time is" + currentTime);
			
		}else{
			System.out.println("Min Time reached");
		}
		
		
	}else{
		System.out.println("The Time is decreased");
		
	}
	System.out.println("End of decreased time");
	}
	
	
	
	
}