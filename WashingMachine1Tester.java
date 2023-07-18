class WashingMachine1Tester{

	public static void main(String args[]){
		System.out.println("Main Started");
		boolean connected = WashingMachine1.onOrOff();
		System.out.println("Is Washing machine connected" + connected);
		WashingMachine1.increaseTime();
		WashingMachine1.increaseTime();
		WashingMachine1.increaseTime();
		WashingMachine1.increaseTime();
		WashingMachine1.increaseTime();
		WashingMachine1.increaseTime();
		
		WashingMachine1.decreaseTime();
		WashingMachine1.decreaseTime();
		
		
		WashingMachine1.decreaseTime();
		WashingMachine1.decreaseTime();
		boolean connected1 = WashingMachine1.onOrOff();
		System.out.println("Is Washing machine connected" + connected1);
		
		
		
		System.out.println("Main ended");
	
	}



}